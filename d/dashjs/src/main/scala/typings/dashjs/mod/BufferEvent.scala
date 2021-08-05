package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.bufferLoaded
import typings.dashjs.dashjsStrings.bufferStalled
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferEvent
  extends StObject
     with Event {
  
  var mediaType: video | audio | fragmentedText
  
  @JSName("type")
  var type_BufferEvent: bufferStalled | bufferLoaded
}
object BufferEvent {
  
  inline def apply(mediaType: video | audio | fragmentedText, `type`: bufferStalled | bufferLoaded): BufferEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferEvent]
  }
  
  extension [Self <: BufferEvent](x: Self) {
    
    inline def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setType(value: bufferStalled | bufferLoaded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
