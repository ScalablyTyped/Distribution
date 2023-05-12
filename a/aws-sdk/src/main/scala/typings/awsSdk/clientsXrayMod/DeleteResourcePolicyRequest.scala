package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The name of the resource policy to delete.
    */
  var PolicyName: typings.awsSdk.clientsXrayMod.PolicyName
  
  /**
    * Specifies a specific policy revision to delete. Provide a PolicyRevisionId to ensure an atomic delete operation. If the provided revision id does not match the latest policy revision id, an InvalidPolicyRevisionIdException exception is returned. 
    */
  var PolicyRevisionId: js.UndefOr[typings.awsSdk.clientsXrayMod.PolicyRevisionId] = js.undefined
}
object DeleteResourcePolicyRequest {
  
  inline def apply(PolicyName: PolicyName): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionId(value: PolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
  }
}
