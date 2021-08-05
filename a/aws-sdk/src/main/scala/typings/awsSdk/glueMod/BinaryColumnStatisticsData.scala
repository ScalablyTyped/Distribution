package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryColumnStatisticsData extends StObject {
  
  /**
    * The average bit sequence length in the column.
    */
  var AverageLength: NonNegativeDouble
  
  /**
    * The size of the longest bit sequence in the column.
    */
  var MaximumLength: NonNegativeLong
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong
}
object BinaryColumnStatisticsData {
  
  inline def apply(AverageLength: NonNegativeDouble, MaximumLength: NonNegativeLong, NumberOfNulls: NonNegativeLong): BinaryColumnStatisticsData = {
    val __obj = js.Dynamic.literal(AverageLength = AverageLength.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryColumnStatisticsData]
  }
  
  extension [Self <: BinaryColumnStatisticsData](x: Self) {
    
    inline def setAverageLength(value: NonNegativeDouble): Self = StObject.set(x, "AverageLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumLength(value: NonNegativeLong): Self = StObject.set(x, "MaximumLength", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
