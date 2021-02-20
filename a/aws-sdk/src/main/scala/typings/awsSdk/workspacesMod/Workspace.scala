package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspace extends StObject {
  
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
  implicit class WorkspaceMutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerNameUndefined: Self = StObject.set(x, "ComputerName", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setErrorCode(value: WorkspaceErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setModificationStates(value: ModificationStateList): Self = StObject.set(x, "ModificationStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationStatesUndefined: Self = StObject.set(x, "ModificationStates", js.undefined)
    
    @scala.inline
    def setModificationStatesVarargs(value: ModificationState*): Self = StObject.set(x, "ModificationStates", js.Array(value :_*))
    
    @scala.inline
    def setRootVolumeEncryptionEnabled(value: BooleanObject): Self = StObject.set(x, "RootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "RootVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setState(value: WorkspaceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    @scala.inline
    def setUserVolumeEncryptionEnabled(value: BooleanObject): Self = StObject.set(x, "UserVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "UserVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setVolumeEncryptionKey(value: VolumeEncryptionKey): Self = StObject.set(x, "VolumeEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeEncryptionKeyUndefined: Self = StObject.set(x, "VolumeEncryptionKey", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
    
    @scala.inline
    def setWorkspaceProperties(value: WorkspaceProperties): Self = StObject.set(x, "WorkspaceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacePropertiesUndefined: Self = StObject.set(x, "WorkspaceProperties", js.undefined)
  }
}
