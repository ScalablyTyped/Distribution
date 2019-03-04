package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugAppearance extends Appearance {
  val attributeName: java.lang.String
  val glslDatatype: java.lang.String
}

object DebugAppearance {
  @scala.inline
  def apply(
    attributeName: java.lang.String,
    closed: scala.Boolean,
    fragmentShaderSource: java.lang.String,
    getFragmentShaderSource: js.Function0[java.lang.String],
    getRenderState: js.Function0[js.Any],
    glslDatatype: java.lang.String,
    isTranslucent: js.Function0[scala.Boolean],
    material: Material,
    renderState: js.Any,
    translucent: scala.Boolean,
    vertexShaderSource: java.lang.String
  ): DebugAppearance = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, closed = closed, fragmentShaderSource = fragmentShaderSource, getFragmentShaderSource = getFragmentShaderSource, getRenderState = getRenderState, glslDatatype = glslDatatype, isTranslucent = isTranslucent, material = material, renderState = renderState, translucent = translucent, vertexShaderSource = vertexShaderSource)
  
    __obj.asInstanceOf[DebugAppearance]
  }
}

