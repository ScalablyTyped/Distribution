package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelfManagedActiveDirectoryConfiguration extends js.Object {
  
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being created, or in the private IP version 4 (IPv4) address ranges, as specified in RFC 1918:   10.0.0.0 - 10.255.255.255 (10/8 prefix)   172.16.0.0 - 172.31.255.255 (172.16/12 prefix)   192.168.0.0 - 192.168.255.255 (192.168/16 prefix)  
    */
  var DnsIps: typings.awsSdk.fsxMod.DnsIps = js.native
  
  /**
    * The fully qualified domain name of the self-managed AD directory, such as corp.example.com.
    */
  var DomainName: ActiveDirectoryFullyQualifiedName = js.native
  
  /**
    * (Optional) The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, setting audit controls (audit ACLs) on files and folders, and administering the file system remotely by using the FSx Remote PowerShell. The group that you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is used.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.native
  
  /**
    * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent of the file system. An example is OU=FSx,DC=yourdomain,DC=corp,DC=com. To learn more, see RFC 2253. If none is provided, the FSx file system is created in the default location of your self-managed AD directory.   Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating. 
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsSdk.fsxMod.OrganizationalUnitDistinguishedName] = js.native
  
  /**
    * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var Password: DirectoryPassword = js.native
  
  /**
    * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain. This account must have the permission to join computers to the domain in the organizational unit provided in OrganizationalUnitDistinguishedName, or in the default location of your AD domain.
    */
  var UserName: DirectoryUserName = js.native
}
object SelfManagedActiveDirectoryConfiguration {
  
  @scala.inline
  def apply(
    DnsIps: DnsIps,
    DomainName: ActiveDirectoryFullyQualifiedName,
    Password: DirectoryPassword,
    UserName: DirectoryUserName
  ): SelfManagedActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal(DnsIps = DnsIps.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfManagedActiveDirectoryConfiguration]
  }
  
  @scala.inline
  implicit class SelfManagedActiveDirectoryConfigurationOps[Self <: SelfManagedActiveDirectoryConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDnsIpsVarargs(value: IpAddress*): Self = this.set("DnsIps", js.Array(value :_*))
    
    @scala.inline
    def setDnsIps(value: DnsIps): Self = this.set("DnsIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: DirectoryPassword): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: DirectoryUserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemAdministratorsGroup(value: FileSystemAdministratorsGroupName): Self = this.set("FileSystemAdministratorsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemAdministratorsGroup: Self = this.set("FileSystemAdministratorsGroup", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = this.set("OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnitDistinguishedName: Self = this.set("OrganizationalUnitDistinguishedName", js.undefined)
  }
}
