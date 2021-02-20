package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackPaused
import org.scalablytyped.runtime.StObject
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
  implicit class PlaybackPausedEventMutableBuilder[Self <: PlaybackPausedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedNull: Self = StObject.set(x, "ended", null)
    
    @scala.inline
    def setType(value: playbackPaused): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
