package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class CreateConditionalForwarderRequestOps[Self <: CreateConditionalForwarderRequest] (val x: Self) extends AnyVal {
    
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
