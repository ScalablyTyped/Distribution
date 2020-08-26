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
  @scala.inline
  implicit class GrantFlowEntitlementsRequestOps[Self <: GrantFlowEntitlementsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntitlementsVarargs(value: GrantEntitlementRequest*): Self = this.set("Entitlements", js.Array(value :_*))
    @scala.inline
    def setEntitlements(value: listOfGrantEntitlementRequest): Self = this.set("Entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
  }
  
}

