package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAclEntry extends StObject {
  
  /**
    * The IPv4 network range to allow or deny, in CIDR notation.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
    */
  var Egress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ICMP protocol: The ICMP type and code.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsSdk.ec2Mod.IcmpTypeCode] = js.undefined
  
  /**
    * The IPv6 network range to allow or deny, in CIDR notation.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * TCP or UDP protocols: The range of ports the rule applies to.
    */
  var PortRange: js.UndefOr[typings.awsSdk.ec2Mod.PortRange] = js.undefined
  
  /**
    * The protocol number. A value of "-1" means all protocols.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: js.UndefOr[typings.awsSdk.ec2Mod.RuleAction] = js.undefined
  
  /**
    * The rule number for the entry. ACL entries are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
}
object NetworkAclEntry {
  
  inline def apply(): NetworkAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclEntry]
  }
  
  extension [Self <: NetworkAclEntry](x: Self) {
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setEgress(value: Boolean): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "Egress", js.undefined)
    
    inline def setIcmpTypeCode(value: IcmpTypeCode): Self = StObject.set(x, "IcmpTypeCode", value.asInstanceOf[js.Any])
    
    inline def setIcmpTypeCodeUndefined: Self = StObject.set(x, "IcmpTypeCode", js.undefined)
    
    inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    inline def setPortRange(value: PortRange): Self = StObject.set(x, "PortRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "PortRange", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRuleAction(value: RuleAction): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    inline def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    inline def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "RuleNumber", js.undefined)
  }
}
