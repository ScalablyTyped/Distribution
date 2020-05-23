package typings.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSamplingStatisticSummary extends SamplingStatisticSummary {
  /**
    * <p>The start time of the reporting window.</p>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledSamplingStatisticSummary: js.UndefOr[Date] = js.undefined
}

object UnmarshalledSamplingStatisticSummary {
  @scala.inline
  def apply(
    BorrowCount: js.UndefOr[Double] = js.undefined,
    RequestCount: js.UndefOr[Double] = js.undefined,
    RuleName: String = null,
    SampledCount: js.UndefOr[Double] = js.undefined,
    Timestamp: Date = null
  ): UnmarshalledSamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BorrowCount)) __obj.updateDynamic("BorrowCount")(BorrowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestCount)) __obj.updateDynamic("RequestCount")(RequestCount.get.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    if (!js.isUndefined(SampledCount)) __obj.updateDynamic("SampledCount")(SampledCount.get.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingStatisticSummary]
  }
}

