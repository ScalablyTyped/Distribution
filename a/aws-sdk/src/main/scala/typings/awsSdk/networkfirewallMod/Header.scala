package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends StObject {
  
  /**
    * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify ANY.  Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network Firewall supports all address ranges for IPv4.  Examples:    To configure Network Firewall to inspect for the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing.
    */
  var Destination: typings.awsSdk.networkfirewallMod.Destination = js.native
  
  /**
    * The destination port to inspect for. You can specify an individual port, for example 1994 and you can specify a port range, for example 1990-1994. To match with any port, specify ANY. 
    */
  var DestinationPort: Port = js.native
  
  /**
    * The direction of traffic flow to inspect. If set to ANY, the inspection matches bidirectional traffic, both from the source to the destination and from the destination to the source. If set to FORWARD, the inspection only matches traffic going from the source to the destination. 
    */
  var Direction: StatefulRuleDirection = js.native
  
  /**
    * The protocol to inspect for. To match with any protocol, specify ANY. 
    */
  var Protocol: StatefulRuleProtocol = js.native
  
  /**
    * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify ANY.  Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network Firewall supports all address ranges for IPv4.  Examples:    To configure Network Firewall to inspect for the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing.
    */
  var Source: typings.awsSdk.networkfirewallMod.Source = js.native
  
  /**
    * The source port to inspect for. You can specify an individual port, for example 1994 and you can specify a port range, for example 1990-1994. To match with any port, specify ANY. 
    */
  var SourcePort: Port = js.native
}
object Header {
  
  @scala.inline
  def apply(
    Destination: Destination,
    DestinationPort: Port,
    Direction: StatefulRuleDirection,
    Protocol: StatefulRuleProtocol,
    Source: Source,
    SourcePort: Port
  ): Header = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], DestinationPort = DestinationPort.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourcePort = SourcePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPort(value: Port): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: StatefulRuleDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: StatefulRuleProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePort(value: Port): Self = StObject.set(x, "SourcePort", value.asInstanceOf[js.Any])
  }
}
