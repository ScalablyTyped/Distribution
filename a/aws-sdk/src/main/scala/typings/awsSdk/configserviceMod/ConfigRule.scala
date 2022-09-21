package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Config rule.
    */
  var ConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The ID of the Config rule.
    */
  var ConfigRuleId: js.UndefOr[StringWithCharLimit64] = js.undefined
  
  /**
    * The name that you assign to the Config rule. The name is required if you are adding a new rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.undefined
  
  /**
    * Indicates whether the Config rule is active or is currently being deleted by Config. It can also indicate the evaluation status for the Config rule. Config sets the state of the rule to EVALUATING temporarily after you use the StartConfigRulesEvaluation request to evaluate your resources against the Config rule. Config sets the state of the rule to DELETING_RESULTS temporarily after you use the DeleteEvaluationResults request to delete the current evaluation results for the Config rule. Config temporarily sets the state of a rule to DELETING after you use the DeleteConfigRule request to delete the rule. After Config deletes the rule, the rule and all of its evaluations are erased and are no longer available.
    */
  var ConfigRuleState: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleState] = js.undefined
  
  /**
    * Service principal name of the service that created the rule.  The field is populated only if the service-linked rule is created by a service. The field is empty if you create your own rule. 
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The description that you provide for the Config rule.
    */
  var Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.undefined
  
  /**
    * A string, in JSON format, that is passed to the Config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * The maximum frequency with which Config runs evaluations for a rule. You can specify a value for MaximumExecutionFrequency when:   This is for an Config managed rule that is triggered at a periodic frequency.   Your custom rule is triggered when Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.    By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.undefined
  
  /**
    * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types, a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are triggered when any resource in the recording group changes.  The scope can be empty.  
    */
  var Scope: js.UndefOr[typings.awsSdk.configserviceMod.Scope] = js.undefined
  
  /**
    * Provides the rule owner (Amazon Web Services for managed rules, CUSTOM_POLICY for Custom Policy rules, and CUSTOM_LAMBDA for Custom Lambda rules), the rule identifier, and the notifications that cause the function to evaluate your Amazon Web Services resources.
    */
  var Source: typings.awsSdk.configserviceMod.Source
}
object ConfigRule {
  
  inline def apply(Source: Source): ConfigRule = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRule]
  }
  
  extension [Self <: ConfigRule](x: Self) {
    
    inline def setConfigRuleArn(value: StringWithCharLimit256): Self = StObject.set(x, "ConfigRuleArn", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleArnUndefined: Self = StObject.set(x, "ConfigRuleArn", js.undefined)
    
    inline def setConfigRuleId(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleId", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleIdUndefined: Self = StObject.set(x, "ConfigRuleId", js.undefined)
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    inline def setConfigRuleState(value: ConfigRuleState): Self = StObject.set(x, "ConfigRuleState", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleStateUndefined: Self = StObject.set(x, "ConfigRuleState", js.undefined)
    
    inline def setCreatedBy(value: StringWithCharLimit256): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDescription(value: EmptiableStringWithCharLimit256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInputParameters(value: StringWithCharLimit1024): Self = StObject.set(x, "InputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "InputParameters", js.undefined)
    
    inline def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
