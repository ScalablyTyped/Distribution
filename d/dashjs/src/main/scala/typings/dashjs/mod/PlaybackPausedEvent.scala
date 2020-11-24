package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackPaused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackPausedEvent extends Event {
  
  var ended: Boolean | Null = js.native
  
  @JSName("type")
  var type_PlaybackPausedEvent: playbackPaused = js.native
}
object PlaybackPausedEvent {
  
  @scala.inline
  def apply(`type`: playbackPaused): PlaybackPausedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackPausedEvent]
  }
  
  @scala.inline
  implicit class PlaybackPausedEventOps[Self <: PlaybackPausedEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: playbackPaused): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: Boolean): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedNull: Self = this.set("ended", null)
  }
}
