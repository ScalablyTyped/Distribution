package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the updated policy, showing the requested changes.
    */
  var Policy: js.UndefOr[typings.awsSdk.organizationsMod.Policy] = js.undefined
}
object UpdatePolicyResponse {
  
  inline def apply(): UpdatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePolicyResponse]
  }
  
  extension [Self <: UpdatePolicyResponse](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
