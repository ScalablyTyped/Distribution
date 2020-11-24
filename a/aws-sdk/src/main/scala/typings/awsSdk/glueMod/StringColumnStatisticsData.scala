package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringColumnStatisticsData extends js.Object {
  
  /**
    * The average string length in the column.
    */
  var AverageLength: NonNegativeDouble = js.native
  
  /**
    * The size of the longest string in the column.
    */
  var MaximumLength: NonNegativeLong = js.native
  
  /**
    * The number of distinct values in a column.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}
object StringColumnStatisticsData {
  
  @scala.inline
  def apply(
    AverageLength: NonNegativeDouble,
    MaximumLength: NonNegativeLong,
    NumberOfDistinctValues: NonNegativeLong,
    NumberOfNulls: NonNegativeLong
  ): StringColumnStatisticsData = {
    val __obj = js.Dynamic.literal(AverageLength = AverageLength.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringColumnStatisticsData]
  }
  
  @scala.inline
  implicit class StringColumnStatisticsDataOps[Self <: StringColumnStatisticsData] (val x: Self) extends AnyVal {
    
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
    def setNumberOfDistinctValues(value: NonNegativeLong): Self = this.set("NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = this.set("NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
