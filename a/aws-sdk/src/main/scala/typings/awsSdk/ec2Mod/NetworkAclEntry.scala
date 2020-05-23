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
  def apply(
    CidrBlock: String = null,
    Egress: js.UndefOr[Boolean] = js.undefined,
    IcmpTypeCode: IcmpTypeCode = null,
    Ipv6CidrBlock: String = null,
    PortRange: PortRange = null,
    Protocol: String = null,
    RuleAction: RuleAction = null,
    RuleNumber: js.UndefOr[Integer] = js.undefined
  ): NetworkAclEntry = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(Egress)) __obj.updateDynamic("Egress")(Egress.get.asInstanceOf[js.Any])
    if (IcmpTypeCode != null) __obj.updateDynamic("IcmpTypeCode")(IcmpTypeCode.asInstanceOf[js.Any])
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock.asInstanceOf[js.Any])
    if (PortRange != null) __obj.updateDynamic("PortRange")(PortRange.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RuleAction != null) __obj.updateDynamic("RuleAction")(RuleAction.asInstanceOf[js.Any])
    if (!js.isUndefined(RuleNumber)) __obj.updateDynamic("RuleNumber")(RuleNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclEntry]
  }
}

