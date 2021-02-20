package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupRuleDescription extends StObject {
  
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
  implicit class SecurityGroupRuleDescriptionMutableBuilder[Self <: SecurityGroupRuleDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPort(value: IPPortNumber): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    @scala.inline
    def setIPV4Range(value: CIDR): Self = StObject.set(x, "IPV4Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPV4RangeUndefined: Self = StObject.set(x, "IPV4Range", js.undefined)
    
    @scala.inline
    def setIPV6Range(value: CIDR): Self = StObject.set(x, "IPV6Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPV6RangeUndefined: Self = StObject.set(x, "IPV6Range", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: ResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    @scala.inline
    def setProtocol(value: LengthBoundedString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setToPort(value: IPPortNumber): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
