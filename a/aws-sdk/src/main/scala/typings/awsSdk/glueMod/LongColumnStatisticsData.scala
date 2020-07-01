package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongColumnStatisticsData extends js.Object {
  /**
    * Maximum value of the column.
    */
  var MaximumValue: js.UndefOr[Long] = js.native
  /**
    * Minimum value of the column.
    */
  var MinimumValue: js.UndefOr[Long] = js.native
  /**
    * Number of distinct values.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  /**
    * Number of nulls.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}

object LongColumnStatisticsData {
  @scala.inline
  def apply(
    NumberOfDistinctValues: NonNegativeLong,
    NumberOfNulls: NonNegativeLong,
    MaximumValue: js.UndefOr[Long] = js.undefined,
    MinimumValue: js.UndefOr[Long] = js.undefined
  ): LongColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumValue)) __obj.updateDynamic("MaximumValue")(MaximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumValue)) __obj.updateDynamic("MinimumValue")(MinimumValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongColumnStatisticsData]
  }
}

