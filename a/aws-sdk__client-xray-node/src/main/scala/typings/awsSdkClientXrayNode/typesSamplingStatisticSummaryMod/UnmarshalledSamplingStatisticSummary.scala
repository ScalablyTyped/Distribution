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
    BorrowCount: Int | Double = null,
    RequestCount: Int | Double = null,
    RuleName: String = null,
    SampledCount: Int | Double = null,
    Timestamp: Date = null
  ): UnmarshalledSamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    if (RequestCount != null) __obj.updateDynamic("RequestCount")(RequestCount.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    if (SampledCount != null) __obj.updateDynamic("SampledCount")(SampledCount.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingStatisticSummary]
  }
}

