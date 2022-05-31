package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Ground
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRBackgroundRemoverMod {
  
  @JSImport("babylonjs/XR/features/WebXRBackgroundRemover", "WebXRBackgroundRemover")
  @js.native
  class WebXRBackgroundRemover protected () extends WebXRAbstractFeature {
    /**
      * constructs a new background remover module
      * @param _xrSessionManager the session manager for this module
      * @param options read-only options to be used in this module
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * read-only options to be used in this module
      */
    options: IWebXRBackgroundRemoverOptions
    ) = this()
    
    /* private */ var _setBackgroundState: js.Any = js.native
    
    /**
      * registered observers will be triggered when the background state changes
      */
    var onBackgroundStateChangedObservable: Observable[Boolean] = js.native
    
    /**
      * read-only options to be used in this module
      */
    val options: IWebXRBackgroundRemoverOptions = js.native
  }
  /* static members */
  object WebXRBackgroundRemover {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRBackgroundRemover", "WebXRBackgroundRemover.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRBackgroundRemover", "WebXRBackgroundRemover.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRBackgroundRemoverOptions extends StObject {
    
    /**
      * Further background meshes to disable when entering AR
      */
    var backgroundMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
    
    /**
      * flags to configure the removal of the environment helper.
      * If not set, the entire background will be removed. If set, flags should be set as well.
      */
    var environmentHelperRemovalFlags: js.UndefOr[Ground] = js.undefined
    
    /**
      * don't disable the environment helper
      */
    var ignoreEnvironmentHelper: js.UndefOr[Boolean] = js.undefined
  }
  object IWebXRBackgroundRemoverOptions {
    
    inline def apply(): IWebXRBackgroundRemoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRBackgroundRemoverOptions]
    }
    
    extension [Self <: IWebXRBackgroundRemoverOptions](x: Self) {
      
      inline def setBackgroundMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "backgroundMeshes", value.asInstanceOf[js.Any])
      
      inline def setBackgroundMeshesUndefined: Self = StObject.set(x, "backgroundMeshes", js.undefined)
      
      inline def setBackgroundMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "backgroundMeshes", js.Array(value :_*))
      
      inline def setEnvironmentHelperRemovalFlags(value: Ground): Self = StObject.set(x, "environmentHelperRemovalFlags", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentHelperRemovalFlagsUndefined: Self = StObject.set(x, "environmentHelperRemovalFlags", js.undefined)
      
      inline def setIgnoreEnvironmentHelper(value: Boolean): Self = StObject.set(x, "ignoreEnvironmentHelper", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEnvironmentHelperUndefined: Self = StObject.set(x, "ignoreEnvironmentHelper", js.undefined)
    }
  }
}
