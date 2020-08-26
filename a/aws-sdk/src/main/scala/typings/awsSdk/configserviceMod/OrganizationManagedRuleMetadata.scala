package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationManagedRuleMetadata extends js.Object {
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
  implicit class OrganizationManagedRuleMetadataOps[Self <: OrganizationManagedRuleMetadata] (val x: Self) extends AnyVal {
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
    def setRuleIdentifier(value: StringWithCharLimit256): Self = this.set("RuleIdentifier", value.asInstanceOf[js.Any])
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

