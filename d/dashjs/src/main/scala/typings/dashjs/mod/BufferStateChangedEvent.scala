package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.bufferLoaded
import typings.dashjs.dashjsStrings.bufferStalled
import typings.dashjs.dashjsStrings.bufferStateChanged
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferStateChangedEvent
  extends StObject
     with Event {
  
  var mediaType: video | audio | fragmentedText
  
  var sender: js.Object
  
  var state: bufferStalled | bufferLoaded
  
  var streamInfo: StreamInfo
  
  @JSName("type")
  var type_BufferStateChangedEvent: bufferStateChanged
}
object BufferStateChangedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    sender: js.Object,
    state: bufferStalled | bufferLoaded,
    streamInfo: StreamInfo
  ): BufferStateChangedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamInfo = streamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bufferStateChanged")
    __obj.asInstanceOf[BufferStateChangedEvent]
  }
  
  @scala.inline
  implicit class BufferStateChangedEventMutableBuilder[Self <: BufferStateChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: js.Object): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: bufferStalled | bufferLoaded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bufferStateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
