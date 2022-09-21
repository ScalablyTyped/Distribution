package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsxProtocolSmb extends StObject {
  
  /**
    * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual machine (SVM) belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  var MountOptions: js.UndefOr[SmbMountOptions] = js.undefined
  
  /**
    * Specifies the password of a user who has permission to access your SVM.
    */
  var Password: SmbPassword
  
  /**
    * Specifies a user name that can mount the location and access the files, folders, and metadata that you need in the SVM. If you provide a user in your Active Directory, note the following:   If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon Web Services Delegated FSx Administrators group.   If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins group or a custom group that you specified for file system administration when you created your file system.   Make sure that the user has the permissions it needs to copy the data you want:    SE_TCB_NAME: Required to set object ownership and file metadata. With this privilege, you also can copy NTFS discretionary access lists (DACLs).    SE_SECURITY_NAME: May be needed to copy NTFS system access control lists (SACLs). This operation specifically requires the Windows privilege, which is granted to members of the Domain Admins group. If you configure your task to copy SACLs, make sure that the user has the required privileges. For information about copying SACLs, see Ownership and permissions-related options.  
    */
  var User: SmbUser
}
object FsxProtocolSmb {
  
  inline def apply(Password: SmbPassword, User: SmbUser): FsxProtocolSmb = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsxProtocolSmb]
  }
  
  extension [Self <: FsxProtocolSmb](x: Self) {
    
    inline def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setMountOptions(value: SmbMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    inline def setPassword(value: SmbPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
