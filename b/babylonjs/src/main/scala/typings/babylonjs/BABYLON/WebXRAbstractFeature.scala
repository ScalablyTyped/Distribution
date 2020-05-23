package typings.babylonjs.BABYLON

import typings.babylonjs.XRFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRAbstractFeature extends IWebXRFeature {
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
}

