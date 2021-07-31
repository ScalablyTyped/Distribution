package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortInfo extends StObject {
  
  /**
    * An alias that defines access for a preconfigured range of IP addresses. The only alias currently supported is lightsail-connect, which allows IP addresses of the browser-based RDP/SSH client in the Lightsail console to connect to your instance.
    */
  var cidrListAliases: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the ports, and the protocol. Lightsail supports IPv4 addresses. Examples:   To allow the IP address 192.0.2.44, specify 192.0.2.44 or 192.0.2.44/32.    To allow the IP addresses 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR block notation, see Classless Inter-Domain Routing on Wikipedia.
    */
  var cidrs: js.UndefOr[StringList] = js.undefined
  
  /**
    * The first port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - The ICMP type. For example, specify 8 as the fromPort (ICMP type), and -1 as the toPort (ICMP code), to enable ICMP Ping. For more information, see Control Messages on Wikipedia.  
    */
  var fromPort: js.UndefOr[Port] = js.undefined
  
  /**
    * The IP protocol name. The name can be one of the following:    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.    icmp - Internet Control Message Protocol (ICMP) is used to send error messages and operational information indicating success or failure when communicating with an instance. For example, an error is indicated when an instance could not be reached. When you specify icmp as the protocol, you must specify the ICMP type using the fromPort parameter, and ICMP code using the toPort parameter.  
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.undefined
  
  /**
    * The last port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - The ICMP code. For example, specify 8 as the fromPort (ICMP type), and -1 as the toPort (ICMP code), to enable ICMP Ping. For more information, see Control Messages on Wikipedia.  
    */
  var toPort: js.UndefOr[Port] = js.undefined
}
object PortInfo {
  
  @scala.inline
  def apply(): PortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortInfo]
  }
  
  @scala.inline
  implicit class PortInfoMutableBuilder[Self <: PortInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrListAliases(value: StringList): Self = StObject.set(x, "cidrListAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrListAliasesUndefined: Self = StObject.set(x, "cidrListAliases", js.undefined)
    
    @scala.inline
    def setCidrListAliasesVarargs(value: String*): Self = StObject.set(x, "cidrListAliases", js.Array(value :_*))
    
    @scala.inline
    def setCidrs(value: StringList): Self = StObject.set(x, "cidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrsUndefined: Self = StObject.set(x, "cidrs", js.undefined)
    
    @scala.inline
    def setCidrsVarargs(value: String*): Self = StObject.set(x, "cidrs", js.Array(value :_*))
    
    @scala.inline
    def setFromPort(value: Port): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
    
    @scala.inline
    def setProtocol(value: NetworkProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setToPort(value: Port): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
  }
}
