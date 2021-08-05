package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedActiveDirectoryAttributes extends StObject {
  
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[typings.awsSdk.fsxMod.DnsIps] = js.undefined
  
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined
  
  /**
    * The name of the domain group whose members have administrative privileges for the FSx file system.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.undefined
  
  /**
    * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which the Windows File Server instance is joined.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsSdk.fsxMod.OrganizationalUnitDistinguishedName] = js.undefined
  
  /**
    * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.undefined
}
object SelfManagedActiveDirectoryAttributes {
  
  inline def apply(): SelfManagedActiveDirectoryAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedActiveDirectoryAttributes]
  }
  
  extension [Self <: SelfManagedActiveDirectoryAttributes](x: Self) {
    
    inline def setDnsIps(value: DnsIps): Self = StObject.set(x, "DnsIps", value.asInstanceOf[js.Any])
    
    inline def setDnsIpsUndefined: Self = StObject.set(x, "DnsIps", js.undefined)
    
    inline def setDnsIpsVarargs(value: IpAddress*): Self = StObject.set(x, "DnsIps", js.Array(value :_*))
    
    inline def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setFileSystemAdministratorsGroup(value: FileSystemAdministratorsGroupName): Self = StObject.set(x, "FileSystemAdministratorsGroup", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAdministratorsGroupUndefined: Self = StObject.set(x, "FileSystemAdministratorsGroup", js.undefined)
    
    inline def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = StObject.set(x, "OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedName", js.undefined)
    
    inline def setUserName(value: DirectoryUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
