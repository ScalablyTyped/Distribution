package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticSummary extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[Integer] = js.native
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: js.UndefOr[Integer] = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
  /**
    * The number of requests recorded.
    */
  var SampledCount: js.UndefOr[Integer] = js.native
  /**
    * The start time of the reporting window.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.xrayMod.Timestamp] = js.native
}

object SamplingStatisticSummary {
  @scala.inline
  def apply(
    BorrowCount: js.UndefOr[Integer] = js.undefined,
    RequestCount: js.UndefOr[Integer] = js.undefined,
    RuleName: String = null,
    SampledCount: js.UndefOr[Integer] = js.undefined,
    Timestamp: Timestamp = null
  ): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BorrowCount)) __obj.updateDynamic("BorrowCount")(BorrowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestCount)) __obj.updateDynamic("RequestCount")(RequestCount.get.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    if (!js.isUndefined(SampledCount)) __obj.updateDynamic("SampledCount")(SampledCount.get.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
}

