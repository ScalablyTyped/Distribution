package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataBinMetrics extends js.Object {
  /* The average value of the aggregation property of the pushpins in a data bin. */
  var average: js.UndefOr[scala.Double] = js.undefined
  /* The number of pushpins in a data bin. */
  var count: js.UndefOr[scala.Double] = js.undefined
  /* The number of pushpins in the data bin who's aggregation property has a value. */
  var countNotBlank: js.UndefOr[scala.Double] = js.undefined
  /* The number of pushpins in the data bin who's aggregation property is a valid number. */
  var countNumbers: js.UndefOr[scala.Double] = js.undefined
  /* The sum of the aggregation property of the pushpins in a data bin.  */
  var sum: js.UndefOr[scala.Double] = js.undefined
}

object IDataBinMetrics {
  @scala.inline
  def apply(
    average: scala.Int | scala.Double = null,
    count: scala.Int | scala.Double = null,
    countNotBlank: scala.Int | scala.Double = null,
    countNumbers: scala.Int | scala.Double = null,
    sum: scala.Int | scala.Double = null
  ): IDataBinMetrics = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (countNotBlank != null) __obj.updateDynamic("countNotBlank")(countNotBlank.asInstanceOf[js.Any])
    if (countNumbers != null) __obj.updateDynamic("countNumbers")(countNumbers.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataBinMetrics]
  }
}

