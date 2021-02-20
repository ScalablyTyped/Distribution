package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackErrorEvent extends Event {
  
  var error: String = js.native
  
  @JSName("type")
  var type_PlaybackErrorEvent: playbackError = js.native
}
object PlaybackErrorEvent {
  
  @scala.inline
  def apply(error: String, `type`: playbackError): PlaybackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackErrorEvent]
  }
  
  @scala.inline
  implicit class PlaybackErrorEventMutableBuilder[Self <: PlaybackErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: playbackError): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
