package typings.dashjs.mod

import typings.dashjs.dashjsStrings.streamInitialized
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamInitializedEvent extends Event {
  
  var error: Error | Null = js.native
  
  var streamInfo: StreamInfo = js.native
  
  @JSName("type")
  var type_StreamInitializedEvent: streamInitialized = js.native
}
object StreamInitializedEvent {
  
  @scala.inline
  def apply(streamInfo: StreamInfo, `type`: streamInitialized): StreamInitializedEvent = {
    val __obj = js.Dynamic.literal(streamInfo = streamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInitializedEvent]
  }
  
  @scala.inline
  implicit class StreamInitializedEventOps[Self <: StreamInitializedEvent] (val x: Self) extends AnyVal {
    
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
    def setStreamInfo(value: StreamInfo): Self = this.set("streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: streamInitialized): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
}
