package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConditionalForwarderRequest extends StObject {
  
  /**
    * The directory ID of the AWS directory for which to update the conditional forwarder.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
    */
  var DnsIpAddrs: typings.awsSdk.directoryserviceMod.DnsIpAddrs
  
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typings.awsSdk.directoryserviceMod.RemoteDomainName
}
object UpdateConditionalForwarderRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): UpdateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], DnsIpAddrs = DnsIpAddrs.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalForwarderRequest]
  }
  
  @scala.inline
  implicit class UpdateConditionalForwarderRequestMutableBuilder[Self <: UpdateConditionalForwarderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value :_*))
    
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
  }
}
