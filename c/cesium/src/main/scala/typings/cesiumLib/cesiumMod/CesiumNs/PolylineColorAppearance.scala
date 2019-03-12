package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineColorAppearance extends Appearance {
  val vertexFormat: VertexFormat
}

object PolylineColorAppearance {
  @scala.inline
  def apply(
    closed: scala.Boolean,
    fragmentShaderSource: java.lang.String,
    getFragmentShaderSource: () => java.lang.String,
    getRenderState: () => js.Any,
    isTranslucent: () => scala.Boolean,
    material: Material,
    renderState: js.Any,
    translucent: scala.Boolean,
    vertexFormat: VertexFormat,
    vertexShaderSource: java.lang.String
  ): PolylineColorAppearance = {
    val __obj = js.Dynamic.literal(closed = closed, fragmentShaderSource = fragmentShaderSource, getFragmentShaderSource = js.Any.fromFunction0(getFragmentShaderSource), getRenderState = js.Any.fromFunction0(getRenderState), isTranslucent = js.Any.fromFunction0(isTranslucent), material = material, renderState = renderState, translucent = translucent, vertexFormat = vertexFormat, vertexShaderSource = vertexShaderSource)
  
    __obj.asInstanceOf[PolylineColorAppearance]
  }
}

