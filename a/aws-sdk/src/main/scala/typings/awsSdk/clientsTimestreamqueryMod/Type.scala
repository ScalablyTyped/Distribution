package typings.awsSdk.clientsTimestreamqueryMod

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
    * Indicates if the column is of type string, integer, Boolean, double, timestamp, date, time. 
    */
  var ScalarType: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.ScalarType] = js.undefined
  
  /**
    * Indicates if the column is a timeseries data type.
    */
  var TimeSeriesMeasureValueColumnInfo: js.UndefOr[ColumnInfo] = js.undefined
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setArrayColumnInfo(value: ColumnInfo): Self = StObject.set(x, "ArrayColumnInfo", value.asInstanceOf[js.Any])
    
    inline def setArrayColumnInfoUndefined: Self = StObject.set(x, "ArrayColumnInfo", js.undefined)
    
    inline def setRowColumnInfo(value: ColumnInfoList): Self = StObject.set(x, "RowColumnInfo", value.asInstanceOf[js.Any])
    
    inline def setRowColumnInfoUndefined: Self = StObject.set(x, "RowColumnInfo", js.undefined)
    
    inline def setRowColumnInfoVarargs(value: ColumnInfo*): Self = StObject.set(x, "RowColumnInfo", js.Array(value*))
    
    inline def setScalarType(value: ScalarType): Self = StObject.set(x, "ScalarType", value.asInstanceOf[js.Any])
    
    inline def setScalarTypeUndefined: Self = StObject.set(x, "ScalarType", js.undefined)
    
    inline def setTimeSeriesMeasureValueColumnInfo(value: ColumnInfo): Self = StObject.set(x, "TimeSeriesMeasureValueColumnInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesMeasureValueColumnInfoUndefined: Self = StObject.set(x, "TimeSeriesMeasureValueColumnInfo", js.undefined)
  }
}
