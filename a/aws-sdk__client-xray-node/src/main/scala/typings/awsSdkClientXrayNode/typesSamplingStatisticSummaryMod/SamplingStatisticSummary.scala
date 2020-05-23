package typings.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStatisticSummary extends js.Object {
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The start time of the reporting window.</p>
    */
  var Timestamp: js.UndefOr[Date | String | Double] = js.undefined
}

object SamplingStatisticSummary {
  @scala.inline
  def apply(
    BorrowCount: js.UndefOr[Double] = js.undefined,
    RequestCount: js.UndefOr[Double] = js.undefined,
    RuleName: String = null,
    SampledCount: js.UndefOr[Double] = js.undefined,
    Timestamp: Date | String | Double = null
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

