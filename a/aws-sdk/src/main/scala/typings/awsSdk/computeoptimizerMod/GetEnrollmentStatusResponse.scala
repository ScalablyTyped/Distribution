package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnrollmentStatusResponse extends js.Object {
  /**
    * Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.
    */
  var memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled] = js.native
  /**
    * The enrollment status of the account.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The reason for the enrollment status of the account. For example, an account might show a status of Pending because member accounts of an organization require more time to be enrolled in the service.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
}

object GetEnrollmentStatusResponse {
  @scala.inline
  def apply(
    memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled] = js.undefined,
    status: Status = null,
    statusReason: StatusReason = null
  ): GetEnrollmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(memberAccountsEnrolled)) __obj.updateDynamic("memberAccountsEnrolled")(memberAccountsEnrolled.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnrollmentStatusResponse]
  }
}

