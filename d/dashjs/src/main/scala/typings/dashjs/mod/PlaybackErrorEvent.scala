package typings.dashjs.mod

import typings.dashjs.dashjsStrings.playbackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackErrorEvent
  extends StObject
     with Event {
  
  var error: String
  
  @JSName("type")
  var type_PlaybackErrorEvent: playbackError
}
object PlaybackErrorEvent {
  
  inline def apply(error: String): PlaybackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("playbackError")
    __obj.asInstanceOf[PlaybackErrorEvent]
  }
  
  extension [Self <: PlaybackErrorEvent](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: playbackError): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
