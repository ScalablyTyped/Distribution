package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResultRequestResult extends StObject {
  
  var messages: String
}
object SaveResultRequestResult {
  
  inline def apply(messages: String): SaveResultRequestResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResultRequestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveResultRequestResult] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
