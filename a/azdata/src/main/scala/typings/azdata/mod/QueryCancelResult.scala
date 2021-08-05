package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCancelResult extends StObject {
  
  var messages: String
}
object QueryCancelResult {
  
  inline def apply(messages: String): QueryCancelResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCancelResult]
  }
  
  extension [Self <: QueryCancelResult](x: Self) {
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
