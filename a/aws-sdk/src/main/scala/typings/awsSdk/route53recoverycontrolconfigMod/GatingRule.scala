package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatingRule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: stringMin1Max256PatternAZaZ09
  
  /**
    * An array of gating routing control Amazon Resource Names (ARNs). For a simple "on/off" switch, specify the ARN for one routing control. The gating routing controls are evaluated by the rule configuration that you specify to determine if the target routing control states can be changed.
    */
  var GatingControls: listOfStringMin1Max256PatternAZaZ09
  
  /**
    * The name for the gating rule. You can use any non-white space character in the name.
    */
  var Name: stringMin1Max64PatternS
  
  /**
    * The criteria that you set for gating routing controls that designates how many of the routing control states must be ON to allow you to update target routing control states.
    */
  var RuleConfig: typings.awsSdk.route53recoverycontrolconfigMod.RuleConfig
  
  /**
    * The Amazon Resource Name (ARN) of the gating rule.
    */
  var SafetyRuleArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The deployment status of a gating rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
    */
  var Status: typings.awsSdk.route53recoverycontrolconfigMod.Status
  
  /**
    * An array of target routing control Amazon Resource Names (ARNs) for which the states can only be updated if the rule configuration that you specify evaluates to true for the gating routing control. As a simple example, if you have a single gating control, it acts as an overall "on/off" switch for a set of target routing controls. You can use this to manually override automated fail over, for example.
    */
  var TargetControls: listOfStringMin1Max256PatternAZaZ09
  
  /**
    * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
    */
  var WaitPeriodMs: integer
}
object GatingRule {
  
  inline def apply(
    ControlPanelArn: stringMin1Max256PatternAZaZ09,
    GatingControls: listOfStringMin1Max256PatternAZaZ09,
    Name: stringMin1Max64PatternS,
    RuleConfig: RuleConfig,
    SafetyRuleArn: stringMin1Max256PatternAZaZ09,
    Status: Status,
    TargetControls: listOfStringMin1Max256PatternAZaZ09,
    WaitPeriodMs: integer
  ): GatingRule = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any], GatingControls = GatingControls.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleConfig = RuleConfig.asInstanceOf[js.Any], SafetyRuleArn = SafetyRuleArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TargetControls = TargetControls.asInstanceOf[js.Any], WaitPeriodMs = WaitPeriodMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatingRule]
  }
  
  extension [Self <: GatingRule](x: Self) {
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setGatingControls(value: listOfStringMin1Max256PatternAZaZ09): Self = StObject.set(x, "GatingControls", value.asInstanceOf[js.Any])
    
    inline def setGatingControlsVarargs(value: stringMin1Max256PatternAZaZ09*): Self = StObject.set(x, "GatingControls", js.Array(value*))
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleConfig(value: RuleConfig): Self = StObject.set(x, "RuleConfig", value.asInstanceOf[js.Any])
    
    inline def setSafetyRuleArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "SafetyRuleArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTargetControls(value: listOfStringMin1Max256PatternAZaZ09): Self = StObject.set(x, "TargetControls", value.asInstanceOf[js.Any])
    
    inline def setTargetControlsVarargs(value: stringMin1Max256PatternAZaZ09*): Self = StObject.set(x, "TargetControls", js.Array(value*))
    
    inline def setWaitPeriodMs(value: integer): Self = StObject.set(x, "WaitPeriodMs", value.asInstanceOf[js.Any])
  }
}
