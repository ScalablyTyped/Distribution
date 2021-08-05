package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var document: typings.ckeditorCkeditor5Engine.mod.model.Document | Null
  
  var padWithNoOps: Boolean
  
  var useRelations: Boolean
}
object Document {
  
  inline def apply(padWithNoOps: Boolean, useRelations: Boolean): Document = {
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps.asInstanceOf[js.Any], useRelations = useRelations.asInstanceOf[js.Any], document = null)
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setDocument(value: typings.ckeditorCkeditor5Engine.mod.model.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setPadWithNoOps(value: Boolean): Self = StObject.set(x, "padWithNoOps", value.asInstanceOf[js.Any])
    
    inline def setUseRelations(value: Boolean): Self = StObject.set(x, "useRelations", value.asInstanceOf[js.Any])
  }
}
