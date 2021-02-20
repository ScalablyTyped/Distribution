package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackPlaying
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackPlayingEvent extends Event {
  
  var playingTime: Double | Null = js.native
  
  @JSName("type")
  var type_PlaybackPlayingEvent: playbackPlaying = js.native
}
object PlaybackPlayingEvent {
  
  @scala.inline
  def apply(`type`: playbackPlaying): PlaybackPlayingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
