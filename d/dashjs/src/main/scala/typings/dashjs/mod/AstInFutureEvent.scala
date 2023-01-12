package typings.dashjs.mod

import typings.dashjs.dashjsStrings.astInFuture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstInFutureEvent
  extends StObject
     with Event {
  
  var delay: Double
  
  @JSName("type")
  var type_AstInFutureEvent: astInFuture
}
object AstInFutureEvent {
  
  inline def apply(delay: Double): AstInFutureEvent = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("astInFuture")
    __obj.asInstanceOf[AstInFutureEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AstInFutureEvent] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setType(value: astInFuture): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
