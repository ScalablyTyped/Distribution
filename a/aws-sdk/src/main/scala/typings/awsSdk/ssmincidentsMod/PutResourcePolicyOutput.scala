package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyOutput extends StObject {
  
  /**
    * The ID of the resource policy.
    */
  var policyId: PolicyId
}
object PutResourcePolicyOutput {
  
  inline def apply(policyId: PolicyId): PutResourcePolicyOutput = {
    val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyOutput]
  }
  
  extension [Self <: PutResourcePolicyOutput](x: Self) {
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
  }
}
