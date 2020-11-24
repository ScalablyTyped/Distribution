package typings.dashjs.mod

import typings.dashjs.dashjsStrings.fragmentLoadingCompleted
import typings.std.ArrayBuffer
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
  implicit class FragmentLoadingCompletedEventOps[Self <: FragmentLoadingCompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(value: FragmentRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: ArrayBuffer): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: js.Object): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fragmentLoadingCompleted): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
