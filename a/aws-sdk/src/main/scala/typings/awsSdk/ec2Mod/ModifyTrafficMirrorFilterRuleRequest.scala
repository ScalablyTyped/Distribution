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
  def apply(TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId): ModifyTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleRequest]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterRuleRequestOps[Self <: ModifyTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
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
    def setTrafficMirrorFilterRuleId(value: TrafficMirrorFilterRuleId): Self = this.set("TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("DestinationCidrBlock", js.undefined)
    @scala.inline
    def setDestinationPortRange(value: TrafficMirrorPortRangeRequest): Self = this.set("DestinationPortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationPortRange: Self = this.set("DestinationPortRange", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setProtocol(value: Integer): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setRemoveFieldsVarargs(value: TrafficMirrorFilterRuleField*): Self = this.set("RemoveFields", js.Array(value :_*))
    @scala.inline
    def setRemoveFields(value: TrafficMirrorFilterRuleFieldList): Self = this.set("RemoveFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveFields: Self = this.set("RemoveFields", js.undefined)
    @scala.inline
    def setRuleAction(value: TrafficMirrorRuleAction): Self = this.set("RuleAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleAction: Self = this.set("RuleAction", js.undefined)
    @scala.inline
    def setRuleNumber(value: Integer): Self = this.set("RuleNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleNumber: Self = this.set("RuleNumber", js.undefined)
    @scala.inline
    def setSourceCidrBlock(value: String): Self = this.set("SourceCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCidrBlock: Self = this.set("SourceCidrBlock", js.undefined)
    @scala.inline
    def setSourcePortRange(value: TrafficMirrorPortRangeRequest): Self = this.set("SourcePortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePortRange: Self = this.set("SourcePortRange", js.undefined)
    @scala.inline
    def setTrafficDirection(value: TrafficDirection): Self = this.set("TrafficDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficDirection: Self = this.set("TrafficDirection", js.undefined)
  }
  
}

