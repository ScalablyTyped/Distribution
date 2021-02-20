package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nameserver extends StObject {
  
  /**
    * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a subdomain of the domain. For example, if your domain is example.com and the name server for the domain is ns.example.com, you need to specify the IP address for ns.example.com. Constraints: The list can contain only one IPv4 and one IPv6 address.
    */
  var GlueIps: js.UndefOr[GlueIpList] = js.native
  
  /**
    * The fully qualified host name of the name server. Constraint: Maximum 255 characters
    */
  var Name: HostName = js.native
}
object Nameserver {
  
  @scala.inline
  def apply(Name: HostName): Nameserver = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nameserver]
  }
  
  @scala.inline
  implicit class NameserverMutableBuilder[Self <: Nameserver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlueIps(value: GlueIpList): Self = StObject.set(x, "GlueIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueIpsUndefined: Self = StObject.set(x, "GlueIps", js.undefined)
    
    @scala.inline
    def setGlueIpsVarargs(value: GlueIp*): Self = StObject.set(x, "GlueIps", js.Array(value :_*))
    
    @scala.inline
    def setName(value: HostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
