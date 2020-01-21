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
    Avg: Int | scala.Double = null,
    Count: Int | scala.Double = null,
    CountDistinct: Int | scala.Double = null,
    CountNan: Int | scala.Double = null,
    CountNull: Int | scala.Double = null,
    Max: String = null,
    Min: String = null,
    Stddev: Int | scala.Double = null
  ): Statistics = {
    val __obj = js.Dynamic.literal()
    if (Avg != null) __obj.updateDynamic("Avg")(Avg.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (CountDistinct != null) __obj.updateDynamic("CountDistinct")(CountDistinct.asInstanceOf[js.Any])
    if (CountNan != null) __obj.updateDynamic("CountNan")(CountNan.asInstanceOf[js.Any])
    if (CountNull != null) __obj.updateDynamic("CountNull")(CountNull.asInstanceOf[js.Any])
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (Min != null) __obj.updateDynamic("Min")(Min.asInstanceOf[js.Any])
    if (Stddev != null) __obj.updateDynamic("Stddev")(Stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

