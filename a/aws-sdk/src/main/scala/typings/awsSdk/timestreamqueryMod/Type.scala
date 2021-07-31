package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Indicates if the column is an array.
    */
  var ArrayColumnInfo: js.UndefOr[ColumnInfo] = js.undefined
  
  /**
    * Indicates if the column is a row.
    */
  var RowColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
  
  /**
    * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time. 
    */
  var ScalarType: js.UndefOr[typings.awsSdk.timestreamqueryMod.ScalarType] = js.undefined
  
  /**
    * Indicates if the column is a timeseries data type.
    */
  var TimeSeriesMeasureValueColumnInfo: js.UndefOr[ColumnInfo] = js.undefined
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayColumnInfo(value: ColumnInfo): Self = StObject.set(x, "ArrayColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayColumnInfoUndefined: Self = StObject.set(x, "ArrayColumnInfo", js.undefined)
    
    @scala.inline
    def setRowColumnInfo(value: ColumnInfoList): Self = StObject.set(x, "RowColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowColumnInfoUndefined: Self = StObject.set(x, "RowColumnInfo", js.undefined)
    
    @scala.inline
    def setRowColumnInfoVarargs(value: ColumnInfo*): Self = StObject.set(x, "RowColumnInfo", js.Array(value :_*))
    
    @scala.inline
    def setScalarType(value: ScalarType): Self = StObject.set(x, "ScalarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarTypeUndefined: Self = StObject.set(x, "ScalarType", js.undefined)
    
    @scala.inline
    def setTimeSeriesMeasureValueColumnInfo(value: ColumnInfo): Self = StObject.set(x, "TimeSeriesMeasureValueColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesMeasureValueColumnInfoUndefined: Self = StObject.set(x, "TimeSeriesMeasureValueColumnInfo", js.undefined)
  }
}
