package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoliciesRequest extends js.Object {
  /**
    * The identity that is associated with the policy for which the policies will be listed. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
}

object ListIdentityPoliciesRequest {
  @scala.inline
  def apply(Identity: Identity): ListIdentityPoliciesRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoliciesRequest]
  }
}

