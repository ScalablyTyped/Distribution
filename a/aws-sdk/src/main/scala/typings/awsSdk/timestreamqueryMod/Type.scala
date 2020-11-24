package typings.awsSdk.timestreamqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends js.Object {
  
  /**
    * Indicates if the column is an array.
    */
  var ArrayColumnInfo: js.UndefOr[ColumnInfo] = js.native
  
  /**
    * Indicates if the column is a row.
    */
  var RowColumnInfo: js.UndefOr[ColumnInfoList] = js.native
  
  /**
    * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time. 
    */
  var ScalarType: js.UndefOr[typings.awsSdk.timestreamqueryMod.ScalarType] = js.native
  
  /**
    * Indicates if the column is a timeseries data type.
    */
  var TimeSeriesMeasureValueColumnInfo: js.UndefOr[ColumnInfo] = js.native
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
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
    def setArrayColumnInfo(value: ColumnInfo): Self = this.set("ArrayColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayColumnInfo: Self = this.set("ArrayColumnInfo", js.undefined)
    
    @scala.inline
    def setRowColumnInfoVarargs(value: ColumnInfo*): Self = this.set("RowColumnInfo", js.Array(value :_*))
    
    @scala.inline
    def setRowColumnInfo(value: ColumnInfoList): Self = this.set("RowColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowColumnInfo: Self = this.set("RowColumnInfo", js.undefined)
    
    @scala.inline
    def setScalarType(value: ScalarType): Self = this.set("ScalarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalarType: Self = this.set("ScalarType", js.undefined)
    
    @scala.inline
    def setTimeSeriesMeasureValueColumnInfo(value: ColumnInfo): Self = this.set("TimeSeriesMeasureValueColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesMeasureValueColumnInfo: Self = this.set("TimeSeriesMeasureValueColumnInfo", js.undefined)
  }
}
