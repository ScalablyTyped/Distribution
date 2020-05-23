package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterRuleRequest extends js.Object {
  /**
    * The description to assign to the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The destination ports that are associated with the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The protocol, for example TCP, to assign to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.native
  /**
    * The properties that you want to remove from the Traffic Mirror filter rule. When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
    */
  var RemoveFields: js.UndefOr[TrafficMirrorFilterRuleFieldList] = js.native
  /**
    * The action to assign to the rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.native
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.native
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.native
  /**
    * The port range to assign to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * The type of traffic (ingress | egress) to assign to the rule.
    */
  var TrafficDirection: js.UndefOr[typings.awsSdk.ec2Mod.TrafficDirection] = js.native
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: typings.awsSdk.ec2Mod.TrafficMirrorFilterRuleId = js.native
}

object ModifyTrafficMirrorFilterRuleRequest {
  @scala.inline
  def apply(
    TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId,
    Description: String = null,
    DestinationCidrBlock: String = null,
    DestinationPortRange: TrafficMirrorPortRangeRequest = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Protocol: js.UndefOr[Integer] = js.undefined,
    RemoveFields: TrafficMirrorFilterRuleFieldList = null,
    RuleAction: TrafficMirrorRuleAction = null,
    RuleNumber: js.UndefOr[Integer] = js.undefined,
    SourceCidrBlock: String = null,
    SourcePortRange: TrafficMirrorPortRangeRequest = null,
    TrafficDirection: TrafficDirection = null
  ): ModifyTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (DestinationPortRange != null) __obj.updateDynamic("DestinationPortRange")(DestinationPortRange.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Protocol)) __obj.updateDynamic("Protocol")(Protocol.get.asInstanceOf[js.Any])
    if (RemoveFields != null) __obj.updateDynamic("RemoveFields")(RemoveFields.asInstanceOf[js.Any])
    if (RuleAction != null) __obj.updateDynamic("RuleAction")(RuleAction.asInstanceOf[js.Any])
    if (!js.isUndefined(RuleNumber)) __obj.updateDynamic("RuleNumber")(RuleNumber.get.asInstanceOf[js.Any])
    if (SourceCidrBlock != null) __obj.updateDynamic("SourceCidrBlock")(SourceCidrBlock.asInstanceOf[js.Any])
    if (SourcePortRange != null) __obj.updateDynamic("SourcePortRange")(SourcePortRange.asInstanceOf[js.Any])
    if (TrafficDirection != null) __obj.updateDynamic("TrafficDirection")(TrafficDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleRequest]
  }
}

