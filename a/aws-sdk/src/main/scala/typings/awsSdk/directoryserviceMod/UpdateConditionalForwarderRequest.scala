package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConditionalForwarderRequest extends js.Object {
  /**
    * The directory ID of the AWS directory for which to update the conditional forwarder.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
    */
  var DnsIpAddrs: typings.awsSdk.directoryserviceMod.DnsIpAddrs = js.native
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typings.awsSdk.directoryserviceMod.RemoteDomainName = js.native
}

object UpdateConditionalForwarderRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): UpdateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], DnsIpAddrs = DnsIpAddrs.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalForwarderRequest]
  }
  @scala.inline
  implicit class UpdateConditionalForwarderRequestOps[Self <: UpdateConditionalForwarderRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnsIpAddrsVarargs(value: IpAddr*): Self = this.set("DnsIpAddrs", js.Array(value :_*))
    @scala.inline
    def setDnsIpAddrs(value: DnsIpAddrs): Self = this.set("DnsIpAddrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = this.set("RemoteDomainName", value.asInstanceOf[js.Any])
  }
  
}

