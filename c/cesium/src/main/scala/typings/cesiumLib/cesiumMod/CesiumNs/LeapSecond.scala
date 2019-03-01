package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeapSecond extends js.Object {
  var julianDate: JulianDate
  var offset: scala.Double
}

object LeapSecond {
  @scala.inline
  def apply(julianDate: JulianDate, offset: scala.Double): LeapSecond = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("julianDate")(julianDate)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[LeapSecond]
  }
}

