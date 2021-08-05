package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeFlowEntitlementResponse extends StObject {
  
  /**
    * The ARN of the entitlement that was revoked.
    */
  var EntitlementArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the flow that the entitlement was revoked from.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
}
object RevokeFlowEntitlementResponse {
  
  inline def apply(): RevokeFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeFlowEntitlementResponse]
  }
  
  extension [Self <: RevokeFlowEntitlementResponse](x: Self) {
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
