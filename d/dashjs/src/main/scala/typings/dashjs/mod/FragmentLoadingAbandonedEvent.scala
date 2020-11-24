package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentLoadingAbandoned
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentLoadingAbandonedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var request: js.Object = js.native
  
  var streamProcessor: js.Object = js.native
  
  @JSName("type")
  var type_FragmentLoadingAbandonedEvent: fragmentLoadingAbandoned = js.native
}
object FragmentLoadingAbandonedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    request: js.Object,
    streamProcessor: js.Object,
    `type`: fragmentLoadingAbandoned
  ): FragmentLoadingAbandonedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], streamProcessor = streamProcessor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentLoadingAbandonedEvent]
  }
  
  @scala.inline
  implicit class FragmentLoadingAbandonedEventOps[Self <: FragmentLoadingAbandonedEvent] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: js.Object): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamProcessor(value: js.Object): Self = this.set("streamProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fragmentLoadingAbandoned): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
