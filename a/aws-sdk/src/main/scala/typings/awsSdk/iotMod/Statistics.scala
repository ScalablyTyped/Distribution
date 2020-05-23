package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  /**
    * The average of the aggregated field values.
    */
  var average: js.UndefOr[Average] = js.native
  /**
    * The count of things that match the query.
    */
  var count: js.UndefOr[Count] = js.native
  /**
    * The maximum aggregated field value.
    */
  var maximum: js.UndefOr[Maximum] = js.native
  /**
    * The minimum aggregated field value.
    */
  var minimum: js.UndefOr[Minimum] = js.native
  /**
    * The standard deviation of the aggregated field values.
    */
  var stdDeviation: js.UndefOr[StdDeviation] = js.native
  /**
    * The sum of the aggregated field values.
    */
  var sum: js.UndefOr[Sum] = js.native
  /**
    * The sum of the squares of the aggregated field values.
    */
  var sumOfSquares: js.UndefOr[SumOfSquares] = js.native
  /**
    * The variance of the aggregated field values.
    */
  var variance: js.UndefOr[Variance] = js.native
}

object Statistics {
  @scala.inline
  def apply(
    average: js.UndefOr[Average] = js.undefined,
    count: js.UndefOr[Count] = js.undefined,
    maximum: js.UndefOr[Maximum] = js.undefined,
    minimum: js.UndefOr[Minimum] = js.undefined,
    stdDeviation: js.UndefOr[StdDeviation] = js.undefined,
    sum: js.UndefOr[Sum] = js.undefined,
    sumOfSquares: js.UndefOr[SumOfSquares] = js.undefined,
    variance: js.UndefOr[Variance] = js.undefined
  ): Statistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdDeviation)) __obj.updateDynamic("stdDeviation")(stdDeviation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOfSquares)) __obj.updateDynamic("sumOfSquares")(sumOfSquares.get.asInstanceOf[js.Any])
    if (!js.isUndefined(variance)) __obj.updateDynamic("variance")(variance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

