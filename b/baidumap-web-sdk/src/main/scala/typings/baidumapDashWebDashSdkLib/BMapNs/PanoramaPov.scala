package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaPov extends js.Object {
  var heading: scala.Double
  var pitch: scala.Double
}

object PanoramaPov {
  @scala.inline
  def apply(heading: scala.Double, pitch: scala.Double): PanoramaPov = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("pitch")(pitch)
    __obj.asInstanceOf[PanoramaPov]
  }
}

