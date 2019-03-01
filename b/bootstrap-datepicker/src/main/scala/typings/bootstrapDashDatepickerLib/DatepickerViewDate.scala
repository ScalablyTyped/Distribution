package typings
package bootstrapDashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerViewDate extends js.Object {
  /** Day of the month starting with 1 */
  var day: scala.Double
  /** Month starting with 0 */
  var month: scala.Double
  var year: scala.Double
}

object DatepickerViewDate {
  @scala.inline
  def apply(day: scala.Double, month: scala.Double, year: scala.Double): DatepickerViewDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DatepickerViewDate]
  }
}

