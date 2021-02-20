package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateDocumentVersionUploadRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.native
  
  /**
    * The size of the document, in bytes.
    */
  var DocumentSizeInBytes: js.UndefOr[SizeType] = js.native
  
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType = js.native
}
object InitiateDocumentVersionUploadRequest {
  
  @scala.inline
  def apply(ParentFolderId: ResourceIdType): InitiateDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDocumentVersionUploadRequest]
  }
  
  @scala.inline
  implicit class InitiateDocumentVersionUploadRequestMutableBuilder[Self <: InitiateDocumentVersionUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setContentCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "ContentCreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCreatedTimestampUndefined: Self = StObject.set(x, "ContentCreatedTimestamp", js.undefined)
    
    @scala.inline
    def setContentModifiedTimestamp(value: TimestampType): Self = StObject.set(x, "ContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentModifiedTimestampUndefined: Self = StObject.set(x, "ContentModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setContentType(value: DocumentContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setDocumentSizeInBytes(value: SizeType): Self = StObject.set(x, "DocumentSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSizeInBytesUndefined: Self = StObject.set(x, "DocumentSizeInBytes", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
  }
}
