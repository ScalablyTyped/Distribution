package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GregorianDate extends js.Object {
  var day: scala.Double
  var hour: scala.Double
  var isLeapSecond: scala.Boolean
  var millisecond: scala.Double
  var minute: scala.Double
  var month: scala.Double
  var second: scala.Double
  var year: scala.Double
}

object GregorianDate {
  @scala.inline
  def apply(
    day: scala.Double,
    hour: scala.Double,
    isLeapSecond: scala.Boolean,
    millisecond: scala.Double,
    minute: scala.Double,
    month: scala.Double,
    second: scala.Double,
    year: scala.Double
  ): GregorianDate = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, isLeapSecond = isLeapSecond, millisecond = millisecond, minute = minute, month = month, second = second, year = year)
  
    __obj.asInstanceOf[GregorianDate]
  }
}

