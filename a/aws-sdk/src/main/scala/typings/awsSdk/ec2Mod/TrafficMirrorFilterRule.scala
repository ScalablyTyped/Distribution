package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorFilterRule extends StObject {
  
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
  def apply(): TrafficMirrorFilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRule]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterRuleMutableBuilder[Self <: TrafficMirrorFilterRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationPortRange(value: TrafficMirrorPortRange): Self = StObject.set(x, "DestinationPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortRangeUndefined: Self = StObject.set(x, "DestinationPortRange", js.undefined)
    
    @scala.inline
    def setProtocol(value: Integer): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setRuleAction(value: TrafficMirrorRuleAction): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    @scala.inline
    def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNumberUndefined: Self = StObject.set(x, "RuleNumber", js.undefined)
    
    @scala.inline
    def setSourceCidrBlock(value: String): Self = StObject.set(x, "SourceCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCidrBlockUndefined: Self = StObject.set(x, "SourceCidrBlock", js.undefined)
    
    @scala.inline
    def setSourcePortRange(value: TrafficMirrorPortRange): Self = StObject.set(x, "SourcePortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortRangeUndefined: Self = StObject.set(x, "SourcePortRange", js.undefined)
    
    @scala.inline
    def setTrafficDirection(value: TrafficDirection): Self = StObject.set(x, "TrafficDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficDirectionUndefined: Self = StObject.set(x, "TrafficDirection", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterId(value: String): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterId", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterRuleId(value: String): Self = StObject.set(x, "TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterRuleIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterRuleId", js.undefined)
  }
}
