package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalForwarder extends js.Object {
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS server that your conditional forwarder points to.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  /**
    * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
    */
  var RemoteDomainName: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainName] = js.native
  /**
    * The replication scope of the conditional forwarder. The only allowed value is Domain, which will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
    */
  var ReplicationScope: js.UndefOr[typings.awsSdk.directoryserviceMod.ReplicationScope] = js.native
}

object ConditionalForwarder {
  @scala.inline
  def apply(
    DnsIpAddrs: DnsIpAddrs = null,
    RemoteDomainName: RemoteDomainName = null,
    ReplicationScope: ReplicationScope = null
  ): ConditionalForwarder = {
    val __obj = js.Dynamic.literal()
    if (DnsIpAddrs != null) __obj.updateDynamic("DnsIpAddrs")(DnsIpAddrs.asInstanceOf[js.Any])
    if (RemoteDomainName != null) __obj.updateDynamic("RemoteDomainName")(RemoteDomainName.asInstanceOf[js.Any])
    if (ReplicationScope != null) __obj.updateDynamic("ReplicationScope")(ReplicationScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalForwarder]
  }
}

