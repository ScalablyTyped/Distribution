package typings.awsSdkTypes.eventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStreamSerdeContext extends StObject {
  
  var eventStreamMarshaller: EventStreamMarshaller[Any]
}
object EventStreamSerdeContext {
  
  inline def apply(eventStreamMarshaller: EventStreamMarshaller[Any]): EventStreamSerdeContext = {
    val __obj = js.Dynamic.literal(eventStreamMarshaller = eventStreamMarshaller.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStreamSerdeContext]
  }
  
  extension [Self <: EventStreamSerdeContext](x: Self) {
    
    inline def setEventStreamMarshaller(value: EventStreamMarshaller[Any]): Self = StObject.set(x, "eventStreamMarshaller", value.asInstanceOf[js.Any])
  }
}
