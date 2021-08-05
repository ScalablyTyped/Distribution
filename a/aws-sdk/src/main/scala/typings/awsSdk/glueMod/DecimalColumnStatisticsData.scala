package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalColumnStatisticsData extends StObject {
  
  /**
    * The highest value in the column.
    */
  var MaximumValue: js.UndefOr[DecimalNumber] = js.undefined
  
  /**
    * The lowest value in the column.
    */
  var MinimumValue: js.UndefOr[DecimalNumber] = js.undefined
  
  /**
    * The number of distinct values in a column.
    */
  var NumberOfDistinctValues: NonNegativeLong
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong
}
object DecimalColumnStatisticsData {
  
  inline def apply(NumberOfDistinctValues: NonNegativeLong, NumberOfNulls: NonNegativeLong): DecimalColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalColumnStatisticsData]
  }
  
  extension [Self <: DecimalColumnStatisticsData](x: Self) {
    
    inline def setMaximumValue(value: DecimalNumber): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "MaximumValue", js.undefined)
    
    inline def setMinimumValue(value: DecimalNumber): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "MinimumValue", js.undefined)
    
    inline def setNumberOfDistinctValues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
