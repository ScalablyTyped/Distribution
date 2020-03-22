package typings.cesium

import typings.cesium.mod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlat extends js.Object {
  var closed: js.UndefOr[Boolean] = js.undefined
  var faceForward: js.UndefOr[Boolean] = js.undefined
  var flat: js.UndefOr[Boolean] = js.undefined
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var renderState: js.UndefOr[RenderState] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object AnonFlat {
  @scala.inline
  def apply(
    closed: js.UndefOr[Boolean] = js.undefined,
    faceForward: js.UndefOr[Boolean] = js.undefined,
    flat: js.UndefOr[Boolean] = js.undefined,
    fragmentShaderSource: String = null,
    renderState: RenderState = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    vertexShaderSource: String = null
  ): AnonFlat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlat]
  }
}

