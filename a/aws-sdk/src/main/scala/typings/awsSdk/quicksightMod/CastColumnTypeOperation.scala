package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CastColumnTypeOperation extends StObject {
  
  /**
    * Column name.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName
  
  /**
    * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
    */
  var Format: js.UndefOr[TypeCastFormat] = js.undefined
  
  /**
    * New column data type.
    */
  var NewColumnType: ColumnDataType
}
object CastColumnTypeOperation {
  
  inline def apply(ColumnName: ColumnName, NewColumnType: ColumnDataType): CastColumnTypeOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], NewColumnType = NewColumnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastColumnTypeOperation]
  }
  
  extension [Self <: CastColumnTypeOperation](x: Self) {
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: TypeCastFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setNewColumnType(value: ColumnDataType): Self = StObject.set(x, "NewColumnType", value.asInstanceOf[js.Any])
  }
}
