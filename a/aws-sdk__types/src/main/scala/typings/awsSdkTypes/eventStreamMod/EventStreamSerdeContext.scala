package typings.awsSdkTypes.eventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamSerdeContext extends js.Object {
  
  var eventStreamMarshaller: EventStreamMarshaller = js.native
}
object EventStreamSerdeContext {
  
  @scala.inline
  def apply(eventStreamMarshaller: EventStreamMarshaller): EventStreamSerdeContext = {
    val __obj = js.Dynamic.literal(eventStreamMarshaller = eventStreamMarshaller.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStreamSerdeContext]
  }
  
  @scala.inline
  implicit class EventStreamSerdeContextOps[Self <: EventStreamSerdeContext] (val x: Self) extends AnyVal {
    
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
    def setEventStreamMarshaller(value: EventStreamMarshaller): Self = this.set("eventStreamMarshaller", value.asInstanceOf[js.Any])
  }
}
