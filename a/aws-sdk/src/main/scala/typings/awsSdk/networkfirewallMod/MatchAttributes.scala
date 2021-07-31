package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchAttributes extends StObject {
  
  /**
    * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is only used for protocols 6 (TCP) and 17 (UDP).  You can specify individual ports, for example 1994 and you can specify port ranges, for example 1990-1994. 
    */
  var DestinationPorts: js.UndefOr[PortRanges] = js.undefined
  
  /**
    * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. 
    */
  var Destinations: js.UndefOr[Addresses] = js.undefined
  
  /**
    * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not specified, this matches with any protocol. 
    */
  var Protocols: js.UndefOr[ProtocolNumbers] = js.undefined
  
  /**
    * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used for protocols 6 (TCP) and 17 (UDP).  You can specify individual ports, for example 1994 and you can specify port ranges, for example 1990-1994. 
    */
  var SourcePorts: js.UndefOr[PortRanges] = js.undefined
  
  /**
    * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. 
    */
  var Sources: js.UndefOr[Addresses] = js.undefined
  
  /**
    * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only used for protocol 6 (TCP).
    */
  var TCPFlags: js.UndefOr[typings.awsSdk.networkfirewallMod.TCPFlags] = js.undefined
}
object MatchAttributes {
  
  @scala.inline
  def apply(): MatchAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchAttributes]
  }
  
  @scala.inline
  implicit class MatchAttributesMutableBuilder[Self <: MatchAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationPorts(value: PortRanges): Self = StObject.set(x, "DestinationPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortsUndefined: Self = StObject.set(x, "DestinationPorts", js.undefined)
    
    @scala.inline
    def setDestinationPortsVarargs(value: PortRange*): Self = StObject.set(x, "DestinationPorts", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: Addresses): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: Address*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: ProtocolNumbers): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: ProtocolNumber*): Self = StObject.set(x, "Protocols", js.Array(value :_*))
    
    @scala.inline
    def setSourcePorts(value: PortRanges): Self = StObject.set(x, "SourcePorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortsUndefined: Self = StObject.set(x, "SourcePorts", js.undefined)
    
    @scala.inline
    def setSourcePortsVarargs(value: PortRange*): Self = StObject.set(x, "SourcePorts", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: Addresses): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Address*): Self = StObject.set(x, "Sources", js.Array(value :_*))
    
    @scala.inline
    def setTCPFlags(value: TCPFlags): Self = StObject.set(x, "TCPFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTCPFlagsUndefined: Self = StObject.set(x, "TCPFlags", js.undefined)
    
    @scala.inline
    def setTCPFlagsVarargs(value: TCPFlagField*): Self = StObject.set(x, "TCPFlags", js.Array(value :_*))
  }
}
