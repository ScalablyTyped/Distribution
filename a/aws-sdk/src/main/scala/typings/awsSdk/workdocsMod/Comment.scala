package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  /**
    * The ID of the comment.
    */
  var CommentId: CommentIdType = js.native
  
  /**
    * The details of the user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.native
  
  /**
    * The time that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.native
  
  /**
    * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.native
  
  /**
    * The status of the comment.
    */
  var Status: js.UndefOr[CommentStatusType] = js.native
  
  /**
    * The text of the comment.
    */
  var Text: js.UndefOr[CommentTextType] = js.native
  
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.native
  
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.native
}
object Comment {
  
  @scala.inline
  def apply(CommentId: CommentIdType): Comment = {
    val __obj = js.Dynamic.literal(CommentId = CommentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentId(value: CommentIdType): Self = StObject.set(x, "CommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributor(value: User): Self = StObject.set(x, "Contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorUndefined: Self = StObject.set(x, "Contributor", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setParentId(value: CommentIdType): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    @scala.inline
    def setRecipientId(value: IdType): Self = StObject.set(x, "RecipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "RecipientId", js.undefined)
    
    @scala.inline
    def setStatus(value: CommentStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setText(value: CommentTextType): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setThreadId(value: CommentIdType): Self = StObject.set(x, "ThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdUndefined: Self = StObject.set(x, "ThreadId", js.undefined)
    
    @scala.inline
    def setVisibility(value: CommentVisibilityType): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
