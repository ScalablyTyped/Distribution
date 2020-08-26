package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccessPointPolicyRequest extends js.Object {
  /**
    * The AWS account ID for owner of the bucket associated with the specified access point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the access point that you want to associate with the specified policy.
    */
  var Name: AccessPointName = js.native
  /**
    * The policy that you want to apply to the specified access point. For more information about access point policies, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Policy: typings.awsSdk.s3controlMod.Policy = js.native
}

object PutAccessPointPolicyRequest {
  @scala.inline
  def apply(AccountId: AccountId, Name: AccessPointName, Policy: Policy): PutAccessPointPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessPointPolicyRequest]
  }
  @scala.inline
  implicit class PutAccessPointPolicyRequestOps[Self <: PutAccessPointPolicyRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
  }
  
}

