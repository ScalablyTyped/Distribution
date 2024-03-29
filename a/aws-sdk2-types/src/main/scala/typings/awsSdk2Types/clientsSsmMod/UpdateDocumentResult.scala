package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentResult extends StObject {
  
  /**
    * A description of the document that was updated.
    */
  var DocumentDescription: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.DocumentDescription] = js.undefined
}
object UpdateDocumentResult {
  
  inline def apply(): UpdateDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDocumentResult] (val x: Self) extends AnyVal {
    
    inline def setDocumentDescription(value: DocumentDescription): Self = StObject.set(x, "DocumentDescription", value.asInstanceOf[js.Any])
    
    inline def setDocumentDescriptionUndefined: Self = StObject.set(x, "DocumentDescription", js.undefined)
  }
}
