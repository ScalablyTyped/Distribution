package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Name: DocumentName,
    PermissionType: DocumentPermissionType,
    AccountIdsToAdd: AccountIdList = null,
    AccountIdsToRemove: AccountIdList = null,
    SharedDocumentVersion: SharedDocumentVersion = null
  ): ModifyDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    if (AccountIdsToAdd != null) __obj.updateDynamic("AccountIdsToAdd")(AccountIdsToAdd.asInstanceOf[js.Any])
    if (AccountIdsToRemove != null) __obj.updateDynamic("AccountIdsToRemove")(AccountIdsToRemove.asInstanceOf[js.Any])
    if (SharedDocumentVersion != null) __obj.updateDynamic("SharedDocumentVersion")(SharedDocumentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDocumentPermissionRequest]
  }
}

