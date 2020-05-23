package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentShaderSource extends js.Object {
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object FragmentShaderSource {
  @scala.inline
  def apply(
    fragmentShaderSource: String = null,
    renderState: typings.cesium.mod.RenderState = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    vertexShaderSource: String = null
  ): FragmentShaderSource = {
    val __obj = js.Dynamic.literal()
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.get.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentShaderSource]
  }
}

