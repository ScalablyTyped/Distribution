package typings.dashjs.mod

import typings.dashjs.dashjsStrings.streamInitialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInitializedEvent
  extends StObject
     with Event {
  
  var error: js.Error | Null
  
  var streamInfo: StreamInfo
  
  @JSName("type")
  var type_StreamInitializedEvent: streamInitialized
}
object StreamInitializedEvent {
  
  inline def apply(streamInfo: StreamInfo): StreamInitializedEvent = {
    val __obj = js.Dynamic.literal(streamInfo = streamInfo.asInstanceOf[js.Any], error = null)
    __obj.updateDynamic("type")("streamInitialized")
    __obj.asInstanceOf[StreamInitializedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamInitializedEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: streamInitialized): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
