package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackStarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackStartedEvent extends Event {
  
  var startTime: Double | Null = js.native
  
  @JSName("type")
  var type_PlaybackStartedEvent: playbackStarted = js.native
}
object PlaybackStartedEvent {
  
  @scala.inline
  def apply(`type`: playbackStarted): PlaybackStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStartedEvent]
  }
  
  @scala.inline
  implicit class PlaybackStartedEventMutableBuilder[Self <: PlaybackStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    @scala.inline
    def setType(value: playbackStarted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
