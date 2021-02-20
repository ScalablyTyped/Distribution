package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackTimeUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackTimeUpdatedEvent extends Event {
  
  var time: Double | Null = js.native
  
  var timeToEnd: Double = js.native
  
  @JSName("type")
  var type_PlaybackTimeUpdatedEvent: playbackTimeUpdated = js.native
}
object PlaybackTimeUpdatedEvent {
  
  @scala.inline
  def apply(timeToEnd: Double, `type`: playbackTimeUpdated): PlaybackTimeUpdatedEvent = {
    val __obj = js.Dynamic.literal(timeToEnd = timeToEnd.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackTimeUpdatedEvent]
  }
  
  @scala.inline
  implicit class PlaybackTimeUpdatedEventMutableBuilder[Self <: PlaybackTimeUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeNull: Self = StObject.set(x, "time", null)
    
    @scala.inline
    def setTimeToEnd(value: Double): Self = StObject.set(x, "timeToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: playbackTimeUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
