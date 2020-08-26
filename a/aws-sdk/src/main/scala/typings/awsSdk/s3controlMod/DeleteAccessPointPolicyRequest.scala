package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccessPointPolicyRequest extends js.Object {
  /**
    * The account ID for the account that owns the specified access point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the access point whose policy you want to delete.
    */
  var Name: AccessPointName = js.native
}

object DeleteAccessPointPolicyRequest {
  @scala.inline
  def apply(AccountId: AccountId, Name: AccessPointName): DeleteAccessPointPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPointPolicyRequest]
  }
  @scala.inline
  implicit class DeleteAccessPointPolicyRequestOps[Self <: DeleteAccessPointPolicyRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AccessPointName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

