package typings.awsSdk.timestreamqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datum extends js.Object {
  
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
  implicit class DatumOps[Self <: Datum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayValueVarargs(value: Datum*): Self = this.set("ArrayValue", js.Array(value :_*))
    
    @scala.inline
    def setArrayValue(value: DatumList): Self = this.set("ArrayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayValue: Self = this.set("ArrayValue", js.undefined)
    
    @scala.inline
    def setNullValue(value: NullableBoolean): Self = this.set("NullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullValue: Self = this.set("NullValue", js.undefined)
    
    @scala.inline
    def setRowValue(value: Row): Self = this.set("RowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowValue: Self = this.set("RowValue", js.undefined)
    
    @scala.inline
    def setScalarValue(value: ScalarValue): Self = this.set("ScalarValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalarValue: Self = this.set("ScalarValue", js.undefined)
    
    @scala.inline
    def setTimeSeriesValueVarargs(value: TimeSeriesDataPoint*): Self = this.set("TimeSeriesValue", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeriesValue(value: TimeSeriesDataPointList): Self = this.set("TimeSeriesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesValue: Self = this.set("TimeSeriesValue", js.undefined)
  }
}
