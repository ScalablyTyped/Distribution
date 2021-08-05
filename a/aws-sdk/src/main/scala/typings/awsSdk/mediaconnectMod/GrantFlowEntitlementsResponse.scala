package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantFlowEntitlementsResponse extends StObject {
  
  /**
    * The entitlements that were just granted.
    */
  var Entitlements: js.UndefOr[listOfEntitlement] = js.undefined
  
  /**
    * The ARN of the flow that these entitlements were granted to.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
}
object GrantFlowEntitlementsResponse {
  
  inline def apply(): GrantFlowEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantFlowEntitlementsResponse]
  }
  
  extension [Self <: GrantFlowEntitlementsResponse](x: Self) {
    
    inline def setEntitlements(value: listOfEntitlement): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
