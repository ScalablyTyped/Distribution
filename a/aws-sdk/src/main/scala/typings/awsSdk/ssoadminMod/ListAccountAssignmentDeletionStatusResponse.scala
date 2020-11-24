package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountAssignmentDeletionStatusResponse extends js.Object {
  
  /**
    * The status object for the account assignment deletion operation.
    */
  var AccountAssignmentsDeletionStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAccountAssignmentDeletionStatusResponse {
  
  @scala.inline
  def apply(): ListAccountAssignmentDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentDeletionStatusResponse]
  }
  
  @scala.inline
  implicit class ListAccountAssignmentDeletionStatusResponseOps[Self <: ListAccountAssignmentDeletionStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountAssignmentsDeletionStatusVarargs(value: AccountAssignmentOperationStatusMetadata*): Self = this.set("AccountAssignmentsDeletionStatus", js.Array(value :_*))
    
    @scala.inline
    def setAccountAssignmentsDeletionStatus(value: AccountAssignmentOperationStatusList): Self = this.set("AccountAssignmentsDeletionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAssignmentsDeletionStatus: Self = this.set("AccountAssignmentsDeletionStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
