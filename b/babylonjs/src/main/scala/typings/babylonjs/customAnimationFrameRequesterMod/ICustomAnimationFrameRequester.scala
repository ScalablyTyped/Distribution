package typings.babylonjs.customAnimationFrameRequesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomAnimationFrameRequester extends js.Object {
  /**
    * This function will be called when the render loop is ready. If this is not populated, the engine's renderloop function will be called
    */
  var renderFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * Called to request the next frame to render to
    * @see https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame
    */
  var requestAnimationFrame: js.Function
  /**
    * You can pass this value to cancelAnimationFrame() to cancel the refresh callback request
    * @see https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame#Return_value
    */
  var requestID: js.UndefOr[Double] = js.undefined
}

object ICustomAnimationFrameRequester {
  @scala.inline
  def apply(
    requestAnimationFrame: js.Function,
    renderFunction: js.Function = null,
    requestID: js.UndefOr[Double] = js.undefined
  ): ICustomAnimationFrameRequester = {
    val __obj = js.Dynamic.literal(requestAnimationFrame = requestAnimationFrame.asInstanceOf[js.Any])
    if (renderFunction != null) __obj.updateDynamic("renderFunction")(renderFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(requestID)) __obj.updateDynamic("requestID")(requestID.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomAnimationFrameRequester]
  }
}

