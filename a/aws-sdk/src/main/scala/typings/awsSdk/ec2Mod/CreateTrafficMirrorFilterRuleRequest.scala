package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorFilterRuleRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * The destination port range.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The protocol, for example UDP, to assign to the Traffic Mirror rule. For information about the protocol value, see Protocol Numbers on the Internet Assigned Numbers Authority (IANA) website.
    */
  var Protocol: js.UndefOr[Integer] = js.native
  /**
    * The action to take (accept | reject) on the filtered traffic.
    */
  var RuleAction: TrafficMirrorRuleAction = js.native
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: Integer = js.native
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: String = js.native
  /**
    * The source port range.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * The type of traffic (ingress | egress).
    */
  var TrafficDirection: typings.awsSdk.ec2Mod.TrafficDirection = js.native
  /**
    * The ID of the filter that this rule is associated with.
    */
  var TrafficMirrorFilterId: typings.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
}

object CreateTrafficMirrorFilterRuleRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    RuleAction: TrafficMirrorRuleAction,
    RuleNumber: Integer,
    SourceCidrBlock: String,
    TrafficDirection: TrafficDirection,
    TrafficMirrorFilterId: TrafficMirrorFilterId
  ): CreateTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], RuleAction = RuleAction.asInstanceOf[js.Any], RuleNumber = RuleNumber.asInstanceOf[js.Any], SourceCidrBlock = SourceCidrBlock.asInstanceOf[js.Any], TrafficDirection = TrafficDirection.asInstanceOf[js.Any], TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleRequest]
  }
  @scala.inline
  implicit class CreateTrafficMirrorFilterRuleRequestOps[Self <: CreateTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
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
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleAction(value: TrafficMirrorRuleAction): Self = this.set("RuleAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleNumber(value: Integer): Self = this.set("RuleNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCidrBlock(value: String): Self = this.set("SourceCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficDirection(value: TrafficDirection): Self = this.set("TrafficDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = this.set("TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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
    def setSourcePortRange(value: TrafficMirrorPortRangeRequest): Self = this.set("SourcePortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePortRange: Self = this.set("SourcePortRange", js.undefined)
  }
  
}

