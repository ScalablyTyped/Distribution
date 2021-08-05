package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeFlowEntitlementRequest extends StObject {
  
  /**
    * The ARN of the entitlement that you want to revoke.
    */
  var EntitlementArn: string
  
  /**
    * The flow that you want to revoke an entitlement from.
    */
  var FlowArn: string
}
object RevokeFlowEntitlementRequest {
  
  inline def apply(EntitlementArn: string, FlowArn: string): RevokeFlowEntitlementRequest = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeFlowEntitlementRequest]
  }
  
  extension [Self <: RevokeFlowEntitlementRequest](x: Self) {
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
