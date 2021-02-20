package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackWaiting
import org.scalablytyped.runtime.StObject
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
  implicit class PlaybackWaitingEventMutableBuilder[Self <: PlaybackWaitingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayingTime(value: Double): Self = StObject.set(x, "playingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingTimeNull: Self = StObject.set(x, "playingTime", null)
    
    @scala.inline
    def setType(value: playbackWaiting): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
