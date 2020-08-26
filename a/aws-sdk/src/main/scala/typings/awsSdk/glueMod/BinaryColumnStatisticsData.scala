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
  @scala.inline
  implicit class BinaryColumnStatisticsDataOps[Self <: BinaryColumnStatisticsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAverageLength(value: NonNegativeDouble): Self = this.set("AverageLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumLength(value: NonNegativeLong): Self = this.set("MaximumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = this.set("NumberOfNulls", value.asInstanceOf[js.Any])
  }
  
}

