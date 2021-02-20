package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDocumentResult extends StObject {
  
  /**
    * Information about the Systems Manager document.
    */
  var DocumentDescription: js.UndefOr[typings.awsSdk.ssmMod.DocumentDescription] = js.native
}
object CreateDocumentResult {
  
  @scala.inline
  def apply(): CreateDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentResult]
  }
  
  @scala.inline
  implicit class CreateDocumentResultMutableBuilder[Self <: CreateDocumentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentDescription(value: DocumentDescription): Self = StObject.set(x, "DocumentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDescriptionUndefined: Self = StObject.set(x, "DocumentDescription", js.undefined)
  }
}
