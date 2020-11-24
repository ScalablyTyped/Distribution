package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
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
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommentId(value: CommentIdType): Self = this.set("CommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributor(value: User): Self = this.set("Contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributor: Self = this.set("Contributor", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setParentId(value: CommentIdType): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    
    @scala.inline
    def setRecipientId(value: IdType): Self = this.set("RecipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("RecipientId", js.undefined)
    
    @scala.inline
    def setStatus(value: CommentStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setText(value: CommentTextType): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setThreadId(value: CommentIdType): Self = this.set("ThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("ThreadId", js.undefined)
    
    @scala.inline
    def setVisibility(value: CommentVisibilityType): Self = this.set("Visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("Visibility", js.undefined)
  }
}
