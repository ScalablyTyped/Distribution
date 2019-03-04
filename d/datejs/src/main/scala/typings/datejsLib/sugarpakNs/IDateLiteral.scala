package typings
package datejsLib.sugarpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateLiteral extends ITimeLiteral {
  var day: scala.Double
  var month: scala.Double
  var week: scala.Double
  var year: scala.Double
}

object IDateLiteral {
  @scala.inline
  def apply(
    day: scala.Double,
    hour: scala.Double,
    millisecond: scala.Double,
    minute: scala.Double,
    month: scala.Double,
    second: scala.Double,
    week: scala.Double,
    year: scala.Double
  ): IDateLiteral = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, millisecond = millisecond, minute = minute, month = month, second = second, week = week, year = year)
  
    __obj.asInstanceOf[IDateLiteral]
  }
}

