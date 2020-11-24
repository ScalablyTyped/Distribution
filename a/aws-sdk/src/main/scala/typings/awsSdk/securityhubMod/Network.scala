package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends js.Object {
  
  /**
    * The destination domain of network-related information about a finding.
    */
  var DestinationDomain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var DestinationIpV4: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var DestinationIpV6: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination port of network-related information about a finding.
    */
  var DestinationPort: js.UndefOr[Integer] = js.native
  
  /**
    * The direction of network traffic associated with a finding.
    */
  var Direction: js.UndefOr[NetworkDirection] = js.native
  
  /**
    * The range of open ports that is present on the network.
    */
  var OpenPortRange: js.UndefOr[PortRange] = js.native
  
  /**
    * The protocol of network-related information about a finding.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source domain of network-related information about a finding.
    */
  var SourceDomain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var SourceIpV4: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var SourceIpV6: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var SourceMac: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source port of network-related information about a finding.
    */
  var SourcePort: js.UndefOr[Integer] = js.native
}
object Network {
  
  @scala.inline
  def apply(): Network = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    
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
    def setDestinationDomain(value: NonEmptyString): Self = this.set("DestinationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDomain: Self = this.set("DestinationDomain", js.undefined)
    
    @scala.inline
    def setDestinationIpV4(value: NonEmptyString): Self = this.set("DestinationIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIpV4: Self = this.set("DestinationIpV4", js.undefined)
    
    @scala.inline
    def setDestinationIpV6(value: NonEmptyString): Self = this.set("DestinationIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIpV6: Self = this.set("DestinationIpV6", js.undefined)
    
    @scala.inline
    def setDestinationPort(value: Integer): Self = this.set("DestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPort: Self = this.set("DestinationPort", js.undefined)
    
    @scala.inline
    def setDirection(value: NetworkDirection): Self = this.set("Direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("Direction", js.undefined)
    
    @scala.inline
    def setOpenPortRange(value: PortRange): Self = this.set("OpenPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenPortRange: Self = this.set("OpenPortRange", js.undefined)
    
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setSourceDomain(value: NonEmptyString): Self = this.set("SourceDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDomain: Self = this.set("SourceDomain", js.undefined)
    
    @scala.inline
    def setSourceIpV4(value: NonEmptyString): Self = this.set("SourceIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIpV4: Self = this.set("SourceIpV4", js.undefined)
    
    @scala.inline
    def setSourceIpV6(value: NonEmptyString): Self = this.set("SourceIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIpV6: Self = this.set("SourceIpV6", js.undefined)
    
    @scala.inline
    def setSourceMac(value: NonEmptyString): Self = this.set("SourceMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMac: Self = this.set("SourceMac", js.undefined)
    
    @scala.inline
    def setSourcePort(value: Integer): Self = this.set("SourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePort: Self = this.set("SourcePort", js.undefined)
  }
}
