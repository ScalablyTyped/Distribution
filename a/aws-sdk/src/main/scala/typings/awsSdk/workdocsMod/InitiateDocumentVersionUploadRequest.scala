package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateDocumentVersionUploadRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.undefined
  
  /**
    * The size of the document, in bytes.
    */
  var DocumentSizeInBytes: js.UndefOr[SizeType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType
}
object InitiateDocumentVersionUploadRequest {
  
  inline def apply(ParentFolderId: ResourceIdType): InitiateDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDocumentVersionUploadRequest]
  }
  
  extension [Self <: InitiateDocumentVersionUploadRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setContentCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "ContentCreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContentCreatedTimestampUndefined: Self = StObject.set(x, "ContentCreatedTimestamp", js.undefined)
    
    inline def setContentModifiedTimestamp(value: TimestampType): Self = StObject.set(x, "ContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContentModifiedTimestampUndefined: Self = StObject.set(x, "ContentModifiedTimestamp", js.undefined)
    
    inline def setContentType(value: DocumentContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDocumentSizeInBytes(value: SizeType): Self = StObject.set(x, "DocumentSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setDocumentSizeInBytesUndefined: Self = StObject.set(x, "DocumentSizeInBytes", js.undefined)
    
    inline def setId(value: ResourceIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
  }
}
