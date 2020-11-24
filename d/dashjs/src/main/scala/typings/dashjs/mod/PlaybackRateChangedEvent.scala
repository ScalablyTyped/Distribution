package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackRateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackRateChangedEvent extends Event {
  
  var playbackRate: Double | Null = js.native
  
  @JSName("type")
  var type_PlaybackRateChangedEvent: playbackRateChanged = js.native
}
object PlaybackRateChangedEvent {
  
  @scala.inline
  def apply(`type`: playbackRateChanged): PlaybackRateChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangedEvent]
  }
  
  @scala.inline
  implicit class PlaybackRateChangedEventOps[Self <: PlaybackRateChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: playbackRateChanged): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateNull: Self = this.set("playbackRate", null)
  }
}
