package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyResponse extends js.Object {
  /**
    * The new policy.
    */
  var resourcePolicy: js.UndefOr[ResourcePolicy] = js.native
}

object PutResourcePolicyResponse {
  @scala.inline
  def apply(resourcePolicy: ResourcePolicy = null): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicy != null) __obj.updateDynamic("resourcePolicy")(resourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
}

