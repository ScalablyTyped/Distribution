package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datum extends StObject {
  
  /**
    *  Indicates if the data point is an array. 
    */
  var ArrayValue: js.UndefOr[DatumList] = js.undefined
  
  /**
    *  Indicates if the data point is null. 
    */
  var NullValue: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  Indicates if the data point is a row. 
    */
  var RowValue: js.UndefOr[Row] = js.undefined
  
  /**
    *  Indicates if the data point is a scalar value such as integer, string, double, or Boolean. 
    */
  var ScalarValue: js.UndefOr[typings.awsSdk.timestreamqueryMod.ScalarValue] = js.undefined
  
  /**
    *  Indicates if the data point is a timeseries data type. 
    */
  var TimeSeriesValue: js.UndefOr[TimeSeriesDataPointList] = js.undefined
}
object Datum {
  
  inline def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  
  extension [Self <: Datum](x: Self) {
    
    inline def setArrayValue(value: DatumList): Self = StObject.set(x, "ArrayValue", value.asInstanceOf[js.Any])
    
    inline def setArrayValueUndefined: Self = StObject.set(x, "ArrayValue", js.undefined)
    
    inline def setArrayValueVarargs(value: Datum*): Self = StObject.set(x, "ArrayValue", js.Array(value*))
    
    inline def setNullValue(value: NullableBoolean): Self = StObject.set(x, "NullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "NullValue", js.undefined)
    
    inline def setRowValue(value: Row): Self = StObject.set(x, "RowValue", value.asInstanceOf[js.Any])
    
    inline def setRowValueUndefined: Self = StObject.set(x, "RowValue", js.undefined)
    
    inline def setScalarValue(value: ScalarValue): Self = StObject.set(x, "ScalarValue", value.asInstanceOf[js.Any])
    
    inline def setScalarValueUndefined: Self = StObject.set(x, "ScalarValue", js.undefined)
    
    inline def setTimeSeriesValue(value: TimeSeriesDataPointList): Self = StObject.set(x, "TimeSeriesValue", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesValueUndefined: Self = StObject.set(x, "TimeSeriesValue", js.undefined)
    
    inline def setTimeSeriesValueVarargs(value: TimeSeriesDataPoint*): Self = StObject.set(x, "TimeSeriesValue", js.Array(value*))
  }
}
