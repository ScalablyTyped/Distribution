package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountAssignmentsResponse extends js.Object {
  
  /**
    * The list of assignments that match the input AWS account and permission set.
    */
  var AccountAssignments: js.UndefOr[AccountAssignmentList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAccountAssignmentsResponse {
  
  @scala.inline
  def apply(): ListAccountAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentsResponse]
  }
  
  @scala.inline
  implicit class ListAccountAssignmentsResponseOps[Self <: ListAccountAssignmentsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountAssignmentsVarargs(value: AccountAssignment*): Self = this.set("AccountAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAccountAssignments(value: AccountAssignmentList): Self = this.set("AccountAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAssignments: Self = this.set("AccountAssignments", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
