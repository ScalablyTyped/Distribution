package typings.awsSdkTypes.eventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamSerdeContext extends StObject {
  
  var eventStreamMarshaller: EventStreamMarshaller = js.native
}
object EventStreamSerdeContext {
  
  @scala.inline
  def apply(eventStreamMarshaller: EventStreamMarshaller): EventStreamSerdeContext = {
    val __obj = js.Dynamic.literal(eventStreamMarshaller = eventStreamMarshaller.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStreamSerdeContext]
  }
  
  @scala.inline
  implicit class EventStreamSerdeContextMutableBuilder[Self <: EventStreamSerdeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventStreamMarshaller(value: EventStreamMarshaller): Self = StObject.set(x, "eventStreamMarshaller", value.asInstanceOf[js.Any])
  }
}
