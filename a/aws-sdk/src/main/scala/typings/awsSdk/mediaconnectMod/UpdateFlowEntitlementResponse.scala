package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowEntitlementResponse extends StObject {
  
  /**
    * The new configuration of the entitlement that you updated.
    */
  var Entitlement: js.UndefOr[typings.awsSdk.mediaconnectMod.Entitlement] = js.undefined
  
  /**
    * The ARN of the flow that this entitlement was granted on.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
}
object UpdateFlowEntitlementResponse {
  
  @scala.inline
  def apply(): UpdateFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowEntitlementResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowEntitlementResponseMutableBuilder[Self <: UpdateFlowEntitlementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlement(value: Entitlement): Self = StObject.set(x, "Entitlement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementUndefined: Self = StObject.set(x, "Entitlement", js.undefined)
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
