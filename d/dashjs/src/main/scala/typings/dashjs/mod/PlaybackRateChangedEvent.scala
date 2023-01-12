package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackRateChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackRateChangedEvent
  extends StObject
     with Event {
  
  var playbackRate: Double | Null
  
  @JSName("type")
  var type_PlaybackRateChangedEvent: playbackRateChanged
}
object PlaybackRateChangedEvent {
  
  inline def apply(): PlaybackRateChangedEvent = {
    val __obj = js.Dynamic.literal(playbackRate = null)
    __obj.updateDynamic("type")("playbackRateChanged")
    __obj.asInstanceOf[PlaybackRateChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackRateChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateNull: Self = StObject.set(x, "playbackRate", null)
    
    inline def setType(value: playbackRateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
