package typings.cesium

import typings.cesium.mod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributeName extends js.Object {
  var attributeName: String
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var glslDatatype: js.UndefOr[String] = js.undefined
  var renderState: js.UndefOr[RenderState] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object AnonAttributeName {
  @scala.inline
  def apply(
    attributeName: String,
    fragmentShaderSource: String = null,
    glslDatatype: String = null,
    renderState: RenderState = null,
    vertexShaderSource: String = null
  ): AnonAttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (glslDatatype != null) __obj.updateDynamic("glslDatatype")(glslDatatype.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeName]
  }
}

