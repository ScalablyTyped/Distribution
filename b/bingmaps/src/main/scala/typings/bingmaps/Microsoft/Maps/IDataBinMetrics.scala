package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataBinMetrics extends js.Object {
  /* The average value of the aggregation property of the pushpins in a data bin. */
  var average: js.UndefOr[Double] = js.undefined
  /* The number of pushpins in a data bin. */
  var count: js.UndefOr[Double] = js.undefined
  /* The number of pushpins in the data bin who's aggregation property has a value. */
  var countNotBlank: js.UndefOr[Double] = js.undefined
  /* The number of pushpins in the data bin who's aggregation property is a valid number. */
  var countNumbers: js.UndefOr[Double] = js.undefined
  /* The sum of the aggregation property of the pushpins in a data bin.  */
  var sum: js.UndefOr[Double] = js.undefined
}

object IDataBinMetrics {
  @scala.inline
  def apply(
    average: js.UndefOr[Double] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    countNotBlank: js.UndefOr[Double] = js.undefined,
    countNumbers: js.UndefOr[Double] = js.undefined,
    sum: js.UndefOr[Double] = js.undefined
  ): IDataBinMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(countNotBlank)) __obj.updateDynamic("countNotBlank")(countNotBlank.get.asInstanceOf[js.Any])
    if (!js.isUndefined(countNumbers)) __obj.updateDynamic("countNumbers")(countNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataBinMetrics]
  }
}

