package typings.dashjs.mod

import typings.dashjs.dashjsStrings.ttmlParsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TtmlParsedEvent extends Event {
  
  var ttmlDoc: js.Object = js.native
  
  var ttmlString: String = js.native
  
  @JSName("type")
  var type_TtmlParsedEvent: ttmlParsed = js.native
}
object TtmlParsedEvent {
  
  @scala.inline
  def apply(ttmlDoc: js.Object, ttmlString: String, `type`: ttmlParsed): TtmlParsedEvent = {
    val __obj = js.Dynamic.literal(ttmlDoc = ttmlDoc.asInstanceOf[js.Any], ttmlString = ttmlString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtmlParsedEvent]
  }
  
  @scala.inline
  implicit class TtmlParsedEventMutableBuilder[Self <: TtmlParsedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTtmlDoc(value: js.Object): Self = StObject.set(x, "ttmlDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtmlString(value: String): Self = StObject.set(x, "ttmlString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ttmlParsed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
