package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResultRequestResult extends StObject {
  
  var messages: String
}
object SaveResultRequestResult {
  
  @scala.inline
  def apply(messages: String): SaveResultRequestResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResultRequestResult]
  }
  
  @scala.inline
  implicit class SaveResultRequestResultMutableBuilder[Self <: SaveResultRequestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
