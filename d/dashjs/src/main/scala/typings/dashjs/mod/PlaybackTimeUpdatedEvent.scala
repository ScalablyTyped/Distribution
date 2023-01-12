package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackTimeUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackTimeUpdatedEvent
  extends StObject
     with Event {
  
  var time: Double | Null
  
  var timeToEnd: Double
  
  @JSName("type")
  var type_PlaybackTimeUpdatedEvent: playbackTimeUpdated
}
object PlaybackTimeUpdatedEvent {
  
  inline def apply(timeToEnd: Double): PlaybackTimeUpdatedEvent = {
    val __obj = js.Dynamic.literal(timeToEnd = timeToEnd.asInstanceOf[js.Any], time = null)
    __obj.updateDynamic("type")("playbackTimeUpdated")
    __obj.asInstanceOf[PlaybackTimeUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackTimeUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeToEnd(value: Double): Self = StObject.set(x, "timeToEnd", value.asInstanceOf[js.Any])
    
    inline def setType(value: playbackTimeUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
