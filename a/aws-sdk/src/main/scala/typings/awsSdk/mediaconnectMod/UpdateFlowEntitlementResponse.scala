package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowEntitlementResponse extends js.Object {
  
  /**
    * The new configuration of the entitlement that you updated.
    */
  var Entitlement: js.UndefOr[typings.awsSdk.mediaconnectMod.Entitlement] = js.native
  
  /**
    * The ARN of the flow that this entitlement was granted on.
    */
  var FlowArn: js.UndefOr[string] = js.native
}
object UpdateFlowEntitlementResponse {
  
  @scala.inline
  def apply(): UpdateFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowEntitlementResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowEntitlementResponseOps[Self <: UpdateFlowEntitlementResponse] (val x: Self) extends AnyVal {
    
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
    def setEntitlement(value: Entitlement): Self = this.set("Entitlement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitlement: Self = this.set("Entitlement", js.undefined)
    
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
  }
}
