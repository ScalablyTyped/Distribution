package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyVersionsResponse extends StObject {
  
  /**
    * The policy versions.
    */
  var policyVersions: js.UndefOr[PolicyVersions] = js.undefined
}
object ListPolicyVersionsResponse {
  
  inline def apply(): ListPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyVersionsResponse]
  }
  
  extension [Self <: ListPolicyVersionsResponse](x: Self) {
    
    inline def setPolicyVersions(value: PolicyVersions): Self = StObject.set(x, "policyVersions", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionsUndefined: Self = StObject.set(x, "policyVersions", js.undefined)
    
    inline def setPolicyVersionsVarargs(value: PolicyVersion*): Self = StObject.set(x, "policyVersions", js.Array(value :_*))
  }
}
