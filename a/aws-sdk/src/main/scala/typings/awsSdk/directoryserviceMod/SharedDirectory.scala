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
  def apply(): SharedDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDirectory]
  }
  @scala.inline
  implicit class SharedDirectoryOps[Self <: SharedDirectory] (val x: Self) extends AnyVal {
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
    def setCreatedDateTime(value: CreatedDateTime): Self = this.set("CreatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("CreatedDateTime", js.undefined)
    @scala.inline
    def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = this.set("LastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("LastUpdatedDateTime", js.undefined)
    @scala.inline
    def setOwnerAccountId(value: CustomerId): Self = this.set("OwnerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("OwnerAccountId", js.undefined)
    @scala.inline
    def setOwnerDirectoryId(value: DirectoryId): Self = this.set("OwnerDirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerDirectoryId: Self = this.set("OwnerDirectoryId", js.undefined)
    @scala.inline
    def setShareMethod(value: ShareMethod): Self = this.set("ShareMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareMethod: Self = this.set("ShareMethod", js.undefined)
    @scala.inline
    def setShareNotes(value: Notes): Self = this.set("ShareNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareNotes: Self = this.set("ShareNotes", js.undefined)
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = this.set("ShareStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareStatus: Self = this.set("ShareStatus", js.undefined)
    @scala.inline
    def setSharedAccountId(value: CustomerId): Self = this.set("SharedAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedAccountId: Self = this.set("SharedAccountId", js.undefined)
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = this.set("SharedDirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDirectoryId: Self = this.set("SharedDirectoryId", js.undefined)
  }
  
}

