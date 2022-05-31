package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.webXRCameraMod.WebXRCamera
import typings.babylonjs.webXRInputSourceMod.IWebXRControllerOptions
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRInputMod {
  
  @JSImport("babylonjs/XR/webXRInput", "WebXRInput")
  @js.native
  class WebXRInput protected ()
    extends StObject
       with IDisposable {
    /**
      * Initializes the WebXRInput
      * @param xrSessionManager the xr session manager for this session
      * @param xrCamera the WebXR camera for this session. Mainly used for teleportation
      * @param options = initialization options for this xr input
      */
    def this(
      /**
      * the xr session manager for this session
      */
    xrSessionManager: WebXRSessionManager,
      /**
      * the WebXR camera for this session. Mainly used for teleportation
      */
    xrCamera: WebXRCamera
    ) = this()
    def this(
      /**
      * the xr session manager for this session
      */
    xrSessionManager: WebXRSessionManager,
      /**
      * the WebXR camera for this session. Mainly used for teleportation
      */
    xrCamera: WebXRCamera,
      options: IWebXRInputOptions
    ) = this()
    
    /* private */ var _addAndRemoveControllers: js.Any = js.native
    
    /* private */ var _frameObserver: js.Any = js.native
    
    /* private */ var _onInputSourcesChange: js.Any = js.native
    
    /* private */ var _sessionEndedObserver: js.Any = js.native
    
    /* private */ var _sessionInitObserver: js.Any = js.native
    
    /**
      * XR controllers being tracked
      */
    var controllers: js.Array[WebXRInputSource] = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Event when a controller has been connected/added
      */
    var onControllerAddedObservable: Observable[WebXRInputSource] = js.native
    
    /**
      * Event when a controller has been removed/disconnected
      */
    var onControllerRemovedObservable: Observable[WebXRInputSource] = js.native
    
    /* private */ val options: js.Any = js.native
    
    /**
      * the WebXR camera for this session. Mainly used for teleportation
      */
    var xrCamera: WebXRCamera = js.native
    
    /**
      * the xr session manager for this session
      */
    var xrSessionManager: WebXRSessionManager = js.native
  }
  
  trait IWebXRInputOptions extends StObject {
    
    /**
      * Optional options to pass to the controller. Will be overridden by the Input options where applicable
      */
    var controllerOptions: js.UndefOr[IWebXRControllerOptions] = js.undefined
    
    /**
      * A custom URL for the controllers repository
      */
    var customControllersRepositoryURL: js.UndefOr[String] = js.undefined
    
    /**
      * Should the controller model's components not move according to the user input
      */
    var disableControllerAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not send a request to the controller repository to load the profile.
      *
      * Instead, use the controllers available in babylon itself.
      */
    var disableOnlineControllerRepository: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true no model will be automatically loaded
      */
    var doNotLoadControllerMeshes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, this profile will be used for all controllers loaded (for example "microsoft-mixed-reality")
      * If not found, the xr input profile data will be used.
      * Profiles are defined here - https://github.com/immersive-web/webxr-input-profiles/
      */
    var forceInputProfile: js.UndefOr[String] = js.undefined
  }
  object IWebXRInputOptions {
    
    inline def apply(): IWebXRInputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRInputOptions]
    }
    
    extension [Self <: IWebXRInputOptions](x: Self) {
      
      inline def setControllerOptions(value: IWebXRControllerOptions): Self = StObject.set(x, "controllerOptions", value.asInstanceOf[js.Any])
      
      inline def setControllerOptionsUndefined: Self = StObject.set(x, "controllerOptions", js.undefined)
      
      inline def setCustomControllersRepositoryURL(value: String): Self = StObject.set(x, "customControllersRepositoryURL", value.asInstanceOf[js.Any])
      
      inline def setCustomControllersRepositoryURLUndefined: Self = StObject.set(x, "customControllersRepositoryURL", js.undefined)
      
      inline def setDisableControllerAnimation(value: Boolean): Self = StObject.set(x, "disableControllerAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableControllerAnimationUndefined: Self = StObject.set(x, "disableControllerAnimation", js.undefined)
      
      inline def setDisableOnlineControllerRepository(value: Boolean): Self = StObject.set(x, "disableOnlineControllerRepository", value.asInstanceOf[js.Any])
      
      inline def setDisableOnlineControllerRepositoryUndefined: Self = StObject.set(x, "disableOnlineControllerRepository", js.undefined)
      
      inline def setDoNotLoadControllerMeshes(value: Boolean): Self = StObject.set(x, "doNotLoadControllerMeshes", value.asInstanceOf[js.Any])
      
      inline def setDoNotLoadControllerMeshesUndefined: Self = StObject.set(x, "doNotLoadControllerMeshes", js.undefined)
      
      inline def setForceInputProfile(value: String): Self = StObject.set(x, "forceInputProfile", value.asInstanceOf[js.Any])
      
      inline def setForceInputProfileUndefined: Self = StObject.set(x, "forceInputProfile", js.undefined)
    }
  }
}
