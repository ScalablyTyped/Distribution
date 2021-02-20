package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventAny extends StObject {
  
  var event: js.Any = js.native
}
object EventAny {
  
  @scala.inline
  def apply(event: js.Any): EventAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAny]
  }
  
  @scala.inline
  implicit class EventAnyMutableBuilder[Self <: EventAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
