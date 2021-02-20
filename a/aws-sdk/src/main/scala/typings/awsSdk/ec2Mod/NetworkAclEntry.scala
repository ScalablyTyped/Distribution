package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAclEntry extends StObject {
  
  /**
    * The IPv4 network range to allow or deny, in CIDR notation.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
    */
  var Egress: js.UndefOr[Boolean] = js.native
  
  /**
    * ICMP protocol: The ICMP type and code.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsSdk.ec2Mod.IcmpTypeCode] = js.native
  
  /**
    * The IPv6 network range to allow or deny, in CIDR notation.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * TCP or UDP protocols: The range of ports the rule applies to.
    */
  var PortRange: js.UndefOr[typings.awsSdk.ec2Mod.PortRange] = js.native
  
  /**
    * The protocol number. A value of "-1" means all protocols.
    */
  var Protocol: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: js.UndefOr[typings.awsSdk.ec2Mod.RuleAction] = js.native
  
  /**
    * The rule number for the entry. ACL entries are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.native
}
object NetworkAclEntry {
  
  @scala.inline
  def apply(): NetworkAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclEntry]
  }
  
  @scala.inline
  implicit class NetworkAclEntryMutableBuilder[Self <: NetworkAclEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    @scala.inline
    def setEgress(value: Boolean): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressUndefined: Self = StObject.set(x, "Egress", js.undefined)
    
    @scala.inline
    def setIcmpTypeCode(value: IcmpTypeCode): Self = StObject.set(x, "IcmpTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcmpTypeCodeUndefined: Self = StObject.set(x, "IcmpTypeCode", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setPortRange(value: PortRange): Self = StObject.set(x, "PortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRangeUndefined: Self = StObject.set(x, "PortRange", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setRuleAction(value: RuleAction): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    @scala.inline
    def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNumberUndefined: Self = StObject.set(x, "RuleNumber", js.undefined)
  }
}
