package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableMetadata extends StObject {
  
  var columns: ColumnMetadata
}
object TableMetadata {
  
  inline def apply(columns: ColumnMetadata): TableMetadata = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  
  extension [Self <: TableMetadata](x: Self) {
    
    inline def setColumns(value: ColumnMetadata): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
