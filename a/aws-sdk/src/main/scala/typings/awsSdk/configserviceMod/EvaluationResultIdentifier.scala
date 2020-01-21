package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResultIdentifier extends js.Object {
  /**
    * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated resource.
    */
  var EvaluationResultQualifier: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResultQualifier] = js.native
  /**
    * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config delivered a configuration item change notification, or it can indicate when AWS Config delivered the configuration snapshot, depending on which event triggered the evaluation.
    */
  var OrderingTimestamp: js.UndefOr[Date] = js.native
}

object EvaluationResultIdentifier {
  @scala.inline
  def apply(EvaluationResultQualifier: EvaluationResultQualifier = null, OrderingTimestamp: Date = null): EvaluationResultIdentifier = {
    val __obj = js.Dynamic.literal()
    if (EvaluationResultQualifier != null) __obj.updateDynamic("EvaluationResultQualifier")(EvaluationResultQualifier.asInstanceOf[js.Any])
    if (OrderingTimestamp != null) __obj.updateDynamic("OrderingTimestamp")(OrderingTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResultIdentifier]
  }
}

