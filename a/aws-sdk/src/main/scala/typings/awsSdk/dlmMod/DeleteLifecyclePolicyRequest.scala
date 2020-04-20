package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLifecyclePolicyRequest extends js.Object {
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsSdk.dlmMod.PolicyId = js.native
}

object DeleteLifecyclePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): DeleteLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyRequest]
  }
}

