package typings.bulmaCalendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndDate extends js.Object {
  var endDate: js.UndefOr[Date] = js.undefined
  var startDate: Date
}

object AnonEndDate {
  @scala.inline
  def apply(startDate: Date, endDate: Date = null): AnonEndDate = {
    val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndDate]
  }
}

