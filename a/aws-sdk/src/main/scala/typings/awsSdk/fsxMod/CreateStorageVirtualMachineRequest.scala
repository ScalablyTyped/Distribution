package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageVirtualMachineRequest extends StObject {
  
  /**
    * Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active Directory provides user authentication and access control for SMB clients, including Microsoft Windows and macOS client accessing the file system.
    */
  var ActiveDirectoryConfiguration: js.UndefOr[CreateSvmActiveDirectoryConfiguration] = js.undefined
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
  
  /**
    * The name of the SVM.
    */
  var Name: StorageVirtualMachineName
  
  /**
    * The security style of the root volume of the SVM. Specify one of the following values:    UNIX if the file system is managed by a UNIX administrator, the majority of users are NFS clients, and an application accessing the data uses a UNIX user as the service account.    NTFS if the file system is managed by a Windows administrator, the majority of users are SMB clients, and an application accessing the data uses a Windows user as the service account.    MIXED if the file system is managed by both UNIX and Windows administrators and users consist of both NFS and SMB clients.  
    */
  var RootVolumeSecurityStyle: js.UndefOr[StorageVirtualMachineRootVolumeSecurityStyle] = js.undefined
  
  /**
    * The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a password, you can still use the file system's fsxadmin user to manage the SVM.
    */
  var SvmAdminPassword: js.UndefOr[AdminPassword] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
}
object CreateStorageVirtualMachineRequest {
  
  inline def apply(FileSystemId: FileSystemId, Name: StorageVirtualMachineName): CreateStorageVirtualMachineRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageVirtualMachineRequest]
  }
  
  extension [Self <: CreateStorageVirtualMachineRequest](x: Self) {
    
    inline def setActiveDirectoryConfiguration(value: CreateSvmActiveDirectoryConfiguration): Self = StObject.set(x, "ActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "ActiveDirectoryConfiguration", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setName(value: StorageVirtualMachineName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeSecurityStyle(value: StorageVirtualMachineRootVolumeSecurityStyle): Self = StObject.set(x, "RootVolumeSecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeSecurityStyleUndefined: Self = StObject.set(x, "RootVolumeSecurityStyle", js.undefined)
    
    inline def setSvmAdminPassword(value: AdminPassword): Self = StObject.set(x, "SvmAdminPassword", value.asInstanceOf[js.Any])
    
    inline def setSvmAdminPasswordUndefined: Self = StObject.set(x, "SvmAdminPassword", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
