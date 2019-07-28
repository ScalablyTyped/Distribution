package typings.datejs.sugarpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateLiteral extends ITimeLiteral {
  var day: Double
  var month: Double
  var week: Double
  var year: Double
}

object IDateLiteral {
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    millisecond: Double,
    minute: Double,
    month: Double,
    second: Double,
    week: Double,
    year: Double
  ): IDateLiteral = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, millisecond = millisecond, minute = minute, month = month, second = second, week = week, year = year)
  
    __obj.asInstanceOf[IDateLiteral]
  }
}

