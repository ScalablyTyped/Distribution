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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("hour")(hour)
    __obj.updateDynamic("millisecond")(millisecond)
    __obj.updateDynamic("minute")(minute)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("week")(week)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[IDateLiteral]
  }
}

