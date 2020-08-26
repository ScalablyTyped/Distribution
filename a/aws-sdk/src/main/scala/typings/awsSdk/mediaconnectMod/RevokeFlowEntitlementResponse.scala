package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeFlowEntitlementResponse extends js.Object {
  /**
    * The ARN of the entitlement that was revoked.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the flow that the entitlement was revoked from.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object RevokeFlowEntitlementResponse {
  @scala.inline
  def apply(): RevokeFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeFlowEntitlementResponse]
  }
  @scala.inline
  implicit class RevokeFlowEntitlementResponseOps[Self <: RevokeFlowEntitlementResponse] (val x: Self) extends AnyVal {
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
    def setEntitlementArn(value: string): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementArn: Self = this.set("EntitlementArn", js.undefined)
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
  }
  
}

