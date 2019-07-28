package typings.cesium

import typings.cesium.cesiumMod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeName extends js.Object {
  var attributeName: String
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var glslDatatype: js.UndefOr[String] = js.undefined
  var renderState: js.UndefOr[RenderState] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object Anon_AttributeName {
  @scala.inline
  def apply(
    attributeName: String,
    fragmentShaderSource: String = null,
    glslDatatype: String = null,
    renderState: RenderState = null,
    vertexShaderSource: String = null
  ): Anon_AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName)
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    if (glslDatatype != null) __obj.updateDynamic("glslDatatype")(glslDatatype)
    if (renderState != null) __obj.updateDynamic("renderState")(renderState)
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[Anon_AttributeName]
  }
}

