package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupRuleDescription extends js.Object {
  
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types.
    */
  var FromPort: js.UndefOr[IPPortNumber] = js.native
  
  /**
    * The IPv4 ranges for the security group rule.
    */
  var IPV4Range: js.UndefOr[CIDR] = js.native
  
  /**
    * The IPv6 ranges for the security group rule.
    */
  var IPV6Range: js.UndefOr[CIDR] = js.native
  
  /**
    * The ID of the prefix list for the security group rule.
    */
  var PrefixListId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number.
    */
  var Protocol: js.UndefOr[LengthBoundedString] = js.native
  
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes.
    */
  var ToPort: js.UndefOr[IPPortNumber] = js.native
}
object SecurityGroupRuleDescription {
  
  @scala.inline
  def apply(): SecurityGroupRuleDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRuleDescription]
  }
  
  @scala.inline
  implicit class SecurityGroupRuleDescriptionOps[Self <: SecurityGroupRuleDescription] (val x: Self) extends AnyVal {
    
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
    def setFromPort(value: IPPortNumber): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    
    @scala.inline
    def setIPV4Range(value: CIDR): Self = this.set("IPV4Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPV4Range: Self = this.set("IPV4Range", js.undefined)
    
    @scala.inline
    def setIPV6Range(value: CIDR): Self = this.set("IPV6Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPV6Range: Self = this.set("IPV6Range", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: ResourceId): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListId: Self = this.set("PrefixListId", js.undefined)
    
    @scala.inline
    def setProtocol(value: LengthBoundedString): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setToPort(value: IPPortNumber): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
  }
}
