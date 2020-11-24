package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackWaiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackWaitingEvent extends Event {
  
  var playingTime: Double | Null = js.native
  
  @JSName("type")
  var type_PlaybackWaitingEvent: playbackWaiting = js.native
}
object PlaybackWaitingEvent {
  
  @scala.inline
  def apply(`type`: playbackWaiting): PlaybackWaitingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackWaitingEvent]
  }
  
  @scala.inline
  implicit class PlaybackWaitingEventOps[Self <: PlaybackWaitingEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: playbackWaiting): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingTime(value: Double): Self = this.set("playingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingTimeNull: Self = this.set("playingTime", null)
  }
}
