package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageParams extends StObject {
  
  /**
    * The value that will be passed in the message attribute
    * of the interface that is passed to the event handler.
    */
  var message: String
}
object SendMessageParams {
  
  inline def apply(message: String): SendMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageParams]
  }
  
  extension [Self <: SendMessageParams](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
