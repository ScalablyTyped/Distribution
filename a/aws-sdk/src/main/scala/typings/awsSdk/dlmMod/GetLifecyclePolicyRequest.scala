package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePolicyRequest extends js.Object {
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsSdk.dlmMod.PolicyId = js.native
}

object GetLifecyclePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLifecyclePolicyRequest]
  }
}

