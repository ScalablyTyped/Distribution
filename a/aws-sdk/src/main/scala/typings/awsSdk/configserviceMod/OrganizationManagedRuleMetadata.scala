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
  def apply(
    RuleIdentifier: StringWithCharLimit256,
    Description: StringWithCharLimit256Min0 = null,
    InputParameters: StringWithCharLimit2048 = null,
    MaximumExecutionFrequency: MaximumExecutionFrequency = null,
    ResourceIdScope: StringWithCharLimit768 = null,
    ResourceTypesScope: ResourceTypesScope = null,
    TagKeyScope: StringWithCharLimit128 = null,
    TagValueScope: StringWithCharLimit256 = null
  ): OrganizationManagedRuleMetadata = {
    val __obj = js.Dynamic.literal(RuleIdentifier = RuleIdentifier.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (InputParameters != null) __obj.updateDynamic("InputParameters")(InputParameters.asInstanceOf[js.Any])
    if (MaximumExecutionFrequency != null) __obj.updateDynamic("MaximumExecutionFrequency")(MaximumExecutionFrequency.asInstanceOf[js.Any])
    if (ResourceIdScope != null) __obj.updateDynamic("ResourceIdScope")(ResourceIdScope.asInstanceOf[js.Any])
    if (ResourceTypesScope != null) __obj.updateDynamic("ResourceTypesScope")(ResourceTypesScope.asInstanceOf[js.Any])
    if (TagKeyScope != null) __obj.updateDynamic("TagKeyScope")(TagKeyScope.asInstanceOf[js.Any])
    if (TagValueScope != null) __obj.updateDynamic("TagValueScope")(TagValueScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationManagedRuleMetadata]
  }
}

