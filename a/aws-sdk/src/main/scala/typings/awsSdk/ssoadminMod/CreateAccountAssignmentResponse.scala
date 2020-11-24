package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountAssignmentResponse extends js.Object {
  
  /**
    * The status object for the account assignment creation operation.
    */
  var AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.native
}
object CreateAccountAssignmentResponse {
  
  @scala.inline
  def apply(): CreateAccountAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountAssignmentResponse]
  }
  
  @scala.inline
  implicit class CreateAccountAssignmentResponseOps[Self <: CreateAccountAssignmentResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountAssignmentCreationStatus(value: AccountAssignmentOperationStatus): Self = this.set("AccountAssignmentCreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAssignmentCreationStatus: Self = this.set("AccountAssignmentCreationStatus", js.undefined)
  }
}
