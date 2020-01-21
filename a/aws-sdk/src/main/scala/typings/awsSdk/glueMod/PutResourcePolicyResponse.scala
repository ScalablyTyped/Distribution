package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyResponse extends js.Object {
  /**
    * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or updates this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.native
}

object PutResourcePolicyResponse {
  @scala.inline
  def apply(PolicyHash: HashString = null): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyHash != null) __obj.updateDynamic("PolicyHash")(PolicyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
}

