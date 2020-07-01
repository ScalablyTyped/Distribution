package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnrollmentStatusRequest extends js.Object {
  /**
    * Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.native
  /**
    * The new enrollment status of the account. Accepted options are Active or Inactive. You will get an error if Pending or Failed are specified.
    */
  var status: Status = js.native
}

object UpdateEnrollmentStatusRequest {
  @scala.inline
  def apply(status: Status, includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined): UpdateEnrollmentStatusRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMemberAccounts)) __obj.updateDynamic("includeMemberAccounts")(includeMemberAccounts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnrollmentStatusRequest]
  }
}

