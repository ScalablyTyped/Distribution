package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedDirectory extends js.Object {
  /**
    * The date and time that the shared directory was created.
    */
  var CreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.CreatedDateTime] = js.native
  /**
    * The date and time that the shared directory was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.native
  /**
    * Identifier of the directory owner account, which contains the directory that has been shared to the consumer account.
    */
  var OwnerAccountId: js.UndefOr[CustomerId] = js.native
  /**
    * Identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareMethod] = js.native
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareStatus] = js.native
  /**
    * Identifier of the directory consumer account that has access to the shared directory (OwnerDirectoryId) in the directory owner account.
    */
  var SharedAccountId: js.UndefOr[CustomerId] = js.native
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}

object SharedDirectory {
  @scala.inline
  def apply(
    CreatedDateTime: CreatedDateTime = null,
    LastUpdatedDateTime: LastUpdatedDateTime = null,
    OwnerAccountId: CustomerId = null,
    OwnerDirectoryId: DirectoryId = null,
    ShareMethod: ShareMethod = null,
    ShareNotes: Notes = null,
    ShareStatus: ShareStatus = null,
    SharedAccountId: CustomerId = null,
    SharedDirectoryId: DirectoryId = null
  ): SharedDirectory = {
    val __obj = js.Dynamic.literal()
    if (CreatedDateTime != null) __obj.updateDynamic("CreatedDateTime")(CreatedDateTime.asInstanceOf[js.Any])
    if (LastUpdatedDateTime != null) __obj.updateDynamic("LastUpdatedDateTime")(LastUpdatedDateTime.asInstanceOf[js.Any])
    if (OwnerAccountId != null) __obj.updateDynamic("OwnerAccountId")(OwnerAccountId.asInstanceOf[js.Any])
    if (OwnerDirectoryId != null) __obj.updateDynamic("OwnerDirectoryId")(OwnerDirectoryId.asInstanceOf[js.Any])
    if (ShareMethod != null) __obj.updateDynamic("ShareMethod")(ShareMethod.asInstanceOf[js.Any])
    if (ShareNotes != null) __obj.updateDynamic("ShareNotes")(ShareNotes.asInstanceOf[js.Any])
    if (ShareStatus != null) __obj.updateDynamic("ShareStatus")(ShareStatus.asInstanceOf[js.Any])
    if (SharedAccountId != null) __obj.updateDynamic("SharedAccountId")(SharedAccountId.asInstanceOf[js.Any])
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDirectory]
  }
}

