package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionPolicyResponse extends StObject {
  
  /**
    * The IAM policy that is attached to the specified rule group.
    */
  var Policy: js.UndefOr[PolicyString] = js.undefined
}
object GetPermissionPolicyResponse {
  
  inline def apply(): GetPermissionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionPolicyResponse]
  }
  
  extension [Self <: GetPermissionPolicyResponse](x: Self) {
    
    inline def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
