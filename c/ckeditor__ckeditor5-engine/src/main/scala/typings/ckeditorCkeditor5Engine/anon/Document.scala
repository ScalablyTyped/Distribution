package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
  var document: typings.ckeditorCkeditor5Engine.mod.model.Document | Null = js.native
  
  var padWithNoOps: Boolean = js.native
  
  var useRelations: Boolean = js.native
}
object Document {
  
  @scala.inline
  def apply(padWithNoOps: Boolean, useRelations: Boolean): Document = {
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps.asInstanceOf[js.Any], useRelations = useRelations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
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
    def setPadWithNoOps(value: Boolean): Self = this.set("padWithNoOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRelations(value: Boolean): Self = this.set("useRelations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: typings.ckeditorCkeditor5Engine.mod.model.Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNull: Self = this.set("document", null)
  }
}
