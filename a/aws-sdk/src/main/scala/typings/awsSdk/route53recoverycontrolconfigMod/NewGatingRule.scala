package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewGatingRule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
    */
  var GatingControls: listOfStringMin1Max256PatternAZaZ09
  
  /**
    * The name for the new gating rule.
    */
  var Name: stringMin1Max64PatternS
  
  /**
    * The criteria that you set for specific gating controls (routing controls) that designates how many control states must be ON to allow you to change (set or unset) the target control states.
    */
  var RuleConfig: typings.awsSdk.route53recoverycontrolconfigMod.RuleConfig
  
  /**
    * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three Amazon Web Services Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true. In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
    */
  var TargetControls: listOfStringMin1Max256PatternAZaZ09
  
  /**
    * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
    */
  var WaitPeriodMs: integer
}
object NewGatingRule {
  
  inline def apply(
    ControlPanelArn: stringMin1Max256PatternAZaZ09,
    GatingControls: listOfStringMin1Max256PatternAZaZ09,
    Name: stringMin1Max64PatternS,
    RuleConfig: RuleConfig,
    TargetControls: listOfStringMin1Max256PatternAZaZ09,
    WaitPeriodMs: integer
  ): NewGatingRule = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any], GatingControls = GatingControls.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleConfig = RuleConfig.asInstanceOf[js.Any], TargetControls = TargetControls.asInstanceOf[js.Any], WaitPeriodMs = WaitPeriodMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewGatingRule]
  }
  
  extension [Self <: NewGatingRule](x: Self) {
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setGatingControls(value: listOfStringMin1Max256PatternAZaZ09): Self = StObject.set(x, "GatingControls", value.asInstanceOf[js.Any])
    
    inline def setGatingControlsVarargs(value: stringMin1Max256PatternAZaZ09*): Self = StObject.set(x, "GatingControls", js.Array(value*))
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleConfig(value: RuleConfig): Self = StObject.set(x, "RuleConfig", value.asInstanceOf[js.Any])
    
    inline def setTargetControls(value: listOfStringMin1Max256PatternAZaZ09): Self = StObject.set(x, "TargetControls", value.asInstanceOf[js.Any])
    
    inline def setTargetControlsVarargs(value: stringMin1Max256PatternAZaZ09*): Self = StObject.set(x, "TargetControls", js.Array(value*))
    
    inline def setWaitPeriodMs(value: integer): Self = StObject.set(x, "WaitPeriodMs", value.asInstanceOf[js.Any])
  }
}
