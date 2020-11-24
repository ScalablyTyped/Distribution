package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentMetadata extends js.Object {
  
  /**
    * The ID of the comment.
    */
  var CommentId: js.UndefOr[CommentIdType] = js.native
  
  /**
    * The status of the comment.
    */
  var CommentStatus: js.UndefOr[CommentStatusType] = js.native
  
  /**
    * The user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.native
  
  /**
    * The timestamp that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.native
}
object CommentMetadata {
  
  @scala.inline
  def apply(): CommentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentMetadata]
  }
  
  @scala.inline
  implicit class CommentMetadataOps[Self <: CommentMetadata] (val x: Self) extends AnyVal {
    
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
    def deleteCommentId: Self = this.set("CommentId", js.undefined)
    
    @scala.inline
    def setCommentStatus(value: CommentStatusType): Self = this.set("CommentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentStatus: Self = this.set("CommentStatus", js.undefined)
    
    @scala.inline
    def setContributor(value: User): Self = this.set("Contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributor: Self = this.set("Contributor", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setRecipientId(value: IdType): Self = this.set("RecipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("RecipientId", js.undefined)
  }
}
