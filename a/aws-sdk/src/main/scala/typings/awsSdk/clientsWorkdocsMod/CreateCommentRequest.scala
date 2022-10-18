package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommentRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  
  /**
    * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
    */
  var NotifyCollaborators: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.undefined
  
  /**
    * The text of the comment.
    */
  var Text: CommentTextType
  
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.undefined
  
  /**
    * The ID of the document version.
    */
  var VersionId: DocumentVersionIdType
  
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
}
object CreateCommentRequest {
  
  inline def apply(DocumentId: ResourceIdType, Text: CommentTextType, VersionId: DocumentVersionIdType): CreateCommentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommentRequest]
  }
  
  extension [Self <: CreateCommentRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setNotifyCollaborators(value: BooleanType): Self = StObject.set(x, "NotifyCollaborators", value.asInstanceOf[js.Any])
    
    inline def setNotifyCollaboratorsUndefined: Self = StObject.set(x, "NotifyCollaborators", js.undefined)
    
    inline def setParentId(value: CommentIdType): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    inline def setText(value: CommentTextType): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setThreadId(value: CommentIdType): Self = StObject.set(x, "ThreadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "ThreadId", js.undefined)
    
    inline def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: CommentVisibilityType): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
