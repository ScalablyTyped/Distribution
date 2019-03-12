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
    getFragmentShaderSource: () => java.lang.String,
    getRenderState: () => js.Any,
    glslDatatype: java.lang.String,
    isTranslucent: () => scala.Boolean,
    material: Material,
    renderState: js.Any,
    translucent: scala.Boolean,
    vertexShaderSource: java.lang.String
  ): DebugAppearance = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, closed = closed, fragmentShaderSource = fragmentShaderSource, getFragmentShaderSource = js.Any.fromFunction0(getFragmentShaderSource), getRenderState = js.Any.fromFunction0(getRenderState), glslDatatype = glslDatatype, isTranslucent = js.Any.fromFunction0(isTranslucent), material = material, renderState = renderState, translucent = translucent, vertexShaderSource = vertexShaderSource)
  
    __obj.asInstanceOf[DebugAppearance]
  }
}

