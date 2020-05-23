package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthlySchedule extends js.Object {
  /**
    * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
    */
  var dayOfMonth: js.UndefOr[integer] = js.native
}

object MonthlySchedule {
  @scala.inline
  def apply(dayOfMonth: js.UndefOr[integer] = js.undefined): MonthlySchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dayOfMonth)) __obj.updateDynamic("dayOfMonth")(dayOfMonth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthlySchedule]
  }
}

