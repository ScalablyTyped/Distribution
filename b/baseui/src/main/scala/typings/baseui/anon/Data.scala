package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var columns: js.Array[Any]
  
  var data: js.Array[js.Array[Any]]
  
  var loadingMessage: String
}
object Data {
  
  inline def apply(columns: js.Array[Any], data: js.Array[js.Array[Any]], loadingMessage: String): Data = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], loadingMessage = loadingMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setData(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLoadingMessage(value: String): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
  }
}
