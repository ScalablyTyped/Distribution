package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationManagedRuleMetadata extends StObject {
  
  /**
    * The description that you provide for organization config rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.native
  
  /**
    * A string, in JSON format, that is passed to organization config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.native
  
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that is triggered at a periodic frequency.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.native
  
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typings.awsSdk.configserviceMod.ResourceTypesScope] = js.native
  
  /**
    * For organization config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using AWS Managed Config Rules.
    */
  var RuleIdentifier: StringWithCharLimit256 = js.native
  
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values. 
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.native
  
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.native
}
object OrganizationManagedRuleMetadata {
  
  @scala.inline
  def apply(RuleIdentifier: StringWithCharLimit256): OrganizationManagedRuleMetadata = {
    val __obj = js.Dynamic.literal(RuleIdentifier = RuleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationManagedRuleMetadata]
  }
  
  @scala.inline
  implicit class OrganizationManagedRuleMetadataMutableBuilder[Self <: OrganizationManagedRuleMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StringWithCharLimit256Min0): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInputParameters(value: StringWithCharLimit2048): Self = StObject.set(x, "InputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParametersUndefined: Self = StObject.set(x, "InputParameters", js.undefined)
    
    @scala.inline
    def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
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
    def setRuleIdentifier(value: StringWithCharLimit256): Self = StObject.set(x, "RuleIdentifier", value.asInstanceOf[js.Any])
    
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
