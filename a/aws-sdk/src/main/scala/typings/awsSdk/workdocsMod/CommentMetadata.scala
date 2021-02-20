package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentMetadata extends StObject {
  
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
  implicit class CommentMetadataMutableBuilder[Self <: CommentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentId(value: CommentIdType): Self = StObject.set(x, "CommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentIdUndefined: Self = StObject.set(x, "CommentId", js.undefined)
    
    @scala.inline
    def setCommentStatus(value: CommentStatusType): Self = StObject.set(x, "CommentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentStatusUndefined: Self = StObject.set(x, "CommentStatus", js.undefined)
    
    @scala.inline
    def setContributor(value: User): Self = StObject.set(x, "Contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorUndefined: Self = StObject.set(x, "Contributor", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setRecipientId(value: IdType): Self = StObject.set(x, "RecipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "RecipientId", js.undefined)
  }
}
