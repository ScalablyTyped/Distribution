package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentVersionResponse extends StObject {
  
  /**
    * The custom metadata on the document version.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
  
  /**
    * The version metadata.
    */
  var Metadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
}
object GetDocumentVersionResponse {
  
  @scala.inline
  def apply(): GetDocumentVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentVersionResponse]
  }
  
  @scala.inline
  implicit class GetDocumentVersionResponseMutableBuilder[Self <: GetDocumentVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMetadata(value: CustomMetadataMap): Self = StObject.set(x, "CustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetadataUndefined: Self = StObject.set(x, "CustomMetadata", js.undefined)
    
    @scala.inline
    def setMetadata(value: DocumentVersionMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
