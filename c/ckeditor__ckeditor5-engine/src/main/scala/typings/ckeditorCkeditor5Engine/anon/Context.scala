package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.model.Node
import typings.ckeditorCkeditor5Engine.mod.model.SchemaContextDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var context: js.UndefOr[SchemaContextDefinition] = js.native
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.native
  
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.native
}
object Context {
  
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setContextVarargs(value: (String | Node)*): Self = this.set("context", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: SchemaContextDefinition): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setLastRangeBackward(value: Boolean): Self = this.set("lastRangeBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRangeBackward: Self = this.set("lastRangeBackward", js.undefined)
    
    @scala.inline
    def setSelectionAttributesVarargs(value: js.Object*): Self = this.set("selectionAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSelectionAttributes(value: js.Array[js.Object]): Self = this.set("selectionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionAttributes: Self = this.set("selectionAttributes", js.undefined)
  }
}
