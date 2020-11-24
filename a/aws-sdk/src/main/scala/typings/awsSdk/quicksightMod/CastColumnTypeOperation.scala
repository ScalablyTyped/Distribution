package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastColumnTypeOperation extends js.Object {
  
  /**
    * Column name.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName = js.native
  
  /**
    * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
    */
  var Format: js.UndefOr[TypeCastFormat] = js.native
  
  /**
    * New column data type.
    */
  var NewColumnType: ColumnDataType = js.native
}
object CastColumnTypeOperation {
  
  @scala.inline
  def apply(ColumnName: ColumnName, NewColumnType: ColumnDataType): CastColumnTypeOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], NewColumnType = NewColumnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastColumnTypeOperation]
  }
  
  @scala.inline
  implicit class CastColumnTypeOperationOps[Self <: CastColumnTypeOperation] (val x: Self) extends AnyVal {
    
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
    def setColumnName(value: ColumnName): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColumnType(value: ColumnDataType): Self = this.set("NewColumnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TypeCastFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
  }
}
