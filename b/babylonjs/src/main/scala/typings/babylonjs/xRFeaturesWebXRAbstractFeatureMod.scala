package typings.babylonjs

import typings.babylonjs.miscObservableMod.EventState
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.xRWebXRFeaturesManagerMod.IWebXRFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRAbstractFeatureMod {
  
  /* note: abstract class */ @JSImport("babylonjs/XR/features/WebXRAbstractFeature", "WebXRAbstractFeature")
  @js.native
  open class WebXRAbstractFeature protected ()
    extends StObject
       with IWebXRFeature {
    /**
      * Construct a new (abstract) WebXR feature
      * @param _xrSessionManager the xr session manager for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    
    /**
      * This is used to register callbacks that will automatically be removed when detach is called.
      * @param observable the observable to which the observer will be attached
      * @param callback the callback to register
      */
    /* protected */ def _addNewAttachObserver[T](
      observable: Observable[T],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]
    ): Unit = js.native
    
    /* private */ var _attached: Any = js.native
    
    /**
      * Code in this function will be executed on each xrFrame received from the browser.
      * This function will not execute after the feature is detached.
      * @param _xrFrame the current frame
      */
    /* protected */ def _onXRFrame(_xrFrame: XRFrame): Unit = js.native
    
    /* private */ var _removeOnDetach: Any = js.native
    
    /* protected */ var _xrSessionManager: WebXRSessionManager = js.native
    
    /**
      * Is this feature attached
      */
    @JSName("attached")
    def attached_MWebXRAbstractFeature: Boolean = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the native xr feature name (like anchor, hit-test, or hand-tracking)
      */
    @JSName("xrNativeFeatureName")
    var xrNativeFeatureName_WebXRAbstractFeature: String = js.native
  }
}
