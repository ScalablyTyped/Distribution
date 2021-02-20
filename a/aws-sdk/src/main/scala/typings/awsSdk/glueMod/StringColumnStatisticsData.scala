package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringColumnStatisticsData extends StObject {
  
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
  implicit class StringColumnStatisticsDataMutableBuilder[Self <: StringColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageLength(value: NonNegativeDouble): Self = StObject.set(x, "AverageLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLength(value: NonNegativeLong): Self = StObject.set(x, "MaximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDistinctValues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
