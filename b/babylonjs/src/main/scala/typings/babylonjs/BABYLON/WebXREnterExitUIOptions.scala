package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXREnterExitUIOptions extends js.Object {
  /**
    * User provided buttons to enable/disable WebXR. The system will provide default if not set
    */
  var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.undefined
  /**
    * A reference space type to use when creating the default button.
    * Default is local-floor
    */
  var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.undefined
  /**
    * Context to enter xr with
    */
  var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.undefined
  /**
    * A session mode to use when creating the default button.
    * Default is immersive-vr
    */
  var sessionMode: js.UndefOr[XRSessionMode] = js.undefined
}

object WebXREnterExitUIOptions {
  @scala.inline
  def apply(
    customButtons: js.Array[WebXREnterExitUIButton] = null,
    referenceSpaceType: XRReferenceSpaceType = null,
    renderTarget: js.UndefOr[Null | Nullable[WebXRRenderTarget]] = js.undefined,
    sessionMode: XRSessionMode = null
  ): WebXREnterExitUIOptions = {
    val __obj = js.Dynamic.literal()
    if (customButtons != null) __obj.updateDynamic("customButtons")(customButtons.asInstanceOf[js.Any])
    if (referenceSpaceType != null) __obj.updateDynamic("referenceSpaceType")(referenceSpaceType.asInstanceOf[js.Any])
    if (!js.isUndefined(renderTarget)) __obj.updateDynamic("renderTarget")(renderTarget.asInstanceOf[js.Any])
    if (sessionMode != null) __obj.updateDynamic("sessionMode")(sessionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXREnterExitUIOptions]
  }
}

