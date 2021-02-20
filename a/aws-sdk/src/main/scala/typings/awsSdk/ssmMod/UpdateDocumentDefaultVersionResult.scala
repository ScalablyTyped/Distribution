package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDocumentDefaultVersionResult extends StObject {
  
  /**
    * The description of a custom document that you want to set as the default version.
    */
  var Description: js.UndefOr[DocumentDefaultVersionDescription] = js.native
}
object UpdateDocumentDefaultVersionResult {
  
  @scala.inline
  def apply(): UpdateDocumentDefaultVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentDefaultVersionResult]
  }
  
  @scala.inline
  implicit class UpdateDocumentDefaultVersionResultMutableBuilder[Self <: UpdateDocumentDefaultVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: DocumentDefaultVersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
