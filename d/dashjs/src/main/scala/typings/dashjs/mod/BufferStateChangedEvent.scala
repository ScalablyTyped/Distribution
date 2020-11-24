package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.bufferLoaded
import typings.dashjs.dashjsStrings.bufferStalled
import typings.dashjs.dashjsStrings.bufferStateChanged
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferStateChangedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var sender: js.Object = js.native
  
  var state: bufferStalled | bufferLoaded = js.native
  
  var streamInfo: StreamInfo = js.native
  
  @JSName("type")
  var type_BufferStateChangedEvent: bufferStateChanged = js.native
}
object BufferStateChangedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    sender: js.Object,
    state: bufferStalled | bufferLoaded,
    streamInfo: StreamInfo,
    `type`: bufferStateChanged
  ): BufferStateChangedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamInfo = streamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStateChangedEvent]
  }
  
  @scala.inline
  implicit class BufferStateChangedEventOps[Self <: BufferStateChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: js.Object): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: bufferStalled | bufferLoaded): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = this.set("streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bufferStateChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
