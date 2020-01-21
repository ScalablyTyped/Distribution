package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionResponse extends js.Object {
  /**
    * A structure containing details about the new policy version.
    */
  var PolicyVersion: js.UndefOr[typings.awsSdk.iamMod.PolicyVersion] = js.native
}

object CreatePolicyVersionResponse {
  @scala.inline
  def apply(PolicyVersion: PolicyVersion = null): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyVersion != null) __obj.updateDynamic("PolicyVersion")(PolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
}

