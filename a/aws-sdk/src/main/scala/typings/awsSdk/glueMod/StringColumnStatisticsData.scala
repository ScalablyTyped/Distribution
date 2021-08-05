package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringColumnStatisticsData extends StObject {
  
  /**
    * The average string length in the column.
    */
  var AverageLength: NonNegativeDouble
  
  /**
    * The size of the longest string in the column.
    */
  var MaximumLength: NonNegativeLong
  
  /**
    * The number of distinct values in a column.
    */
  var NumberOfDistinctValues: NonNegativeLong
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong
}
object StringColumnStatisticsData {
  
  inline def apply(
    AverageLength: NonNegativeDouble,
    MaximumLength: NonNegativeLong,
    NumberOfDistinctValues: NonNegativeLong,
    NumberOfNulls: NonNegativeLong
  ): StringColumnStatisticsData = {
    val __obj = js.Dynamic.literal(AverageLength = AverageLength.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringColumnStatisticsData]
  }
  
  extension [Self <: StringColumnStatisticsData](x: Self) {
    
    inline def setAverageLength(value: NonNegativeDouble): Self = StObject.set(x, "AverageLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumLength(value: NonNegativeLong): Self = StObject.set(x, "MaximumLength", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDistinctValues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
