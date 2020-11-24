package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDocumentPermissionRequest extends js.Object {
  
  /**
    * The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or All.
    */
  var AccountIdsToAdd: js.UndefOr[AccountIdList] = js.native
  
  /**
    * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a group of account IDs or All. This action has a higher priority than AccountIdsToAdd. If you specify an account ID to add and the same ID to remove, the system removes access to the document.
    */
  var AccountIdsToRemove: js.UndefOr[AccountIdList] = js.native
  
  /**
    * The name of the document that you want to share.
    */
  var Name: DocumentName = js.native
  
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType = js.native
  
  /**
    * (Optional) The version of the document to share. If it's not specified, the system choose the Default version to share.
    */
  var SharedDocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.SharedDocumentVersion] = js.native
}
object ModifyDocumentPermissionRequest {
  
  @scala.inline
  def apply(Name: DocumentName, PermissionType: DocumentPermissionType): ModifyDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDocumentPermissionRequest]
  }
  
  @scala.inline
  implicit class ModifyDocumentPermissionRequestOps[Self <: ModifyDocumentPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: DocumentName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionType(value: DocumentPermissionType): Self = this.set("PermissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsToAddVarargs(value: AccountId*): Self = this.set("AccountIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setAccountIdsToAdd(value: AccountIdList): Self = this.set("AccountIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdsToAdd: Self = this.set("AccountIdsToAdd", js.undefined)
    
    @scala.inline
    def setAccountIdsToRemoveVarargs(value: AccountId*): Self = this.set("AccountIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setAccountIdsToRemove(value: AccountIdList): Self = this.set("AccountIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdsToRemove: Self = this.set("AccountIdsToRemove", js.undefined)
    
    @scala.inline
    def setSharedDocumentVersion(value: SharedDocumentVersion): Self = this.set("SharedDocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedDocumentVersion: Self = this.set("SharedDocumentVersion", js.undefined)
  }
}
