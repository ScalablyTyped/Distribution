package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nameserver extends js.Object {
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
  def apply(Name: HostName, GlueIps: GlueIpList = null): Nameserver = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (GlueIps != null) __obj.updateDynamic("GlueIps")(GlueIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nameserver]
  }
}

