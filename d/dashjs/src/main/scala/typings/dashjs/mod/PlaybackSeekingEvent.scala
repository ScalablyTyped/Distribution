package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackSeeking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackSeekingEvent extends Event {
  
  var seekTime: Double | Null = js.native
  
  @JSName("type")
  var type_PlaybackSeekingEvent: playbackSeeking = js.native
}
object PlaybackSeekingEvent {
  
  @scala.inline
  def apply(`type`: playbackSeeking): PlaybackSeekingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackSeekingEvent]
  }
  
  @scala.inline
  implicit class PlaybackSeekingEventOps[Self <: PlaybackSeekingEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: playbackSeeking): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTime(value: Double): Self = this.set("seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTimeNull: Self = this.set("seekTime", null)
  }
}
