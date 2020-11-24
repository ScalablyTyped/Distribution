package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListManagedPoliciesInPermissionSetResponse extends js.Object {
  
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
  implicit class ListManagedPoliciesInPermissionSetResponseOps[Self <: ListManagedPoliciesInPermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AttachedManagedPolicy*): Self = this.set("AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAttachedManagedPolicies(value: AttachedManagedPolicyList): Self = this.set("AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedManagedPolicies: Self = this.set("AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
