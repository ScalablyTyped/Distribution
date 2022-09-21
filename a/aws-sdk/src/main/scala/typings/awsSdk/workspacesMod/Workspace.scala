package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  /**
    * The identifier of the bundle used to create the WorkSpace.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.undefined
  
  /**
    * The name of the WorkSpace, as seen by the operating system. The format of this name varies. For more information, see  Launch a WorkSpace. 
    */
  var ComputerName: js.UndefOr[typings.awsSdk.workspacesMod.ComputerName] = js.undefined
  
  /**
    * The identifier of the Directory Service directory for the WorkSpace.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.workspacesMod.DirectoryId] = js.undefined
  
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined
  
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * The IP address of the WorkSpace.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.workspacesMod.IpAddress] = js.undefined
  
  /**
    * The modification states of the WorkSpace.
    */
  var ModificationStates: js.UndefOr[ModificationStateList] = js.undefined
  
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The operational state of the WorkSpace.  After a WorkSpace is terminated, the TERMINATED state is returned only briefly before the WorkSpace directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated, check for the WorkSpace ID by using  DescribeWorkSpaces. If the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated. 
    */
  var State: js.UndefOr[WorkspaceState] = js.undefined
  
  /**
    * The identifier of the subnet for the WorkSpace.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.workspacesMod.SubnetId] = js.undefined
  
  /**
    * The user for the WorkSpace.
    */
  var UserName: js.UndefOr[typings.awsSdk.workspacesMod.UserName] = js.undefined
  
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The symmetric KMS key used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric KMS keys.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsSdk.workspacesMod.VolumeEncryptionKey] = js.undefined
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceId] = js.undefined
  
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceProperties] = js.undefined
}
object Workspace {
  
  inline def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  
  extension [Self <: Workspace](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    inline def setComputerNameUndefined: Self = StObject.set(x, "ComputerName", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setErrorCode(value: WorkspaceErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setModificationStates(value: ModificationStateList): Self = StObject.set(x, "ModificationStates", value.asInstanceOf[js.Any])
    
    inline def setModificationStatesUndefined: Self = StObject.set(x, "ModificationStates", js.undefined)
    
    inline def setModificationStatesVarargs(value: ModificationState*): Self = StObject.set(x, "ModificationStates", js.Array(value*))
    
    inline def setRootVolumeEncryptionEnabled(value: BooleanObject): Self = StObject.set(x, "RootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "RootVolumeEncryptionEnabled", js.undefined)
    
    inline def setState(value: WorkspaceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserVolumeEncryptionEnabled(value: BooleanObject): Self = StObject.set(x, "UserVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "UserVolumeEncryptionEnabled", js.undefined)
    
    inline def setVolumeEncryptionKey(value: VolumeEncryptionKey): Self = StObject.set(x, "VolumeEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setVolumeEncryptionKeyUndefined: Self = StObject.set(x, "VolumeEncryptionKey", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
    
    inline def setWorkspaceProperties(value: WorkspaceProperties): Self = StObject.set(x, "WorkspaceProperties", value.asInstanceOf[js.Any])
    
    inline def setWorkspacePropertiesUndefined: Self = StObject.set(x, "WorkspaceProperties", js.undefined)
  }
}
