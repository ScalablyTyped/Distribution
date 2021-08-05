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
  
  extension [Self <: SaveResultRequestResult](x: Self) {
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
