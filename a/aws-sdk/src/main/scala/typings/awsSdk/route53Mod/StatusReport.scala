package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReport extends js.Object {
  /**
    * The date and time that the health checker performed the health check in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var CheckedTime: js.UndefOr[TimeStamp] = js.native
  /**
    * A description of the status of the health check endpoint as reported by one of the Amazon Route 53 health checkers.
    */
  var Status: js.UndefOr[typings.awsSdk.route53Mod.Status] = js.native
}

object StatusReport {
  @scala.inline
  def apply(CheckedTime: TimeStamp = null, Status: Status = null): StatusReport = {
    val __obj = js.Dynamic.literal()
    if (CheckedTime != null) __obj.updateDynamic("CheckedTime")(CheckedTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReport]
  }
}

