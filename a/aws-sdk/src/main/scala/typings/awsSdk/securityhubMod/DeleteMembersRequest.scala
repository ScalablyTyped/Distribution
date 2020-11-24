package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMembersRequest extends js.Object {
  
  /**
    * The list of account IDs for the member accounts to delete.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}
object DeleteMembersRequest {
  
  @scala.inline
  def apply(): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  
  @scala.inline
  implicit class DeleteMembersRequestOps[Self <: DeleteMembersRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountIdsVarargs(value: NonEmptyString*): Self = this.set("AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIds: Self = this.set("AccountIds", js.undefined)
  }
}
