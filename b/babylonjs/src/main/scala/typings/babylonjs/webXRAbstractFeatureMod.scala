package typings.babylonjs

import typings.babylonjs.observableMod.EventState
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRFeaturesManagerMod.IWebXRFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/features/WebXRAbstractFeature", JSImport.Namespace)
@js.native
object webXRAbstractFeatureMod extends js.Object {
  @js.native
  abstract class WebXRAbstractFeature protected () extends IWebXRFeature {
    /**
      * Construct a new (abstract) WebXR feature
      * @param _xrSessionManager the xr session manager for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    var _attached: js.Any = js.native
    var _removeOnDetach: js.Any = js.native
    var _xrSessionManager: WebXRSessionManager = js.native
    /**
      * This is used to register callbacks that will automatically be removed when detach is called.
      * @param observable the observable to which the observer will be attached
      * @param callback the callback to register
      */
    /* protected */ def _addNewAttachObserver[T](
      observable: Observable[T],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]
    ): Unit = js.native
    /**
      * Code in this function will be executed on each xrFrame received from the browser.
      * This function will not execute after the feature is detached.
      * @param _xrFrame the current frame
      */
    /* protected */ def _onXRFrame(_xrFrame: XRFrame): Unit = js.native
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
  }
  
}

