package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclEntry extends js.Object {
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
  implicit class NetworkAclEntryOps[Self <: NetworkAclEntry] (val x: Self) extends AnyVal {
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
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    @scala.inline
    def setEgress(value: Boolean): Self = this.set("Egress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgress: Self = this.set("Egress", js.undefined)
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
    @scala.inline
    def setProtocol(value: String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setRuleAction(value: RuleAction): Self = this.set("RuleAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleAction: Self = this.set("RuleAction", js.undefined)
    @scala.inline
    def setRuleNumber(value: Integer): Self = this.set("RuleNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleNumber: Self = this.set("RuleNumber", js.undefined)
  }
  
}

