package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableProperties extends StObject {
  
  var columns: js.Array[DeclarativeTableColumn]
  
  var data: js.Array[js.Array[js.Any]]
}
object DeclarativeTableProperties {
  
  inline def apply(columns: js.Array[DeclarativeTableColumn], data: js.Array[js.Array[js.Any]]): DeclarativeTableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableProperties]
  }
  
  extension [Self <: DeclarativeTableProperties](x: Self) {
    
    inline def setColumns(value: js.Array[DeclarativeTableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: DeclarativeTableColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setData(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
