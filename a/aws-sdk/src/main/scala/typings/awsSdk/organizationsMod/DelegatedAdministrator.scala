package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegatedAdministrator extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delegated administrator's account.
    */
  var Arn: js.UndefOr[AccountArn] = js.native
  /**
    * The date when the account was made a delegated administrator.
    */
  var DelegationEnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The email address that is associated with the delegated administrator's AWS account.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.native
  /**
    * The unique identifier (ID) of the delegated administrator's account.
    */
  var Id: js.UndefOr[AccountId] = js.native
  /**
    * The method by which the delegated administrator's account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.native
  /**
    * The date when the delegated administrator's account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The friendly name of the delegated administrator's account.
    */
  var Name: js.UndefOr[AccountName] = js.native
  /**
    * The status of the delegated administrator's account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.native
}

object DelegatedAdministrator {
  @scala.inline
  def apply(): DelegatedAdministrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdministrator]
  }
  @scala.inline
  implicit class DelegatedAdministratorOps[Self <: DelegatedAdministrator] (val x: Self) extends AnyVal {
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
    def setArn(value: AccountArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setDelegationEnabledDate(value: Timestamp): Self = this.set("DelegationEnabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegationEnabledDate: Self = this.set("DelegationEnabledDate", js.undefined)
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    @scala.inline
    def setId(value: AccountId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setJoinedMethod(value: AccountJoinedMethod): Self = this.set("JoinedMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinedMethod: Self = this.set("JoinedMethod", js.undefined)
    @scala.inline
    def setJoinedTimestamp(value: Timestamp): Self = this.set("JoinedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinedTimestamp: Self = this.set("JoinedTimestamp", js.undefined)
    @scala.inline
    def setName(value: AccountName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStatus(value: AccountStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

