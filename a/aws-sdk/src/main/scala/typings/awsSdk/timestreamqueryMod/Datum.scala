package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datum extends StObject {
  
  /**
    *  Indicates if the data point is an array. 
    */
  var ArrayValue: js.UndefOr[DatumList] = js.native
  
  /**
    *  Indicates if the data point is null. 
    */
  var NullValue: js.UndefOr[NullableBoolean] = js.native
  
  /**
    *  Indicates if the data point is a row. 
    */
  var RowValue: js.UndefOr[Row] = js.native
  
  /**
    *  Indicates if the data point is a scalar value such as integer, string, double, or boolean. 
    */
  var ScalarValue: js.UndefOr[typings.awsSdk.timestreamqueryMod.ScalarValue] = js.native
  
  /**
    *  Indicates if the data point is of timeseries data type. 
    */
  var TimeSeriesValue: js.UndefOr[TimeSeriesDataPointList] = js.native
}
object Datum {
  
  @scala.inline
  def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  
  @scala.inline
  implicit class DatumMutableBuilder[Self <: Datum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValue(value: DatumList): Self = StObject.set(x, "ArrayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValueUndefined: Self = StObject.set(x, "ArrayValue", js.undefined)
    
    @scala.inline
    def setArrayValueVarargs(value: Datum*): Self = StObject.set(x, "ArrayValue", js.Array(value :_*))
    
    @scala.inline
    def setNullValue(value: NullableBoolean): Self = StObject.set(x, "NullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "NullValue", js.undefined)
    
    @scala.inline
    def setRowValue(value: Row): Self = StObject.set(x, "RowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValueUndefined: Self = StObject.set(x, "RowValue", js.undefined)
    
    @scala.inline
    def setScalarValue(value: ScalarValue): Self = StObject.set(x, "ScalarValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarValueUndefined: Self = StObject.set(x, "ScalarValue", js.undefined)
    
    @scala.inline
    def setTimeSeriesValue(value: TimeSeriesDataPointList): Self = StObject.set(x, "TimeSeriesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesValueUndefined: Self = StObject.set(x, "TimeSeriesValue", js.undefined)
    
    @scala.inline
    def setTimeSeriesValueVarargs(value: TimeSeriesDataPoint*): Self = StObject.set(x, "TimeSeriesValue", js.Array(value :_*))
  }
}
