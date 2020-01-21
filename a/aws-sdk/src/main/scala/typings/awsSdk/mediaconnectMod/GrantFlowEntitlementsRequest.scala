package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantFlowEntitlementsRequest extends js.Object {
  /**
    * The list of entitlements that you want to grant.
    */
  var Entitlements: listOfGrantEntitlementRequest = js.native
  /**
    * The flow that you want to grant entitlements on.
    */
  var FlowArn: string = js.native
}

object GrantFlowEntitlementsRequest {
  @scala.inline
  def apply(Entitlements: listOfGrantEntitlementRequest, FlowArn: string): GrantFlowEntitlementsRequest = {
    val __obj = js.Dynamic.literal(Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GrantFlowEntitlementsRequest]
  }
}

