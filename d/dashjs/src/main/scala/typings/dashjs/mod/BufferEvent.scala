package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.bufferLoaded
import typings.dashjs.dashjsStrings.bufferStalled
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  @JSName("type")
  var type_BufferEvent: bufferStalled | bufferLoaded = js.native
}
object BufferEvent {
  
  @scala.inline
  def apply(mediaType: video | audio | fragmentedText, `type`: bufferStalled | bufferLoaded): BufferEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferEvent]
  }
  
  @scala.inline
  implicit class BufferEventOps[Self <: BufferEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: bufferStalled | bufferLoaded): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
