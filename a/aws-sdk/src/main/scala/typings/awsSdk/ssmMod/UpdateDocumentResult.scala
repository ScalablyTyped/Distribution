package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentResult extends StObject {
  
  /**
    * A description of the document that was updated.
    */
  var DocumentDescription: js.UndefOr[typings.awsSdk.ssmMod.DocumentDescription] = js.undefined
}
object UpdateDocumentResult {
  
  @scala.inline
  def apply(): UpdateDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentResult]
  }
  
  @scala.inline
  implicit class UpdateDocumentResultMutableBuilder[Self <: UpdateDocumentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentDescription(value: DocumentDescription): Self = StObject.set(x, "DocumentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDescriptionUndefined: Self = StObject.set(x, "DocumentDescription", js.undefined)
  }
}
