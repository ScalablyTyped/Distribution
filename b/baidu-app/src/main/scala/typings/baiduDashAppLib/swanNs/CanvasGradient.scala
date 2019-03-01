package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGradient extends js.Object {
  def addColorStop(index: scala.Double, color: java.lang.String): scala.Unit
}

object CanvasGradient {
  @scala.inline
  def apply(addColorStop: js.Function2[scala.Double, java.lang.String, scala.Unit]): CanvasGradient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addColorStop")(addColorStop)
    __obj.asInstanceOf[CanvasGradient]
  }
}

