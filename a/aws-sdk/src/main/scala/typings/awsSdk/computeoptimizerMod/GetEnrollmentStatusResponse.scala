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
  def apply(): GetEnrollmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnrollmentStatusResponse]
  }
  @scala.inline
  implicit class GetEnrollmentStatusResponseOps[Self <: GetEnrollmentStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMemberAccountsEnrolled(value: MemberAccountsEnrolled): Self = this.set("memberAccountsEnrolled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberAccountsEnrolled: Self = this.set("memberAccountsEnrolled", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusReason(value: StatusReason): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
  }
  
}

