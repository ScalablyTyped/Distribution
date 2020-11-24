package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchAttributes extends js.Object {
  
  /**
    * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is only used for protocols 6 (TCP) and 17 (UDP).  You can specify individual ports, for example 1994 and you can specify port ranges, for example 1990-1994. 
    */
  var DestinationPorts: js.UndefOr[PortRanges] = js.native
  
  /**
    * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. 
    */
  var Destinations: js.UndefOr[Addresses] = js.native
  
  /**
    * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not specified, this matches with any protocol. 
    */
  var Protocols: js.UndefOr[ProtocolNumbers] = js.native
  
  /**
    * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used for protocols 6 (TCP) and 17 (UDP).  You can specify individual ports, for example 1994 and you can specify port ranges, for example 1990-1994. 
    */
  var SourcePorts: js.UndefOr[PortRanges] = js.native
  
  /**
    * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. 
    */
  var Sources: js.UndefOr[Addresses] = js.native
  
  /**
    * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only used for protocol 6 (TCP).
    */
  var TCPFlags: js.UndefOr[typings.awsSdk.networkfirewallMod.TCPFlags] = js.native
}
object MatchAttributes {
  
  @scala.inline
  def apply(): MatchAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchAttributes]
  }
  
  @scala.inline
  implicit class MatchAttributesOps[Self <: MatchAttributes] (val x: Self) extends AnyVal {
    
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
    def setDestinationPortsVarargs(value: PortRange*): Self = this.set("DestinationPorts", js.Array(value :_*))
    
    @scala.inline
    def setDestinationPorts(value: PortRanges): Self = this.set("DestinationPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPorts: Self = this.set("DestinationPorts", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: Address*): Self = this.set("Destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: Addresses): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: ProtocolNumber*): Self = this.set("Protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: ProtocolNumbers): Self = this.set("Protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("Protocols", js.undefined)
    
    @scala.inline
    def setSourcePortsVarargs(value: PortRange*): Self = this.set("SourcePorts", js.Array(value :_*))
    
    @scala.inline
    def setSourcePorts(value: PortRanges): Self = this.set("SourcePorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePorts: Self = this.set("SourcePorts", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Address*): Self = this.set("Sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: Addresses): Self = this.set("Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
    
    @scala.inline
    def setTCPFlagsVarargs(value: TCPFlagField*): Self = this.set("TCPFlags", js.Array(value :_*))
    
    @scala.inline
    def setTCPFlags(value: TCPFlags): Self = this.set("TCPFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTCPFlags: Self = this.set("TCPFlags", js.undefined)
  }
}
