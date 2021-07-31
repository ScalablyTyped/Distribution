package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The resource state of the document. Only ACTIVE and RECYCLED are supported.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
}
object UpdateDocumentRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType): UpdateDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentRequest]
  }
  
  @scala.inline
  implicit class UpdateDocumentRequestMutableBuilder[Self <: UpdateDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "ParentFolderId", js.undefined)
    
    @scala.inline
    def setResourceState(value: ResourceStateType): Self = StObject.set(x, "ResourceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStateUndefined: Self = StObject.set(x, "ResourceState", js.undefined)
  }
}
