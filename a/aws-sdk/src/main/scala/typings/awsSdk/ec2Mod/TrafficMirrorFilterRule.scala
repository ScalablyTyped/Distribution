package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRule extends js.Object {
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The destination CIDR block assigned to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The destination port range assigned to the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRange] = js.native
  /**
    * The protocol assigned to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.native
  /**
    * The action assigned to the Traffic Mirror rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.native
  /**
    * The rule number of the Traffic Mirror rule.
    */
  var RuleNumber: js.UndefOr[Integer] = js.native
  /**
    * The source CIDR block assigned to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.native
  /**
    * The source port range assigned to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRange] = js.native
  /**
    * The traffic direction assigned to the Traffic Mirror rule.
    */
  var TrafficDirection: js.UndefOr[typings.awsSdk.ec2Mod.TrafficDirection] = js.native
  /**
    * The ID of the Traffic Mirror filter that the rule is associated with.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.native
}

object TrafficMirrorFilterRule {
  @scala.inline
  def apply(
    Description: String = null,
    DestinationCidrBlock: String = null,
    DestinationPortRange: TrafficMirrorPortRange = null,
    Protocol: Int | scala.Double = null,
    RuleAction: TrafficMirrorRuleAction = null,
    RuleNumber: Int | scala.Double = null,
    SourceCidrBlock: String = null,
    SourcePortRange: TrafficMirrorPortRange = null,
    TrafficDirection: TrafficDirection = null,
    TrafficMirrorFilterId: String = null,
    TrafficMirrorFilterRuleId: String = null
  ): TrafficMirrorFilterRule = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (DestinationPortRange != null) __obj.updateDynamic("DestinationPortRange")(DestinationPortRange.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RuleAction != null) __obj.updateDynamic("RuleAction")(RuleAction.asInstanceOf[js.Any])
    if (RuleNumber != null) __obj.updateDynamic("RuleNumber")(RuleNumber.asInstanceOf[js.Any])
    if (SourceCidrBlock != null) __obj.updateDynamic("SourceCidrBlock")(SourceCidrBlock.asInstanceOf[js.Any])
    if (SourcePortRange != null) __obj.updateDynamic("SourcePortRange")(SourcePortRange.asInstanceOf[js.Any])
    if (TrafficDirection != null) __obj.updateDynamic("TrafficDirection")(TrafficDirection.asInstanceOf[js.Any])
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId.asInstanceOf[js.Any])
    if (TrafficMirrorFilterRuleId != null) __obj.updateDynamic("TrafficMirrorFilterRuleId")(TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterRule]
  }
}

