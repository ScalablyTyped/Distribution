package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfManagedActiveDirectoryAttributes extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[typings.awsSdk.fsxMod.DnsIps] = js.native
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.native
  /**
    * The name of the domain group whose members have administrative privileges for the FSx file system.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.native
  /**
    * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which the Windows File Server instance is joined.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsSdk.fsxMod.OrganizationalUnitDistinguishedName] = js.native
  /**
    * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.native
}

object SelfManagedActiveDirectoryAttributes {
  @scala.inline
  def apply(): SelfManagedActiveDirectoryAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedActiveDirectoryAttributes]
  }
  @scala.inline
  implicit class SelfManagedActiveDirectoryAttributesOps[Self <: SelfManagedActiveDirectoryAttributes] (val x: Self) extends AnyVal {
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
    def deleteDnsIps: Self = this.set("DnsIps", js.undefined)
    @scala.inline
    def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setFileSystemAdministratorsGroup(value: FileSystemAdministratorsGroupName): Self = this.set("FileSystemAdministratorsGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemAdministratorsGroup: Self = this.set("FileSystemAdministratorsGroup", js.undefined)
    @scala.inline
    def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = this.set("OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnitDistinguishedName: Self = this.set("OrganizationalUnitDistinguishedName", js.undefined)
    @scala.inline
    def setUserName(value: DirectoryUserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

