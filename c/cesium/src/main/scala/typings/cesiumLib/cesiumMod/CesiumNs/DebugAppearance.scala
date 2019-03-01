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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeName")(attributeName)
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    __obj.updateDynamic("getFragmentShaderSource")(getFragmentShaderSource)
    __obj.updateDynamic("getRenderState")(getRenderState)
    __obj.updateDynamic("glslDatatype")(glslDatatype)
    __obj.updateDynamic("isTranslucent")(isTranslucent)
    __obj.updateDynamic("material")(material)
    __obj.updateDynamic("renderState")(renderState)
    __obj.updateDynamic("translucent")(translucent)
    __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[DebugAppearance]
  }
}

