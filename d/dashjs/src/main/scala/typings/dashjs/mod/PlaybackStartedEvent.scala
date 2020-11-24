package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackStarted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackStartedEvent extends Event {
  
  var startTime: Double | Null = js.native
  
  @JSName("type")
  var type_PlaybackStartedEvent: playbackStarted = js.native
}
object PlaybackStartedEvent {
  
  @scala.inline
  def apply(`type`: playbackStarted): PlaybackStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStartedEvent]
  }
  
  @scala.inline
  implicit class PlaybackStartedEventOps[Self <: PlaybackStartedEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: playbackStarted): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeNull: Self = this.set("startTime", null)
  }
}
