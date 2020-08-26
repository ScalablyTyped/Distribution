package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersRequest extends js.Object {
  /**
    * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty account.
    */
  var AccountDetails: typings.awsSdk.guarddutyMod.AccountDetails = js.native
  /**
    * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object CreateMembersRequest {
  @scala.inline
  def apply(AccountDetails: AccountDetails, DetectorId: DetectorId): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountDetails = AccountDetails.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
  @scala.inline
  implicit class CreateMembersRequestOps[Self <: CreateMembersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountDetailsVarargs(value: AccountDetail*): Self = this.set("AccountDetails", js.Array(value :_*))
    @scala.inline
    def setAccountDetails(value: AccountDetails): Self = this.set("AccountDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
  }
  
}

