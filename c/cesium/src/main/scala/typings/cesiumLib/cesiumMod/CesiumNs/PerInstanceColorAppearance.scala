package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerInstanceColorAppearance extends Appearance {
  val faceForward: scala.Boolean
  val flat: scala.Boolean
  val vertexFormat: VertexFormat
}

object PerInstanceColorAppearance {
  @scala.inline
  def apply(
    closed: scala.Boolean,
    faceForward: scala.Boolean,
    flat: scala.Boolean,
    fragmentShaderSource: java.lang.String,
    getFragmentShaderSource: js.Function0[java.lang.String],
    getRenderState: js.Function0[js.Any],
    isTranslucent: js.Function0[scala.Boolean],
    material: Material,
    renderState: js.Any,
    translucent: scala.Boolean,
    vertexFormat: VertexFormat,
    vertexShaderSource: java.lang.String
  ): PerInstanceColorAppearance = {
    val __obj = js.Dynamic.literal(closed = closed, faceForward = faceForward, flat = flat, fragmentShaderSource = fragmentShaderSource, getFragmentShaderSource = getFragmentShaderSource, getRenderState = getRenderState, isTranslucent = isTranslucent, material = material, renderState = renderState, translucent = translucent, vertexFormat = vertexFormat, vertexShaderSource = vertexShaderSource)
  
    __obj.asInstanceOf[PerInstanceColorAppearance]
  }
}

