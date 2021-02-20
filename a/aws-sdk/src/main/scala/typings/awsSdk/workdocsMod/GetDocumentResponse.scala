package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentResponse extends StObject {
  
  /**
    * The custom metadata on the document.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  
  /**
    * The metadata details of the document.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.native
}
object GetDocumentResponse {
  
  @scala.inline
  def apply(): GetDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentResponse]
  }
  
  @scala.inline
  implicit class GetDocumentResponseMutableBuilder[Self <: GetDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMetadata(value: CustomMetadataMap): Self = StObject.set(x, "CustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetadataUndefined: Self = StObject.set(x, "CustomMetadata", js.undefined)
    
    @scala.inline
    def setMetadata(value: DocumentMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
