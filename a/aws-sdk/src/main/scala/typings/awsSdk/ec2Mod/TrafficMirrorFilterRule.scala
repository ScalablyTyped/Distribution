package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): TrafficMirrorFilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRule]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterRuleOps[Self <: TrafficMirrorFilterRule] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationPortRange(value: TrafficMirrorPortRange): Self = this.set("DestinationPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPortRange: Self = this.set("DestinationPortRange", js.undefined)
    
    @scala.inline
    def setProtocol(value: Integer): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
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
    def setSourcePortRange(value: TrafficMirrorPortRange): Self = this.set("SourcePortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePortRange: Self = this.set("SourcePortRange", js.undefined)
    
    @scala.inline
    def setTrafficDirection(value: TrafficDirection): Self = this.set("TrafficDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficDirection: Self = this.set("TrafficDirection", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterId(value: String): Self = this.set("TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorFilterId: Self = this.set("TrafficMirrorFilterId", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterRuleId(value: String): Self = this.set("TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorFilterRuleId: Self = this.set("TrafficMirrorFilterRuleId", js.undefined)
  }
}
