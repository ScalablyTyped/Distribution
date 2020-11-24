package typings.dashjs.mod

import typings.dashjs.dashjsStrings.ttmlParsed
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
  implicit class TtmlParsedEventOps[Self <: TtmlParsedEvent] (val x: Self) extends AnyVal {
    
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
    def setTtmlDoc(value: js.Object): Self = this.set("ttmlDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtmlString(value: String): Self = this.set("ttmlString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ttmlParsed): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
