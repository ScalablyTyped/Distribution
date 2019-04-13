package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeName extends js.Object {
  var attributeName: java.lang.String
  var fragmentShaderSource: js.UndefOr[java.lang.String] = js.undefined
  var glslDatatype: js.UndefOr[java.lang.String] = js.undefined
  var renderState: js.UndefOr[cesiumLib.cesiumMod.RenderState] = js.undefined
  var vertexShaderSource: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AttributeName {
  @scala.inline
  def apply(
    attributeName: java.lang.String,
    fragmentShaderSource: java.lang.String = null,
    glslDatatype: java.lang.String = null,
    renderState: cesiumLib.cesiumMod.RenderState = null,
    vertexShaderSource: java.lang.String = null
  ): Anon_AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName)
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    if (glslDatatype != null) __obj.updateDynamic("glslDatatype")(glslDatatype)
    if (renderState != null) __obj.updateDynamic("renderState")(renderState)
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[Anon_AttributeName]
  }
}

