package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRuleEvaluationStatus extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Config rule.
    */
  var ConfigRuleArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS Config rule.
    */
  var ConfigRuleId: js.UndefOr[String] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.native
  /**
    * The time that you first activated the AWS Config rule.
    */
  var FirstActivatedTime: js.UndefOr[Date] = js.native
  /**
    * Indicates whether AWS Config has evaluated your resources against the rule at least once.    true - AWS Config has evaluated your AWS resources against the rule at least once.    false - AWS Config has not once finished evaluating your AWS resources against the rule.  
    */
  var FirstEvaluationStarted: js.UndefOr[Boolean] = js.native
  /**
    * The time that you last turned off the AWS Config rule.
    */
  var LastDeactivatedTime: js.UndefOr[Date] = js.native
  /**
    * The error code that AWS Config returned when the rule last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message that AWS Config returned when the rule last failed.
    */
  var LastErrorMessage: js.UndefOr[String] = js.native
  /**
    * The time that AWS Config last failed to evaluate your AWS resources against the rule.
    */
  var LastFailedEvaluationTime: js.UndefOr[Date] = js.native
  /**
    * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
    */
  var LastFailedInvocationTime: js.UndefOr[Date] = js.native
  /**
    * The time that AWS Config last successfully evaluated your AWS resources against the rule.
    */
  var LastSuccessfulEvaluationTime: js.UndefOr[Date] = js.native
  /**
    * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
    */
  var LastSuccessfulInvocationTime: js.UndefOr[Date] = js.native
}

object ConfigRuleEvaluationStatus {
  @scala.inline
  def apply(): ConfigRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleEvaluationStatus]
  }
  @scala.inline
  implicit class ConfigRuleEvaluationStatusOps[Self <: ConfigRuleEvaluationStatus] (val x: Self) extends AnyVal {
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
    def setConfigRuleArn(value: String): Self = this.set("ConfigRuleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigRuleArn: Self = this.set("ConfigRuleArn", js.undefined)
    @scala.inline
    def setConfigRuleId(value: String): Self = this.set("ConfigRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigRuleId: Self = this.set("ConfigRuleId", js.undefined)
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigRuleName: Self = this.set("ConfigRuleName", js.undefined)
    @scala.inline
    def setFirstActivatedTime(value: Date): Self = this.set("FirstActivatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstActivatedTime: Self = this.set("FirstActivatedTime", js.undefined)
    @scala.inline
    def setFirstEvaluationStarted(value: Boolean): Self = this.set("FirstEvaluationStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstEvaluationStarted: Self = this.set("FirstEvaluationStarted", js.undefined)
    @scala.inline
    def setLastDeactivatedTime(value: Date): Self = this.set("LastDeactivatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDeactivatedTime: Self = this.set("LastDeactivatedTime", js.undefined)
    @scala.inline
    def setLastErrorCode(value: String): Self = this.set("LastErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastErrorCode: Self = this.set("LastErrorCode", js.undefined)
    @scala.inline
    def setLastErrorMessage(value: String): Self = this.set("LastErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastErrorMessage: Self = this.set("LastErrorMessage", js.undefined)
    @scala.inline
    def setLastFailedEvaluationTime(value: Date): Self = this.set("LastFailedEvaluationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFailedEvaluationTime: Self = this.set("LastFailedEvaluationTime", js.undefined)
    @scala.inline
    def setLastFailedInvocationTime(value: Date): Self = this.set("LastFailedInvocationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFailedInvocationTime: Self = this.set("LastFailedInvocationTime", js.undefined)
    @scala.inline
    def setLastSuccessfulEvaluationTime(value: Date): Self = this.set("LastSuccessfulEvaluationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSuccessfulEvaluationTime: Self = this.set("LastSuccessfulEvaluationTime", js.undefined)
    @scala.inline
    def setLastSuccessfulInvocationTime(value: Date): Self = this.set("LastSuccessfulInvocationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSuccessfulInvocationTime: Self = this.set("LastSuccessfulInvocationTime", js.undefined)
  }
  
}

