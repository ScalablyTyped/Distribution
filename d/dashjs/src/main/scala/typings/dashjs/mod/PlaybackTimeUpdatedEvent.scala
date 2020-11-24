package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackTimeUpdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackTimeUpdatedEvent extends Event {
  
  var time: Double | Null = js.native
  
  var timeToEnd: Double = js.native
  
  @JSName("type")
  var type_PlaybackTimeUpdatedEvent: playbackTimeUpdated = js.native
}
object PlaybackTimeUpdatedEvent {
  
  @scala.inline
  def apply(timeToEnd: Double, `type`: playbackTimeUpdated): PlaybackTimeUpdatedEvent = {
    val __obj = js.Dynamic.literal(timeToEnd = timeToEnd.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackTimeUpdatedEvent]
  }
  
  @scala.inline
  implicit class PlaybackTimeUpdatedEventOps[Self <: PlaybackTimeUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setTimeToEnd(value: Double): Self = this.set("timeToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: playbackTimeUpdated): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeNull: Self = this.set("time", null)
  }
}
