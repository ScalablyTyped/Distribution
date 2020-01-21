package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateEvaluationResult extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * Supplementary information about how the agrregate evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * The resource compliance status. For the AggregationEvaluationResult data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA value.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.native
  /**
    * The time when the AWS Config rule evaluated the AWS resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[Date] = js.native
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResultIdentifier] = js.native
  /**
    * The time when AWS Config recorded the aggregate evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[Date] = js.native
}

object AggregateEvaluationResult {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    Annotation: StringWithCharLimit256 = null,
    AwsRegion: AwsRegion = null,
    ComplianceType: ComplianceType = null,
    ConfigRuleInvokedTime: Date = null,
    EvaluationResultIdentifier: EvaluationResultIdentifier = null,
    ResultRecordedTime: Date = null
  ): AggregateEvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Annotation != null) __obj.updateDynamic("Annotation")(Annotation.asInstanceOf[js.Any])
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleInvokedTime != null) __obj.updateDynamic("ConfigRuleInvokedTime")(ConfigRuleInvokedTime.asInstanceOf[js.Any])
    if (EvaluationResultIdentifier != null) __obj.updateDynamic("EvaluationResultIdentifier")(EvaluationResultIdentifier.asInstanceOf[js.Any])
    if (ResultRecordedTime != null) __obj.updateDynamic("ResultRecordedTime")(ResultRecordedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateEvaluationResult]
  }
}

