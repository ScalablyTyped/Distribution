package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalForwarder extends StObject {
  
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS server that your conditional forwarder points to.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.directoryserviceMod.DnsIpAddrs] = js.undefined
  
  /**
    * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
    */
  var RemoteDomainName: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainName] = js.undefined
  
  /**
    * The replication scope of the conditional forwarder. The only allowed value is Domain, which will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
    */
  var ReplicationScope: js.UndefOr[typings.awsSdk.directoryserviceMod.ReplicationScope] = js.undefined
}
object ConditionalForwarder {
  
  inline def apply(): ConditionalForwarder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalForwarder]
  }
  
  extension [Self <: ConditionalForwarder](x: Self) {
    
    inline def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddrsUndefined: Self = StObject.set(x, "DnsIpAddrs", js.undefined)
    
    inline def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value :_*))
    
    inline def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainNameUndefined: Self = StObject.set(x, "RemoteDomainName", js.undefined)
    
    inline def setReplicationScope(value: ReplicationScope): Self = StObject.set(x, "ReplicationScope", value.asInstanceOf[js.Any])
    
    inline def setReplicationScopeUndefined: Self = StObject.set(x, "ReplicationScope", js.undefined)
  }
}
