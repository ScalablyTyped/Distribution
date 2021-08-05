package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancePortInfo extends StObject {
  
  /**
    * The access direction (inbound or outbound).  Lightsail currently supports only inbound access direction. 
    */
  var accessDirection: js.UndefOr[AccessDirection] = js.undefined
  
  /**
    * The location from which access is allowed. For example, Anywhere (0.0.0.0/0), or Custom if a specific IP address or range of IP addresses is allowed.
    */
  var accessFrom: js.UndefOr[String] = js.undefined
  
  /**
    * The type of access (Public or Private).
    */
  var accessType: js.UndefOr[PortAccessType] = js.undefined
  
  /**
    * An alias that defines access for a preconfigured range of IP addresses. The only alias currently supported is lightsail-connect, which allows IP addresses of the browser-based RDP/SSH client in the Lightsail console to connect to your instance.
    */
  var cidrListAliases: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the ports, and the protocol. Lightsail supports IPv4 addresses. For more information about CIDR block notation, see Classless Inter-Domain Routing on Wikipedia.
    */
  var cidrs: js.UndefOr[StringList] = js.undefined
  
  /**
    * The common name of the port information.
    */
  var commonName: js.UndefOr[String] = js.undefined
  
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
object InstancePortInfo {
  
  inline def apply(): InstancePortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePortInfo]
  }
  
  extension [Self <: InstancePortInfo](x: Self) {
    
    inline def setAccessDirection(value: AccessDirection): Self = StObject.set(x, "accessDirection", value.asInstanceOf[js.Any])
    
    inline def setAccessDirectionUndefined: Self = StObject.set(x, "accessDirection", js.undefined)
    
    inline def setAccessFrom(value: String): Self = StObject.set(x, "accessFrom", value.asInstanceOf[js.Any])
    
    inline def setAccessFromUndefined: Self = StObject.set(x, "accessFrom", js.undefined)
    
    inline def setAccessType(value: PortAccessType): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setCidrListAliases(value: StringList): Self = StObject.set(x, "cidrListAliases", value.asInstanceOf[js.Any])
    
    inline def setCidrListAliasesUndefined: Self = StObject.set(x, "cidrListAliases", js.undefined)
    
    inline def setCidrListAliasesVarargs(value: String*): Self = StObject.set(x, "cidrListAliases", js.Array(value :_*))
    
    inline def setCidrs(value: StringList): Self = StObject.set(x, "cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: String*): Self = StObject.set(x, "cidrs", js.Array(value :_*))
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
    inline def setFromPort(value: Port): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
    
    inline def setProtocol(value: NetworkProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setToPort(value: Port): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
  }
}
