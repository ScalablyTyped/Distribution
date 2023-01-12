package typings.dashjs.mod

import typings.dashjs.dashjsStrings.ttmlToParse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TtmlToParseEvent
  extends StObject
     with Event {
  
  var content: js.Object
  
  @JSName("type")
  var type_TtmlToParseEvent: ttmlToParse
}
object TtmlToParseEvent {
  
  inline def apply(content: js.Object): TtmlToParseEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ttmlToParse")
    __obj.asInstanceOf[TtmlToParseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TtmlToParseEvent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: js.Object): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: ttmlToParse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
