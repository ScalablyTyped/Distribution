package typings.dashjs.mod

import typings.dashjs.dashjsStrings.fragmentLoadingCompleted
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentLoadingCompletedEvent extends Event {
  
  var request: FragmentRequest = js.native
  
  var response: ArrayBuffer = js.native
  
  var sender: js.Object = js.native
  
  @JSName("type")
  var type_FragmentLoadingCompletedEvent: fragmentLoadingCompleted = js.native
}
object FragmentLoadingCompletedEvent {
  
  @scala.inline
  def apply(
    request: FragmentRequest,
    response: ArrayBuffer,
    sender: js.Object,
    `type`: fragmentLoadingCompleted
  ): FragmentLoadingCompletedEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentLoadingCompletedEvent]
  }
  
  @scala.inline
  implicit class FragmentLoadingCompletedEventMutableBuilder[Self <: FragmentLoadingCompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: FragmentRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: ArrayBuffer): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: js.Object): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fragmentLoadingCompleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
