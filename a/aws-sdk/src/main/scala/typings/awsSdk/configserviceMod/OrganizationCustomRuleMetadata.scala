package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationCustomRuleMetadata extends StObject {
  
  /**
    * The description that you provide for organization config rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.native
  
  /**
    * A string, in JSON format, that is passed to organization config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.native
  
  /**
    * The lambda function ARN.
    */
  var LambdaFunctionArn: StringWithCharLimit256 = js.native
  
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.  
    */
  var OrganizationConfigRuleTriggerTypes: typings.awsSdk.configserviceMod.OrganizationConfigRuleTriggerTypes = js.native
  
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.native
  
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typings.awsSdk.configserviceMod.ResourceTypesScope] = js.native
  
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values. 
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.native
  
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). 
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.native
}
object OrganizationCustomRuleMetadata {
  
  @scala.inline
  def apply(
    LambdaFunctionArn: StringWithCharLimit256,
    OrganizationConfigRuleTriggerTypes: OrganizationConfigRuleTriggerTypes
  ): OrganizationCustomRuleMetadata = {
    val __obj = js.Dynamic.literal(LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any], OrganizationConfigRuleTriggerTypes = OrganizationConfigRuleTriggerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationCustomRuleMetadata]
  }
  
  @scala.inline
  implicit class OrganizationCustomRuleMetadataMutableBuilder[Self <: OrganizationCustomRuleMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StringWithCharLimit256Min0): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInputParameters(value: StringWithCharLimit2048): Self = StObject.set(x, "InputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParametersUndefined: Self = StObject.set(x, "InputParameters", js.undefined)
    
    @scala.inline
    def setLambdaFunctionArn(value: StringWithCharLimit256): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleTriggerTypes(value: OrganizationConfigRuleTriggerTypes): Self = StObject.set(x, "OrganizationConfigRuleTriggerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleTriggerTypesVarargs(value: OrganizationConfigRuleTriggerType*): Self = StObject.set(x, "OrganizationConfigRuleTriggerTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdScope(value: StringWithCharLimit768): Self = StObject.set(x, "ResourceIdScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdScopeUndefined: Self = StObject.set(x, "ResourceIdScope", js.undefined)
    
    @scala.inline
    def setResourceTypesScope(value: ResourceTypesScope): Self = StObject.set(x, "ResourceTypesScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesScopeUndefined: Self = StObject.set(x, "ResourceTypesScope", js.undefined)
    
    @scala.inline
    def setResourceTypesScopeVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceTypesScope", js.Array(value :_*))
    
    @scala.inline
    def setTagKeyScope(value: StringWithCharLimit128): Self = StObject.set(x, "TagKeyScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyScopeUndefined: Self = StObject.set(x, "TagKeyScope", js.undefined)
    
    @scala.inline
    def setTagValueScope(value: StringWithCharLimit256): Self = StObject.set(x, "TagValueScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValueScopeUndefined: Self = StObject.set(x, "TagValueScope", js.undefined)
  }
}
