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
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.native
  /**
    * The time that you first activated the AWS Config rule.
    */
  var FirstActivatedTime: js.UndefOr[Date] = js.native
  /**
    * Indicates whether AWS Config has evaluated your resources against the rule at least once.    true - AWS Config has evaluated your AWS resources against the rule at least once.    false - AWS Config has not once finished evaluating your AWS resources against the rule.  
    */
  var FirstEvaluationStarted: js.UndefOr[Boolean] = js.native
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
  def apply(
    ConfigRuleArn: String = null,
    ConfigRuleId: String = null,
    ConfigRuleName: StringWithCharLimit64 = null,
    FirstActivatedTime: Date = null,
    FirstEvaluationStarted: js.UndefOr[scala.Boolean] = js.undefined,
    LastErrorCode: String = null,
    LastErrorMessage: String = null,
    LastFailedEvaluationTime: Date = null,
    LastFailedInvocationTime: Date = null,
    LastSuccessfulEvaluationTime: Date = null,
    LastSuccessfulInvocationTime: Date = null
  ): ConfigRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleArn != null) __obj.updateDynamic("ConfigRuleArn")(ConfigRuleArn.asInstanceOf[js.Any])
    if (ConfigRuleId != null) __obj.updateDynamic("ConfigRuleId")(ConfigRuleId.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    if (FirstActivatedTime != null) __obj.updateDynamic("FirstActivatedTime")(FirstActivatedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(FirstEvaluationStarted)) __obj.updateDynamic("FirstEvaluationStarted")(FirstEvaluationStarted.asInstanceOf[js.Any])
    if (LastErrorCode != null) __obj.updateDynamic("LastErrorCode")(LastErrorCode.asInstanceOf[js.Any])
    if (LastErrorMessage != null) __obj.updateDynamic("LastErrorMessage")(LastErrorMessage.asInstanceOf[js.Any])
    if (LastFailedEvaluationTime != null) __obj.updateDynamic("LastFailedEvaluationTime")(LastFailedEvaluationTime.asInstanceOf[js.Any])
    if (LastFailedInvocationTime != null) __obj.updateDynamic("LastFailedInvocationTime")(LastFailedInvocationTime.asInstanceOf[js.Any])
    if (LastSuccessfulEvaluationTime != null) __obj.updateDynamic("LastSuccessfulEvaluationTime")(LastSuccessfulEvaluationTime.asInstanceOf[js.Any])
    if (LastSuccessfulInvocationTime != null) __obj.updateDynamic("LastSuccessfulInvocationTime")(LastSuccessfulInvocationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRuleEvaluationStatus]
  }
}

