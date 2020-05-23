package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationConfiguration extends js.Object {
  /**
    * Amazon Resource Name (ARN) of remediation configuration.
    */
  var Arn: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The remediation is triggered automatically.
    */
  var Automatic: js.UndefOr[Boolean] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * Name of the service that owns the service linked rule, if applicable.
    */
  var CreatedByService: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * An ExecutionControls object.
    */
  var ExecutionControls: js.UndefOr[typings.awsSdk.configserviceMod.ExecutionControls] = js.native
  /**
    * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5. For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config throws an exception after the 5th failed attempt within 50 seconds.
    */
  var MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts] = js.native
  /**
    * An object of the RemediationParameterValue.
    */
  var Parameters: js.UndefOr[RemediationParameters] = js.native
  /**
    * The type of a resource. 
    */
  var ResourceType: js.UndefOr[String] = js.native
  /**
    * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.  For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will run auto-remediations 5 times within 50 seconds before throwing an exception. 
    */
  var RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds] = js.native
  /**
    * Target ID is the name of the public document.
    */
  var TargetId: StringWithCharLimit256 = js.native
  /**
    * The type of the target. Target executes remediation. For example, SSM document.
    */
  var TargetType: RemediationTargetType = js.native
  /**
    * Version of the target. For example, version of the SSM document.
    */
  var TargetVersion: js.UndefOr[String] = js.native
}

object RemediationConfiguration {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    TargetId: StringWithCharLimit256,
    TargetType: RemediationTargetType,
    Arn: StringWithCharLimit1024 = null,
    Automatic: js.UndefOr[Boolean] = js.undefined,
    CreatedByService: StringWithCharLimit1024 = null,
    ExecutionControls: ExecutionControls = null,
    MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts] = js.undefined,
    Parameters: RemediationParameters = null,
    ResourceType: String = null,
    RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds] = js.undefined,
    TargetVersion: String = null
  ): RemediationConfiguration = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any], TargetType = TargetType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (!js.isUndefined(Automatic)) __obj.updateDynamic("Automatic")(Automatic.get.asInstanceOf[js.Any])
    if (CreatedByService != null) __obj.updateDynamic("CreatedByService")(CreatedByService.asInstanceOf[js.Any])
    if (ExecutionControls != null) __obj.updateDynamic("ExecutionControls")(ExecutionControls.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumAutomaticAttempts)) __obj.updateDynamic("MaximumAutomaticAttempts")(MaximumAutomaticAttempts.get.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(RetryAttemptSeconds)) __obj.updateDynamic("RetryAttemptSeconds")(RetryAttemptSeconds.get.asInstanceOf[js.Any])
    if (TargetVersion != null) __obj.updateDynamic("TargetVersion")(TargetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationConfiguration]
  }
}

