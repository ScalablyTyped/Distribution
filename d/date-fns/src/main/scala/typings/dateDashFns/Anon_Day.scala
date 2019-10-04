package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  var day: js.Function
  var dayPeriod: js.Function
  var era: js.Function
  var month: js.Function
  var ordinalNumber: js.Function
  var quarter: js.Function
}

object Anon_Day {
  @scala.inline
  def apply(
    day: js.Function,
    dayPeriod: js.Function,
    era: js.Function,
    month: js.Function,
    ordinalNumber: js.Function,
    quarter: js.Function
  ): Anon_Day = {
    val __obj = js.Dynamic.literal(day = day, dayPeriod = dayPeriod, era = era, month = month, ordinalNumber = ordinalNumber, quarter = quarter)
  
    __obj.asInstanceOf[Anon_Day]
  }
}

