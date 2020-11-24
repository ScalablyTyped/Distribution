package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkAclEntryRequest extends js.Object {
  
  /**
    * The IPv4 network range to allow or deny, in CIDR notation (for example 172.16.0.0/24). We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet).
    */
  var Egress: Boolean = js.native
  
  /**
    * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsSdk.ec2Mod.IcmpTypeCode] = js.native
  
  /**
    * The IPv6 network range to allow or deny, in CIDR notation (for example 2001:db8:1234:1a00::/64).
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typings.awsSdk.ec2Mod.NetworkAclId = js.native
  
  /**
    * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17 (UDP).
    */
  var PortRange: js.UndefOr[typings.awsSdk.ec2Mod.PortRange] = js.native
  
  /**
    * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
    */
  var Protocol: String = js.native
  
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: typings.awsSdk.ec2Mod.RuleAction = js.native
  
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number. Constraints: Positive integer from 1 to 32766. The range 32767 to 65535 is reserved for internal use.
    */
  var RuleNumber: Integer = js.native
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
  implicit class CreateNetworkAclEntryRequestOps[Self <: CreateNetworkAclEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEgress(value: Boolean): Self = this.set("Egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAclId(value: NetworkAclId): Self = this.set("NetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleAction(value: RuleAction): Self = this.set("RuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNumber(value: Integer): Self = this.set("RuleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setIcmpTypeCode(value: IcmpTypeCode): Self = this.set("IcmpTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcmpTypeCode: Self = this.set("IcmpTypeCode", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("Ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setPortRange(value: PortRange): Self = this.set("PortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortRange: Self = this.set("PortRange", js.undefined)
  }
}
