package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteResourceShareCreatedFromPolicyRequest extends js.Object {
  /**
    * The ARN of the resource share to promote.
    */
  var resourceShareArn: String = js.native
}

object PromoteResourceShareCreatedFromPolicyRequest {
  @scala.inline
  def apply(resourceShareArn: String): PromoteResourceShareCreatedFromPolicyRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyRequest]
  }
}

