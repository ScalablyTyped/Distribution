package typings.dashjs.mod

import typings.dashjs.anon.Code
import typings.dashjs.dashjsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerErrorEvent
  extends StObject
     with Event
     with ErrorEvent {
  
  var error: Code
  
  @JSName("type")
  var type_MediaPlayerErrorEvent: error
}
object MediaPlayerErrorEvent {
  
  @scala.inline
  def apply(error: Code): MediaPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[MediaPlayerErrorEvent]
  }
  
  @scala.inline
  implicit class MediaPlayerErrorEventMutableBuilder[Self <: MediaPlayerErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
