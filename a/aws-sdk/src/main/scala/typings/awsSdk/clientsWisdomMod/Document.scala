package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /**
    * A reference to the content resource.
    */
  var contentReference: ContentReference
  
  /**
    * The excerpt from the document.
    */
  var excerpt: js.UndefOr[DocumentText] = js.undefined
  
  /**
    * The title of the document.
    */
  var title: js.UndefOr[DocumentText] = js.undefined
}
object Document {
  
  inline def apply(contentReference: ContentReference): Document = {
    val __obj = js.Dynamic.literal(contentReference = contentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setContentReference(value: ContentReference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setExcerpt(value: DocumentText): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
    
    inline def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
    
    inline def setTitle(value: DocumentText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
