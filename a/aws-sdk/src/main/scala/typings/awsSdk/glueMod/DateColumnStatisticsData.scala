package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateColumnStatisticsData extends js.Object {
  /**
    * Maximum value of the column.
    */
  var MaximumValue: js.UndefOr[Timestamp] = js.native
  /**
    * Minimum value of the column.
    */
  var MinimumValue: js.UndefOr[Timestamp] = js.native
  /**
    * Number of distinct values.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  /**
    * Number of nulls.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}

object DateColumnStatisticsData {
  @scala.inline
  def apply(
    NumberOfDistinctValues: NonNegativeLong,
    NumberOfNulls: NonNegativeLong,
    MaximumValue: Timestamp = null,
    MinimumValue: Timestamp = null
  ): DateColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    if (MaximumValue != null) __obj.updateDynamic("MaximumValue")(MaximumValue.asInstanceOf[js.Any])
    if (MinimumValue != null) __obj.updateDynamic("MinimumValue")(MinimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateColumnStatisticsData]
  }
}

