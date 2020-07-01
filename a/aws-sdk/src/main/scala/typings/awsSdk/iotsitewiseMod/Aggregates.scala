package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregates extends js.Object {
  /**
    * The average (mean) value of the time series over a time interval window.
    */
  var average: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The count of data points in the time series over a time interval window.
    */
  var count: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The maximum value of the time series over a time interval window.
    */
  var maximum: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The minimum value of the time series over a time interval window.
    */
  var minimum: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The standard deviation of the time series over a time interval window.
    */
  var standardDeviation: js.UndefOr[AggregatedDoubleValue] = js.native
  /**
    * The sum of the time series over a time interval window.
    */
  var sum: js.UndefOr[AggregatedDoubleValue] = js.native
}

object Aggregates {
  @scala.inline
  def apply(
    average: js.UndefOr[AggregatedDoubleValue] = js.undefined,
    count: js.UndefOr[AggregatedDoubleValue] = js.undefined,
    maximum: js.UndefOr[AggregatedDoubleValue] = js.undefined,
    minimum: js.UndefOr[AggregatedDoubleValue] = js.undefined,
    standardDeviation: js.UndefOr[AggregatedDoubleValue] = js.undefined,
    sum: js.UndefOr[AggregatedDoubleValue] = js.undefined
  ): Aggregates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standardDeviation)) __obj.updateDynamic("standardDeviation")(standardDeviation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregates]
  }
}

