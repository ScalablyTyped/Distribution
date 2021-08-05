package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentLoadingAbandoned
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentLoadingAbandonedEvent
  extends StObject
     with Event {
  
  var mediaType: video | audio | fragmentedText
  
  var request: js.Object
  
  var streamProcessor: js.Object
  
  @JSName("type")
  var type_FragmentLoadingAbandonedEvent: fragmentLoadingAbandoned
}
object FragmentLoadingAbandonedEvent {
  
  inline def apply(mediaType: video | audio | fragmentedText, request: js.Object, streamProcessor: js.Object): FragmentLoadingAbandonedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], streamProcessor = streamProcessor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fragmentLoadingAbandoned")
    __obj.asInstanceOf[FragmentLoadingAbandonedEvent]
  }
  
  extension [Self <: FragmentLoadingAbandonedEvent](x: Self) {
    
    inline def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: js.Object): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setStreamProcessor(value: js.Object): Self = StObject.set(x, "streamProcessor", value.asInstanceOf[js.Any])
    
    inline def setType(value: fragmentLoadingAbandoned): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
