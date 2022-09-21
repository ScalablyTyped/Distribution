package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  /**
    * The JSON blob that describes the policy.
    */
  var policyDocument: Policy
  
  /**
    * The ID of the resource policy.
    */
  var policyId: PolicyId
  
  /**
    * The Amazon Web Services Region that policy allows resources to be used in.
    */
  var ramResourceShareRegion: String
}
object ResourcePolicy {
  
  inline def apply(policyDocument: Policy, policyId: PolicyId, ramResourceShareRegion: String): ResourcePolicy = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyId = policyId.asInstanceOf[js.Any], ramResourceShareRegion = ramResourceShareRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  extension [Self <: ResourcePolicy](x: Self) {
    
    inline def setPolicyDocument(value: Policy): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
    
    inline def setRamResourceShareRegion(value: String): Self = StObject.set(x, "ramResourceShareRegion", value.asInstanceOf[js.Any])
  }
}
