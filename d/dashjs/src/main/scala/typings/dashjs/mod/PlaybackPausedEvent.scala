package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackPaused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackPausedEvent
  extends StObject
     with Event {
  
  var ended: Boolean | Null
  
  @JSName("type")
  var type_PlaybackPausedEvent: playbackPaused
}
object PlaybackPausedEvent {
  
  inline def apply(): PlaybackPausedEvent = {
    val __obj = js.Dynamic.literal(ended = null)
    __obj.updateDynamic("type")("playbackPaused")
    __obj.asInstanceOf[PlaybackPausedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackPausedEvent] (val x: Self) extends AnyVal {
    
    inline def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setEndedNull: Self = StObject.set(x, "ended", null)
    
    inline def setType(value: playbackPaused): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
