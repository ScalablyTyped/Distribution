package typings.dashjs.mod

import typings.dashjs.dashjsStrings.astInFuture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstInFutureEvent extends Event {
  
  var delay: Double = js.native
  
  @JSName("type")
  var type_AstInFutureEvent: astInFuture = js.native
}
object AstInFutureEvent {
  
  @scala.inline
  def apply(delay: Double, `type`: astInFuture): AstInFutureEvent = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstInFutureEvent]
  }
  
  @scala.inline
  implicit class AstInFutureEventMutableBuilder[Self <: AstInFutureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: astInFuture): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
