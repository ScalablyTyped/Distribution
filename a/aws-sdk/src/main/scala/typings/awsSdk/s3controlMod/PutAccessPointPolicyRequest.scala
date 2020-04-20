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
}

