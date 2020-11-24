package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerFiredEventAttributes extends js.Object {
  
  /**
    * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The unique ID of the timer that fired.
    */
  var timerId: TimerId = js.native
}
object TimerFiredEventAttributes {
  
  @scala.inline
  def apply(startedEventId: EventId, timerId: TimerId): TimerFiredEventAttributes = {
    val __obj = js.Dynamic.literal(startedEventId = startedEventId.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerFiredEventAttributes]
  }
  
  @scala.inline
  implicit class TimerFiredEventAttributesOps[Self <: TimerFiredEventAttributes] (val x: Self) extends AnyVal {
    
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
    def setStartedEventId(value: EventId): Self = this.set("startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerId(value: TimerId): Self = this.set("timerId", value.asInstanceOf[js.Any])
  }
}
