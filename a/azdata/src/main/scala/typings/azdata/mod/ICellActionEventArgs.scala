package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellActionEventArgs extends StObject {
  
  var column: Double
  
  var columnName: Double
  
  var row: Double
}
object ICellActionEventArgs {
  
  inline def apply(column: Double, columnName: Double, row: Double): ICellActionEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellActionEventArgs]
  }
  
  extension [Self <: ICellActionEventArgs](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnName(value: Double): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
