package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspace extends js.Object {
  
  /**
    * The identifier of the bundle used to create the WorkSpace.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.native
  
  /**
    * The name of the WorkSpace, as seen by the operating system. The format of this name varies. For more information, see  Launch a WorkSpace. 
    */
  var ComputerName: js.UndefOr[typings.awsSdk.workspacesMod.ComputerName] = js.native
  
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.workspacesMod.DirectoryId] = js.native
  
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.native
  
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  
  /**
    * The IP address of the WorkSpace.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.workspacesMod.IpAddress] = js.native
  
  /**
    * The modification states of the WorkSpace.
    */
  var ModificationStates: js.UndefOr[ModificationStateList] = js.native
  
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The operational state of the WorkSpace.  After a WorkSpace is terminated, the TERMINATED state is returned only briefly before the WorkSpace directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated, check for the WorkSpace ID by using  DescribeWorkSpaces. If the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated. 
    */
  var State: js.UndefOr[WorkspaceState] = js.native
  
  /**
    * The identifier of the subnet for the WorkSpace.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.workspacesMod.SubnetId] = js.native
  
  /**
    * The user for the WorkSpace.
    */
  var UserName: js.UndefOr[typings.awsSdk.workspacesMod.UserName] = js.native
  
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsSdk.workspacesMod.VolumeEncryptionKey] = js.native
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceId] = js.native
  
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceProperties] = js.native
}
object Workspace {
  
  @scala.inline
  def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  
  @scala.inline
  implicit class WorkspaceOps[Self <: Workspace] (val x: Self) extends AnyVal {
    
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
    def deleteBundleId: Self = this.set("BundleId", js.undefined)
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = this.set("ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputerName: Self = this.set("ComputerName", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    
    @scala.inline
    def setErrorCode(value: WorkspaceErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Description): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    
    @scala.inline
    def setModificationStatesVarargs(value: ModificationState*): Self = this.set("ModificationStates", js.Array(value :_*))
    
    @scala.inline
    def setModificationStates(value: ModificationStateList): Self = this.set("ModificationStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModificationStates: Self = this.set("ModificationStates", js.undefined)
    
    @scala.inline
    def setRootVolumeEncryptionEnabled(value: BooleanObject): Self = this.set("RootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootVolumeEncryptionEnabled: Self = this.set("RootVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setState(value: WorkspaceState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
    
    @scala.inline
    def setUserVolumeEncryptionEnabled(value: BooleanObject): Self = this.set("UserVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVolumeEncryptionEnabled: Self = this.set("UserVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setVolumeEncryptionKey(value: VolumeEncryptionKey): Self = this.set("VolumeEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeEncryptionKey: Self = this.set("VolumeEncryptionKey", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = this.set("WorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("WorkspaceId", js.undefined)
    
    @scala.inline
    def setWorkspaceProperties(value: WorkspaceProperties): Self = this.set("WorkspaceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceProperties: Self = this.set("WorkspaceProperties", js.undefined)
  }
}
