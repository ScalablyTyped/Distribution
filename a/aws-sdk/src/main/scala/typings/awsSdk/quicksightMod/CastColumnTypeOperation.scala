package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastColumnTypeOperation extends StObject {
  
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
  implicit class CastColumnTypeOperationMutableBuilder[Self <: CastColumnTypeOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TypeCastFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setNewColumnType(value: ColumnDataType): Self = StObject.set(x, "NewColumnType", value.asInstanceOf[js.Any])
  }
}
