package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPolicyResponse extends StObject {
  
  /**
    * A key policy document in JSON format.
    */
  var Policy: js.UndefOr[PolicyType] = js.undefined
}
object GetKeyPolicyResponse {
  
  inline def apply(): GetKeyPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPolicyResponse]
  }
  
  extension [Self <: GetKeyPolicyResponse](x: Self) {
    
    inline def setPolicy(value: PolicyType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
