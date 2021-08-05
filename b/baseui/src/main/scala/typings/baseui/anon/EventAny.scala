package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAny extends StObject {
  
  var event: js.Any
}
object EventAny {
  
  inline def apply(event: js.Any): EventAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAny]
  }
  
  extension [Self <: EventAny](x: Self) {
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
