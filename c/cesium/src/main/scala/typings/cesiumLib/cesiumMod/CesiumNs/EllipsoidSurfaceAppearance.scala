package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsoidSurfaceAppearance extends Appearance {
  val aboveGround: scala.Boolean
  val faceForward: scala.Boolean
  val flat: scala.Boolean
  val vertexFormat: VertexFormat
}

object EllipsoidSurfaceAppearance {
  @scala.inline
  def apply(
    aboveGround: scala.Boolean,
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
  ): EllipsoidSurfaceAppearance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aboveGround")(aboveGround)
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("faceForward")(faceForward)
    __obj.updateDynamic("flat")(flat)
    __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    __obj.updateDynamic("getFragmentShaderSource")(getFragmentShaderSource)
    __obj.updateDynamic("getRenderState")(getRenderState)
    __obj.updateDynamic("isTranslucent")(isTranslucent)
    __obj.updateDynamic("material")(material)
    __obj.updateDynamic("renderState")(renderState)
    __obj.updateDynamic("translucent")(translucent)
    __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[EllipsoidSurfaceAppearance]
  }
}

