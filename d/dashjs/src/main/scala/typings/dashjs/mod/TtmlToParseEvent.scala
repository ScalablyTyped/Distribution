package typings.dashjs.mod

import typings.dashjs.dashjsStrings.ttmlToParse
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
  implicit class TtmlToParseEventOps[Self <: TtmlToParseEvent] (val x: Self) extends AnyVal {
    
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
    def setContent(value: js.Object): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ttmlToParse): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
