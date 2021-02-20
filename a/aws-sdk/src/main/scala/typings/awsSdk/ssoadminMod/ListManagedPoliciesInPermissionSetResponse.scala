package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListManagedPoliciesInPermissionSetResponse extends StObject {
  
  /**
    * The array of the AttachedManagedPolicy data type object.
    */
  var AttachedManagedPolicies: js.UndefOr[AttachedManagedPolicyList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListManagedPoliciesInPermissionSetResponse {
  
  @scala.inline
  def apply(): ListManagedPoliciesInPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedPoliciesInPermissionSetResponse]
  }
  
  @scala.inline
  implicit class ListManagedPoliciesInPermissionSetResponseMutableBuilder[Self <: ListManagedPoliciesInPermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedManagedPolicies(value: AttachedManagedPolicyList): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AttachedManagedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
