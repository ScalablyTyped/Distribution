package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantFlowEntitlementsResponse extends StObject {
  
  /**
    * The entitlements that were just granted.
    */
  var Entitlements: js.UndefOr[listOfEntitlement] = js.native
  
  /**
    * The ARN of the flow that these entitlements were granted to.
    */
  var FlowArn: js.UndefOr[string] = js.native
}
object GrantFlowEntitlementsResponse {
  
  @scala.inline
  def apply(): GrantFlowEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantFlowEntitlementsResponse]
  }
  
  @scala.inline
  implicit class GrantFlowEntitlementsResponseMutableBuilder[Self <: GrantFlowEntitlementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlements(value: listOfEntitlement): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    @scala.inline
    def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
