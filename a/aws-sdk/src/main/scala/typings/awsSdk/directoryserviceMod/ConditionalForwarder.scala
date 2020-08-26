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
  def apply(): ConditionalForwarder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalForwarder]
  }
  @scala.inline
  implicit class ConditionalForwarderOps[Self <: ConditionalForwarder] (val x: Self) extends AnyVal {
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
    def setDnsIpAddrsVarargs(value: IpAddr*): Self = this.set("DnsIpAddrs", js.Array(value :_*))
    @scala.inline
    def setDnsIpAddrs(value: DnsIpAddrs): Self = this.set("DnsIpAddrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsIpAddrs: Self = this.set("DnsIpAddrs", js.undefined)
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = this.set("RemoteDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteDomainName: Self = this.set("RemoteDomainName", js.undefined)
    @scala.inline
    def setReplicationScope(value: ReplicationScope): Self = this.set("ReplicationScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationScope: Self = this.set("ReplicationScope", js.undefined)
  }
  
}

