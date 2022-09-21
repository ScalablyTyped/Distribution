package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomerManagedPolicyReferencesInPermissionSetResponse extends StObject {
  
  /**
    * Specifies the names and paths of the customer managed policies that you have attached to your permission set.
    */
  var CustomerManagedPolicyReferences: js.UndefOr[CustomerManagedPolicyReferenceList] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCustomerManagedPolicyReferencesInPermissionSetResponse {
  
  inline def apply(): ListCustomerManagedPolicyReferencesInPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomerManagedPolicyReferencesInPermissionSetResponse]
  }
  
  extension [Self <: ListCustomerManagedPolicyReferencesInPermissionSetResponse](x: Self) {
    
    inline def setCustomerManagedPolicyReferences(value: CustomerManagedPolicyReferenceList): Self = StObject.set(x, "CustomerManagedPolicyReferences", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedPolicyReferencesUndefined: Self = StObject.set(x, "CustomerManagedPolicyReferences", js.undefined)
    
    inline def setCustomerManagedPolicyReferencesVarargs(value: CustomerManagedPolicyReference*): Self = StObject.set(x, "CustomerManagedPolicyReferences", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
