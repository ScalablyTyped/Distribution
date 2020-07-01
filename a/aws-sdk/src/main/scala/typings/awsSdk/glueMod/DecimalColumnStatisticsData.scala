package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecimalColumnStatisticsData extends js.Object {
  /**
    * Maximum value of the column.
    */
  var MaximumValue: js.UndefOr[DecimalNumber] = js.native
  /**
    * Minimum value of the column.
    */
  var MinimumValue: js.UndefOr[DecimalNumber] = js.native
  /**
    * Number of distinct values.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  /**
    * Number of nulls.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}

object DecimalColumnStatisticsData {
  @scala.inline
  def apply(
    NumberOfDistinctValues: NonNegativeLong,
    NumberOfNulls: NonNegativeLong,
    MaximumValue: DecimalNumber = null,
    MinimumValue: DecimalNumber = null
  ): DecimalColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    if (MaximumValue != null) __obj.updateDynamic("MaximumValue")(MaximumValue.asInstanceOf[js.Any])
    if (MinimumValue != null) __obj.updateDynamic("MinimumValue")(MinimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalColumnStatisticsData]
  }
}

