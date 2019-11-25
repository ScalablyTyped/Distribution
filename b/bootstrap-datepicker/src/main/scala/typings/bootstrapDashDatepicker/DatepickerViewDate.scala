package typings.bootstrapDashDatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerViewDate extends js.Object {
  /** Day of the month starting with 1 */
  var day: Double
  /** Month starting with 0 */
  var month: Double
  var year: Double
}

object DatepickerViewDate {
  @scala.inline
  def apply(day: Double, month: Double, year: Double): DatepickerViewDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatepickerViewDate]
  }
}

