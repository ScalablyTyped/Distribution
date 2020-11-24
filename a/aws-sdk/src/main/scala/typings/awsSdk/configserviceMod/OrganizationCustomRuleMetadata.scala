package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationCustomRuleMetadata extends js.Object {
  
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
  implicit class OrganizationCustomRuleMetadataOps[Self <: OrganizationCustomRuleMetadata] (val x: Self) extends AnyVal {
    
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
    def setLambdaFunctionArn(value: StringWithCharLimit256): Self = this.set("LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleTriggerTypesVarargs(value: OrganizationConfigRuleTriggerType*): Self = this.set("OrganizationConfigRuleTriggerTypes", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationConfigRuleTriggerTypes(value: OrganizationConfigRuleTriggerTypes): Self = this.set("OrganizationConfigRuleTriggerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: StringWithCharLimit256Min0): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setInputParameters(value: StringWithCharLimit2048): Self = this.set("InputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputParameters: Self = this.set("InputParameters", js.undefined)
    
    @scala.inline
    def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = this.set("MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumExecutionFrequency: Self = this.set("MaximumExecutionFrequency", js.undefined)
    
    @scala.inline
    def setResourceIdScope(value: StringWithCharLimit768): Self = this.set("ResourceIdScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdScope: Self = this.set("ResourceIdScope", js.undefined)
    
    @scala.inline
    def setResourceTypesScopeVarargs(value: StringWithCharLimit256*): Self = this.set("ResourceTypesScope", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypesScope(value: ResourceTypesScope): Self = this.set("ResourceTypesScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypesScope: Self = this.set("ResourceTypesScope", js.undefined)
    
    @scala.inline
    def setTagKeyScope(value: StringWithCharLimit128): Self = this.set("TagKeyScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagKeyScope: Self = this.set("TagKeyScope", js.undefined)
    
    @scala.inline
    def setTagValueScope(value: StringWithCharLimit256): Self = this.set("TagValueScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagValueScope: Self = this.set("TagValueScope", js.undefined)
  }
}
