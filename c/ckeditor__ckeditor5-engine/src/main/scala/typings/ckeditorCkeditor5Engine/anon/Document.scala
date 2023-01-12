package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var document: default | Null
  
  var padWithNoOps: js.UndefOr[Boolean] = js.undefined
  
  var useRelations: js.UndefOr[Boolean] = js.undefined
}
object Document {
  
  inline def apply(): Document = {
    val __obj = js.Dynamic.literal(document = null)
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: default): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setPadWithNoOps(value: Boolean): Self = StObject.set(x, "padWithNoOps", value.asInstanceOf[js.Any])
    
    inline def setPadWithNoOpsUndefined: Self = StObject.set(x, "padWithNoOps", js.undefined)
    
    inline def setUseRelations(value: Boolean): Self = StObject.set(x, "useRelations", value.asInstanceOf[js.Any])
    
    inline def setUseRelationsUndefined: Self = StObject.set(x, "useRelations", js.undefined)
  }
}
