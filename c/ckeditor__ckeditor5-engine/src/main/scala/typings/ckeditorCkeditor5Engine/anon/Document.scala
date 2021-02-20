package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
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
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: typings.ckeditorCkeditor5Engine.mod.model.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNull: Self = StObject.set(x, "document", null)
    
    @scala.inline
    def setPadWithNoOps(value: Boolean): Self = StObject.set(x, "padWithNoOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRelations(value: Boolean): Self = StObject.set(x, "useRelations", value.asInstanceOf[js.Any])
  }
}
