package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageParams extends StObject {
  
  /**
    * The value that will be passed in the message attribute
    * of the interface that is passed to the event handler.
    */
  var message: String = js.native
}
object SendMessageParams {
  
  @scala.inline
  def apply(message: String): SendMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageParams]
  }
  
  @scala.inline
  implicit class SendMessageParamsMutableBuilder[Self <: SendMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
