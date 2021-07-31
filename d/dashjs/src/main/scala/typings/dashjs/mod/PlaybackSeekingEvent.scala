package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackSeeking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackSeekingEvent
  extends StObject
     with Event {
  
  var seekTime: Double | Null
  
  @JSName("type")
  var type_PlaybackSeekingEvent: playbackSeeking
}
object PlaybackSeekingEvent {
  
  @scala.inline
  def apply(): PlaybackSeekingEvent = {
    val __obj = js.Dynamic.literal(seekTime = null)
    __obj.updateDynamic("type")("playbackSeeking")
    __obj.asInstanceOf[PlaybackSeekingEvent]
  }
  
  @scala.inline
  implicit class PlaybackSeekingEventMutableBuilder[Self <: PlaybackSeekingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTimeNull: Self = StObject.set(x, "seekTime", null)
    
    @scala.inline
    def setType(value: playbackSeeking): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
