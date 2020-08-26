package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaluation extends js.Object {
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ComplianceResourceId: BaseResourceId = js.native
  /**
    * The type of AWS resource that was evaluated.
    */
  var ComplianceResourceType: StringWithCharLimit256 = js.native
  /**
    * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against. For the Evaluation data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for this data type. Similarly, AWS Config does not accept INSUFFICIENT_DATA as the value for ComplianceType from a PutEvaluations request. For example, an AWS Lambda function for a custom AWS Config rule cannot pass an INSUFFICIENT_DATA value to AWS Config.
    */
  var ComplianceType: typings.awsSdk.configserviceMod.ComplianceType = js.native
  /**
    * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations, the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example, every 24 hours).
    */
  var OrderingTimestamp: typings.awsSdk.configserviceMod.OrderingTimestamp = js.native
}

object Evaluation {
  @scala.inline
  def apply(
    ComplianceResourceId: BaseResourceId,
    ComplianceResourceType: StringWithCharLimit256,
    ComplianceType: ComplianceType,
    OrderingTimestamp: OrderingTimestamp
  ): Evaluation = {
    val __obj = js.Dynamic.literal(ComplianceResourceId = ComplianceResourceId.asInstanceOf[js.Any], ComplianceResourceType = ComplianceResourceType.asInstanceOf[js.Any], ComplianceType = ComplianceType.asInstanceOf[js.Any], OrderingTimestamp = OrderingTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluation]
  }
  @scala.inline
  implicit class EvaluationOps[Self <: Evaluation] (val x: Self) extends AnyVal {
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
    def setComplianceResourceId(value: BaseResourceId): Self = this.set("ComplianceResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplianceResourceType(value: StringWithCharLimit256): Self = this.set("ComplianceResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderingTimestamp(value: OrderingTimestamp): Self = this.set("OrderingTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotation(value: StringWithCharLimit256): Self = this.set("Annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotation: Self = this.set("Annotation", js.undefined)
  }
  
}

