package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackSeeking
import org.scalablytyped.runtime.StObject
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
  implicit class PlaybackSeekingEventMutableBuilder[Self <: PlaybackSeekingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTimeNull: Self = StObject.set(x, "seekTime", null)
    
    @scala.inline
    def setType(value: playbackSeeking): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
