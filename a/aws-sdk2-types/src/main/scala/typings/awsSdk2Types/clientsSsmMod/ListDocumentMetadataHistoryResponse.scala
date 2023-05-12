package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentMetadataHistoryResponse extends StObject {
  
  /**
    * The user ID of the person in the organization who requested the review of the change template.
    */
  var Author: js.UndefOr[DocumentAuthor] = js.undefined
  
  /**
    * The version of the change template.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * Information about the response to the change template approval request.
    */
  var Metadata: js.UndefOr[DocumentMetadataResponseInfo] = js.undefined
  
  /**
    * The name of the change template.
    */
  var Name: js.UndefOr[DocumentName] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
}
object ListDocumentMetadataHistoryResponse {
  
  inline def apply(): ListDocumentMetadataHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentMetadataHistoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDocumentMetadataHistoryResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: DocumentAuthor): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setMetadata(value: DocumentMetadataResponseInfo): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
