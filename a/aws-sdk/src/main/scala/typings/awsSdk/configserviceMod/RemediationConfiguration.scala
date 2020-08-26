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
    * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5. For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config will put a RemediationException on your behalf for the failing resource after the 5th failed attempt within 50 seconds.
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
    * Version of the target. For example, version of the SSM document.  If you make backward incompatible changes to the SSM document, you must call PutRemediationConfiguration API again to ensure the remediations can run. 
    */
  var TargetVersion: js.UndefOr[String] = js.native
}

object RemediationConfiguration {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    TargetId: StringWithCharLimit256,
    TargetType: RemediationTargetType
  ): RemediationConfiguration = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any], TargetType = TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationConfiguration]
  }
  @scala.inline
  implicit class RemediationConfigurationOps[Self <: RemediationConfiguration] (val x: Self) extends AnyVal {
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
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: StringWithCharLimit256): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetType(value: RemediationTargetType): Self = this.set("TargetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: StringWithCharLimit1024): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAutomatic(value: Boolean): Self = this.set("Automatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatic: Self = this.set("Automatic", js.undefined)
    @scala.inline
    def setCreatedByService(value: StringWithCharLimit1024): Self = this.set("CreatedByService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedByService: Self = this.set("CreatedByService", js.undefined)
    @scala.inline
    def setExecutionControls(value: ExecutionControls): Self = this.set("ExecutionControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionControls: Self = this.set("ExecutionControls", js.undefined)
    @scala.inline
    def setMaximumAutomaticAttempts(value: AutoRemediationAttempts): Self = this.set("MaximumAutomaticAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAutomaticAttempts: Self = this.set("MaximumAutomaticAttempts", js.undefined)
    @scala.inline
    def setParameters(value: RemediationParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setRetryAttemptSeconds(value: AutoRemediationAttemptSeconds): Self = this.set("RetryAttemptSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryAttemptSeconds: Self = this.set("RetryAttemptSeconds", js.undefined)
    @scala.inline
    def setTargetVersion(value: String): Self = this.set("TargetVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVersion: Self = this.set("TargetVersion", js.undefined)
  }
  
}

