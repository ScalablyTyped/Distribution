package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeName extends js.Object {
  var attributeName: String
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var glslDatatype: js.UndefOr[String] = js.undefined
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object AttributeName {
  @scala.inline
  def apply(
    attributeName: String,
    fragmentShaderSource: String = null,
    glslDatatype: String = null,
    renderState: typings.cesium.mod.RenderState = null,
    vertexShaderSource: String = null
  ): AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (glslDatatype != null) __obj.updateDynamic("glslDatatype")(glslDatatype.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeName]
  }
}

