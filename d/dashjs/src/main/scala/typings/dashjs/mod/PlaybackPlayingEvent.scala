package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackPlaying
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackPlayingEvent
  extends StObject
     with Event {
  
  var playingTime: Double | Null
  
  @JSName("type")
  var type_PlaybackPlayingEvent: playbackPlaying
}
object PlaybackPlayingEvent {
  
  @scala.inline
  def apply(): PlaybackPlayingEvent = {
    val __obj = js.Dynamic.literal(playingTime = null)
    __obj.updateDynamic("type")("playbackPlaying")
    __obj.asInstanceOf[PlaybackPlayingEvent]
  }
  
  @scala.inline
  implicit class PlaybackPlayingEventMutableBuilder[Self <: PlaybackPlayingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayingTime(value: Double): Self = StObject.set(x, "playingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingTimeNull: Self = StObject.set(x, "playingTime", null)
    
    @scala.inline
    def setType(value: playbackPlaying): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
