package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportToCSVOption extends js.Object {
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.native
}

object ExportToCSVOption {
  @scala.inline
  def apply(AvailabilityStatus: DashboardBehavior = null): ExportToCSVOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityStatus != null) __obj.updateDynamic("AvailabilityStatus")(AvailabilityStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportToCSVOption]
  }
}

