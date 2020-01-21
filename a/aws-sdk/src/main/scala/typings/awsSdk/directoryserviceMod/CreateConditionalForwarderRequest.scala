package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConditionalForwarderRequest extends js.Object {
  /**
    * The directory ID of the AWS directory for which you are creating the conditional forwarder.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var DnsIpAddrs: typings.awsSdk.directoryserviceMod.DnsIpAddrs = js.native
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typings.awsSdk.directoryserviceMod.RemoteDomainName = js.native
}

object CreateConditionalForwarderRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): CreateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], DnsIpAddrs = DnsIpAddrs.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateConditionalForwarderRequest]
  }
}

