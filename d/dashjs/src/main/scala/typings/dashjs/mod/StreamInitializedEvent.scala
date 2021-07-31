package typings.dashjs.mod

import typings.dashjs.dashjsStrings.streamInitialized
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInitializedEvent
  extends StObject
     with Event {
  
  var error: Error | Null
  
  var streamInfo: StreamInfo
  
  @JSName("type")
  var type_StreamInitializedEvent: streamInitialized
}
object StreamInitializedEvent {
  
  @scala.inline
  def apply(streamInfo: StreamInfo): StreamInitializedEvent = {
    val __obj = js.Dynamic.literal(streamInfo = streamInfo.asInstanceOf[js.Any], error = null)
    __obj.updateDynamic("type")("streamInitialized")
    __obj.asInstanceOf[StreamInitializedEvent]
  }
  
  @scala.inline
  implicit class StreamInitializedEventMutableBuilder[Self <: StreamInitializedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: streamInitialized): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
