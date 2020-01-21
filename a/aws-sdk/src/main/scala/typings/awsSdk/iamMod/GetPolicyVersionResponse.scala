package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyVersionResponse extends js.Object {
  /**
    * A structure containing details about the policy version.
    */
  var PolicyVersion: js.UndefOr[typings.awsSdk.iamMod.PolicyVersion] = js.native
}

object GetPolicyVersionResponse {
  @scala.inline
  def apply(PolicyVersion: PolicyVersion = null): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyVersion != null) __obj.updateDynamic("PolicyVersion")(PolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
}

