package typings.dashjs.mod

import typings.dashjs.dashjsStrings.ttmlToParse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TtmlToParseEvent extends Event {
  
  var content: js.Object = js.native
  
  @JSName("type")
  var type_TtmlToParseEvent: ttmlToParse = js.native
}
object TtmlToParseEvent {
  
  @scala.inline
  def apply(content: js.Object, `type`: ttmlToParse): TtmlToParseEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtmlToParseEvent]
  }
  
  @scala.inline
  implicit class TtmlToParseEventMutableBuilder[Self <: TtmlToParseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Object): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ttmlToParse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
