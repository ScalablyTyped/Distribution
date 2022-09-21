package typings.highlightJsY75vKsj1

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackResponse extends StObject {
  
  var data: Record[String, Any]
  
  def ignoreMatch(): Unit
  
  var isMatchIgnored: Boolean
}
object CallbackResponse {
  
  inline def apply(data: Record[String, Any], ignoreMatch: () => Unit, isMatchIgnored: Boolean): CallbackResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ignoreMatch = js.Any.fromFunction0(ignoreMatch), isMatchIgnored = isMatchIgnored.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackResponse]
  }
  
  extension [Self <: CallbackResponse](x: Self) {
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMatch(value: () => Unit): Self = StObject.set(x, "ignoreMatch", js.Any.fromFunction0(value))
    
    inline def setIsMatchIgnored(value: Boolean): Self = StObject.set(x, "isMatchIgnored", value.asInstanceOf[js.Any])
  }
}
