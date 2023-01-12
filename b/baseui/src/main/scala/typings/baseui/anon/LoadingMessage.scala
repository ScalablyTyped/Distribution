package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingMessage extends StObject {
  
  var data: js.Array[Any]
  
  var loadingMessage: String
}
object LoadingMessage {
  
  inline def apply(data: js.Array[Any], loadingMessage: String): LoadingMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loadingMessage = loadingMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLoadingMessage(value: String): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
  }
}
