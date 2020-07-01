package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryColumnStatisticsData extends js.Object {
  /**
    * Average length of the column.
    */
  var AverageLength: NonNegativeDouble = js.native
  /**
    * Maximum length of the column.
    */
  var MaximumLength: NonNegativeLong = js.native
  /**
    * Number of nulls.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}

object BinaryColumnStatisticsData {
  @scala.inline
  def apply(AverageLength: NonNegativeDouble, MaximumLength: NonNegativeLong, NumberOfNulls: NonNegativeLong): BinaryColumnStatisticsData = {
    val __obj = js.Dynamic.literal(AverageLength = AverageLength.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryColumnStatisticsData]
  }
}

