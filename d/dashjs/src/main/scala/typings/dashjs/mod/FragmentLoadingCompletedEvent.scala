package typings.dashjs.mod

import typings.dashjs.dashjsStrings.fragmentLoadingCompleted
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentLoadingCompletedEvent
  extends StObject
     with Event {
  
  var request: FragmentRequest
  
  var response: ArrayBuffer
  
  var sender: js.Object
  
  @JSName("type")
  var type_FragmentLoadingCompletedEvent: fragmentLoadingCompleted
}
object FragmentLoadingCompletedEvent {
  
  inline def apply(request: FragmentRequest, response: ArrayBuffer, sender: js.Object): FragmentLoadingCompletedEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fragmentLoadingCompleted")
    __obj.asInstanceOf[FragmentLoadingCompletedEvent]
  }
  
  extension [Self <: FragmentLoadingCompletedEvent](x: Self) {
    
    inline def setRequest(value: FragmentRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: ArrayBuffer): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setSender(value: js.Object): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: fragmentLoadingCompleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
