package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDocumentPermissionRequest extends StObject {
  
  /**
    * The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or All.
    */
  var AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a group of account IDs or All. This action has a higher priority than AccountIdsToAdd. If you specify an account ID to add and the same ID to remove, the system removes access to the document.
    */
  var AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * The name of the document that you want to share.
    */
  var Name: DocumentName
  
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType
  
  /**
    * (Optional) The version of the document to share. If it's not specified, the system choose the Default version to share.
    */
  var SharedDocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.SharedDocumentVersion] = js.undefined
}
object ModifyDocumentPermissionRequest {
  
  @scala.inline
  def apply(Name: DocumentName, PermissionType: DocumentPermissionType): ModifyDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDocumentPermissionRequest]
  }
  
  @scala.inline
  implicit class ModifyDocumentPermissionRequestMutableBuilder[Self <: ModifyDocumentPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIdsToAdd(value: AccountIdList): Self = StObject.set(x, "AccountIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsToAddUndefined: Self = StObject.set(x, "AccountIdsToAdd", js.undefined)
    
    @scala.inline
    def setAccountIdsToAddVarargs(value: AccountId*): Self = StObject.set(x, "AccountIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setAccountIdsToRemove(value: AccountIdList): Self = StObject.set(x, "AccountIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsToRemoveUndefined: Self = StObject.set(x, "AccountIdsToRemove", js.undefined)
    
    @scala.inline
    def setAccountIdsToRemoveVarargs(value: AccountId*): Self = StObject.set(x, "AccountIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionType(value: DocumentPermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDocumentVersion(value: SharedDocumentVersion): Self = StObject.set(x, "SharedDocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDocumentVersionUndefined: Self = StObject.set(x, "SharedDocumentVersion", js.undefined)
  }
}
