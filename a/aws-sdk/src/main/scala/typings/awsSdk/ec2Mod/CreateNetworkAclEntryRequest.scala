package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkAclEntryRequest extends StObject {
  
  /**
    * The IPv4 network range to allow or deny, in CIDR notation (for example 172.16.0.0/24). We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet).
    */
  var Egress: Boolean
  
  /**
    * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsSdk.ec2Mod.IcmpTypeCode] = js.undefined
  
  /**
    * The IPv6 network range to allow or deny, in CIDR notation (for example 2001:db8:1234:1a00::/64).
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typings.awsSdk.ec2Mod.NetworkAclId
  
  /**
    * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17 (UDP).
    */
  var PortRange: js.UndefOr[typings.awsSdk.ec2Mod.PortRange] = js.undefined
  
  /**
    * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
    */
  var Protocol: String
  
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: typings.awsSdk.ec2Mod.RuleAction
  
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number. Constraints: Positive integer from 1 to 32766. The range 32767 to 65535 is reserved for internal use.
    */
  var RuleNumber: Integer
}
object CreateNetworkAclEntryRequest {
  
  @scala.inline
  def apply(
    Egress: Boolean,
    NetworkAclId: NetworkAclId,
    Protocol: String,
    RuleAction: RuleAction,
    RuleNumber: Integer
  ): CreateNetworkAclEntryRequest = {
    val __obj = js.Dynamic.literal(Egress = Egress.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], RuleAction = RuleAction.asInstanceOf[js.Any], RuleNumber = RuleNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkAclEntryRequest]
  }
  
  @scala.inline
  implicit class CreateNetworkAclEntryRequestMutableBuilder[Self <: CreateNetworkAclEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEgress(value: Boolean): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcmpTypeCode(value: IcmpTypeCode): Self = StObject.set(x, "IcmpTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcmpTypeCodeUndefined: Self = StObject.set(x, "IcmpTypeCode", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: NetworkAclId): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRange(value: PortRange): Self = StObject.set(x, "PortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRangeUndefined: Self = StObject.set(x, "PortRange", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleAction(value: RuleAction): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
  }
}
