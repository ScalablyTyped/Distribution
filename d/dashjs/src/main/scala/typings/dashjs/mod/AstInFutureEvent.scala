package typings.dashjs.mod

import typings.dashjs.dashjsStrings.astInFuture
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
  implicit class AstInFutureEventOps[Self <: AstInFutureEvent] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: astInFuture): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
