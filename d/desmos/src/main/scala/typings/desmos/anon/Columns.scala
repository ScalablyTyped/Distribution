package typings.desmos.anon

import typings.desmos.Desmos.ExpressionState
import typings.desmos.desmosStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns
  extends StObject
     with ExpressionState {
  
  /**
    * Array of Table Columns.
    */
  var columns: js.Array[DragMode]
  
  var id: js.UndefOr[String] = js.undefined
  
  var `type`: table
}
object Columns {
  
  inline def apply(columns: js.Array[DragMode]): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[DragMode]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: DragMode*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
