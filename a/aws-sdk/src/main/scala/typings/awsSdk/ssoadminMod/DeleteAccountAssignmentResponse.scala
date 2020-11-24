package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccountAssignmentResponse extends js.Object {
  
  /**
    * The status object for the account assignment deletion operation.
    */
  var AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.native
}
object DeleteAccountAssignmentResponse {
  
  @scala.inline
  def apply(): DeleteAccountAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountAssignmentResponse]
  }
  
  @scala.inline
  implicit class DeleteAccountAssignmentResponseOps[Self <: DeleteAccountAssignmentResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountAssignmentDeletionStatus(value: AccountAssignmentOperationStatus): Self = this.set("AccountAssignmentDeletionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAssignmentDeletionStatus: Self = this.set("AccountAssignmentDeletionStatus", js.undefined)
  }
}
