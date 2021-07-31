package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedActiveDirectoryConfigurationUpdates extends StObject {
  
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[typings.awsSdk.fsxMod.DnsIps] = js.undefined
  
  /**
    * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var Password: js.UndefOr[DirectoryPassword] = js.undefined
  
  /**
    * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain. This account must have the permission to join computers to the domain in the organizational unit provided in OrganizationalUnitDistinguishedName.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.undefined
}
object SelfManagedActiveDirectoryConfigurationUpdates {
  
  @scala.inline
  def apply(): SelfManagedActiveDirectoryConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedActiveDirectoryConfigurationUpdates]
  }
  
  @scala.inline
  implicit class SelfManagedActiveDirectoryConfigurationUpdatesMutableBuilder[Self <: SelfManagedActiveDirectoryConfigurationUpdates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsIps(value: DnsIps): Self = StObject.set(x, "DnsIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpsUndefined: Self = StObject.set(x, "DnsIps", js.undefined)
    
    @scala.inline
    def setDnsIpsVarargs(value: IpAddress*): Self = StObject.set(x, "DnsIps", js.Array(value :_*))
    
    @scala.inline
    def setPassword(value: DirectoryPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setUserName(value: DirectoryUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
