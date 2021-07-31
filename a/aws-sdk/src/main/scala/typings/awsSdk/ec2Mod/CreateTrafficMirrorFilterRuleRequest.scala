package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficMirrorFilterRuleRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: String
  
  /**
    * The destination port range.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The protocol, for example UDP, to assign to the Traffic Mirror rule. For information about the protocol value, see Protocol Numbers on the Internet Assigned Numbers Authority (IANA) website.
    */
  var Protocol: js.UndefOr[Integer] = js.undefined
  
  /**
    * The action to take (accept | reject) on the filtered traffic.
    */
  var RuleAction: TrafficMirrorRuleAction
  
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: Integer
  
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: String
  
  /**
    * The source port range.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  
  /**
    * The type of traffic (ingress | egress).
    */
  var TrafficDirection: typings.awsSdk.ec2Mod.TrafficDirection
  
  /**
    * The ID of the filter that this rule is associated with.
    */
  var TrafficMirrorFilterId: typings.awsSdk.ec2Mod.TrafficMirrorFilterId
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
  implicit class CreateTrafficMirrorFilterRuleRequestMutableBuilder[Self <: CreateTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortRange(value: TrafficMirrorPortRangeRequest): Self = StObject.set(x, "DestinationPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortRangeUndefined: Self = StObject.set(x, "DestinationPortRange", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setProtocol(value: Integer): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setRuleAction(value: TrafficMirrorRuleAction): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCidrBlock(value: String): Self = StObject.set(x, "SourceCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortRange(value: TrafficMirrorPortRangeRequest): Self = StObject.set(x, "SourcePortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortRangeUndefined: Self = StObject.set(x, "SourcePortRange", js.undefined)
    
    @scala.inline
    def setTrafficDirection(value: TrafficDirection): Self = StObject.set(x, "TrafficDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
  }
}
