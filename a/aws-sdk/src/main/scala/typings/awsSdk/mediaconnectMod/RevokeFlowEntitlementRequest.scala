package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeFlowEntitlementRequest extends js.Object {
  /**
    * The ARN of the entitlement that you want to revoke.
    */
  var EntitlementArn: string = js.native
  /**
    * The flow that you want to revoke an entitlement from.
    */
  var FlowArn: string = js.native
}

object RevokeFlowEntitlementRequest {
  @scala.inline
  def apply(EntitlementArn: string, FlowArn: string): RevokeFlowEntitlementRequest = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevokeFlowEntitlementRequest]
  }
}

