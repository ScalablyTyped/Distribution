package typings.dashjs.mod

import typings.dashjs.dashjsStrings.ttmlParsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TtmlParsedEvent
  extends StObject
     with Event {
  
  var ttmlDoc: js.Object
  
  var ttmlString: String
  
  @JSName("type")
  var type_TtmlParsedEvent: ttmlParsed
}
object TtmlParsedEvent {
  
  inline def apply(ttmlDoc: js.Object, ttmlString: String): TtmlParsedEvent = {
    val __obj = js.Dynamic.literal(ttmlDoc = ttmlDoc.asInstanceOf[js.Any], ttmlString = ttmlString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ttmlParsed")
    __obj.asInstanceOf[TtmlParsedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TtmlParsedEvent] (val x: Self) extends AnyVal {
    
    inline def setTtmlDoc(value: js.Object): Self = StObject.set(x, "ttmlDoc", value.asInstanceOf[js.Any])
    
    inline def setTtmlString(value: String): Self = StObject.set(x, "ttmlString", value.asInstanceOf[js.Any])
    
    inline def setType(value: ttmlParsed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
