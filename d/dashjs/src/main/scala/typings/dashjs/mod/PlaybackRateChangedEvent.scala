package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackRateChanged
import org.scalablytyped.runtime.StObject
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
  implicit class PlaybackRateChangedEventMutableBuilder[Self <: PlaybackRateChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateNull: Self = StObject.set(x, "playbackRate", null)
    
    @scala.inline
    def setType(value: playbackRateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
