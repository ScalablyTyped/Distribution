package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceRequest extends js.Object {
  
  /**
    * The identifier of the bundle for the WorkSpace. You can use DescribeWorkspaceBundles to list the available bundles.
    */
  var BundleId: typings.awsSdk.workspacesMod.BundleId = js.native
  
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace. You can use DescribeWorkspaceDirectories to list the available directories.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId = js.native
  
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The tags for the WorkSpace.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the AWS Directory Service directory for the WorkSpace.
    */
  var UserName: typings.awsSdk.workspacesMod.UserName = js.native
  
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsSdk.workspacesMod.VolumeEncryptionKey] = js.native
  
  /**
    * The WorkSpace properties.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceProperties] = js.native
}
object WorkspaceRequest {
  
  @scala.inline
  def apply(BundleId: BundleId, DirectoryId: DirectoryId, UserName: UserName): WorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceRequest]
  }
  
  @scala.inline
  implicit class WorkspaceRequestOps[Self <: WorkspaceRequest] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: BundleId): Self = this.set("BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootVolumeEncryptionEnabled(value: BooleanObject): Self = this.set("RootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootVolumeEncryptionEnabled: Self = this.set("RootVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUserVolumeEncryptionEnabled(value: BooleanObject): Self = this.set("UserVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVolumeEncryptionEnabled: Self = this.set("UserVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setVolumeEncryptionKey(value: VolumeEncryptionKey): Self = this.set("VolumeEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeEncryptionKey: Self = this.set("VolumeEncryptionKey", js.undefined)
    
    @scala.inline
    def setWorkspaceProperties(value: WorkspaceProperties): Self = this.set("WorkspaceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceProperties: Self = this.set("WorkspaceProperties", js.undefined)
  }
}
