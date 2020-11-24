package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountAssignmentCreationStatusResponse extends js.Object {
  
  /**
    * The status object for the account assignment creation operation.
    */
  var AccountAssignmentsCreationStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAccountAssignmentCreationStatusResponse {
  
  @scala.inline
  def apply(): ListAccountAssignmentCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentCreationStatusResponse]
  }
  
  @scala.inline
  implicit class ListAccountAssignmentCreationStatusResponseOps[Self <: ListAccountAssignmentCreationStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountAssignmentsCreationStatusVarargs(value: AccountAssignmentOperationStatusMetadata*): Self = this.set("AccountAssignmentsCreationStatus", js.Array(value :_*))
    
    @scala.inline
    def setAccountAssignmentsCreationStatus(value: AccountAssignmentOperationStatusList): Self = this.set("AccountAssignmentsCreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAssignmentsCreationStatus: Self = this.set("AccountAssignmentsCreationStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
