package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  val offset: stdLib.Float32Array
  val renderHeight: scala.Double
  val renderWidth: scala.Double
}

object VREyeParameters {
  @scala.inline
  def apply(
    fieldOfView: VRFieldOfView,
    offset: stdLib.Float32Array,
    renderHeight: scala.Double,
    renderWidth: scala.Double
  ): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView, offset = offset, renderHeight = renderHeight, renderWidth = renderWidth)
  
    __obj.asInstanceOf[VREyeParameters]
  }
}

