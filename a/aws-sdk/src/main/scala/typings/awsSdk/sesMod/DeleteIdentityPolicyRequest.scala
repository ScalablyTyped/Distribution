package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIdentityPolicyRequest extends js.Object {
  /**
    * The identity that is associated with the policy that you want to delete. You can specify the identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
  /**
    * The name of the policy to be deleted.
    */
  var PolicyName: typings.awsSdk.sesMod.PolicyName = js.native
}

object DeleteIdentityPolicyRequest {
  @scala.inline
  def apply(Identity: Identity, PolicyName: PolicyName): DeleteIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIdentityPolicyRequest]
  }
}

