package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefinition extends StObject {
  
  /**
    * List of column definitions.
    */
  var columns: js.UndefOr[ColumnList] = js.undefined
  
  /**
    * List of column names used for primary key.
    */
  var primaryKeyColumns: js.UndefOr[ColumnNameList] = js.undefined
}
object SchemaDefinition {
  
  inline def apply(): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefinition]
  }
  
  extension [Self <: SchemaDefinition](x: Self) {
    
    inline def setColumns(value: ColumnList): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setPrimaryKeyColumns(value: ColumnNameList): Self = StObject.set(x, "primaryKeyColumns", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyColumnsUndefined: Self = StObject.set(x, "primaryKeyColumns", js.undefined)
    
    inline def setPrimaryKeyColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "primaryKeyColumns", js.Array(value*))
  }
}
