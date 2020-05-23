package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  /**
    * For a numeric field, the average value in the field.
    */
  var Avg: js.UndefOr[Double] = js.native
  /**
    * The number of values in the field.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The number of distinct values in the field.
    */
  var CountDistinct: js.UndefOr[Integer] = js.native
  /**
    * The number of NAN (not a number) values in the field.
    */
  var CountNan: js.UndefOr[Integer] = js.native
  /**
    * The number of null values in the field.
    */
  var CountNull: js.UndefOr[Integer] = js.native
  /**
    * For a numeric field, the maximum value in the field.
    */
  var Max: js.UndefOr[String] = js.native
  /**
    * For a numeric field, the minimum value in the field.
    */
  var Min: js.UndefOr[String] = js.native
  /**
    * For a numeric field, the standard deviation.
    */
  var Stddev: js.UndefOr[Double] = js.native
}

object Statistics {
  @scala.inline
  def apply(
    Avg: js.UndefOr[Double] = js.undefined,
    Count: js.UndefOr[Integer] = js.undefined,
    CountDistinct: js.UndefOr[Integer] = js.undefined,
    CountNan: js.UndefOr[Integer] = js.undefined,
    CountNull: js.UndefOr[Integer] = js.undefined,
    Max: String = null,
    Min: String = null,
    Stddev: js.UndefOr[Double] = js.undefined
  ): Statistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Avg)) __obj.updateDynamic("Avg")(Avg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CountDistinct)) __obj.updateDynamic("CountDistinct")(CountDistinct.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CountNan)) __obj.updateDynamic("CountNan")(CountNan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CountNull)) __obj.updateDynamic("CountNull")(CountNull.get.asInstanceOf[js.Any])
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (Min != null) __obj.updateDynamic("Min")(Min.asInstanceOf[js.Any])
    if (!js.isUndefined(Stddev)) __obj.updateDynamic("Stddev")(Stddev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

