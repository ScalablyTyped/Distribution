package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackWaiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackWaitingEvent
  extends StObject
     with Event {
  
  var playingTime: Double | Null
  
  @JSName("type")
  var type_PlaybackWaitingEvent: playbackWaiting
}
object PlaybackWaitingEvent {
  
  inline def apply(): PlaybackWaitingEvent = {
    val __obj = js.Dynamic.literal(playingTime = null)
    __obj.updateDynamic("type")("playbackWaiting")
    __obj.asInstanceOf[PlaybackWaitingEvent]
  }
  
  extension [Self <: PlaybackWaitingEvent](x: Self) {
    
    inline def setPlayingTime(value: Double): Self = StObject.set(x, "playingTime", value.asInstanceOf[js.Any])
    
    inline def setPlayingTimeNull: Self = StObject.set(x, "playingTime", null)
    
    inline def setType(value: playbackWaiting): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
