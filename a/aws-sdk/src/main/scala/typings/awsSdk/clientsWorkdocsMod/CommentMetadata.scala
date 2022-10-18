package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentMetadata extends StObject {
  
  /**
    * The ID of the comment.
    */
  var CommentId: js.UndefOr[CommentIdType] = js.undefined
  
  /**
    * The status of the comment.
    */
  var CommentStatus: js.UndefOr[CommentStatusType] = js.undefined
  
  /**
    * The user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.undefined
  
  /**
    * The timestamp that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.undefined
}
object CommentMetadata {
  
  inline def apply(): CommentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentMetadata]
  }
  
  extension [Self <: CommentMetadata](x: Self) {
    
    inline def setCommentId(value: CommentIdType): Self = StObject.set(x, "CommentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "CommentId", js.undefined)
    
    inline def setCommentStatus(value: CommentStatusType): Self = StObject.set(x, "CommentStatus", value.asInstanceOf[js.Any])
    
    inline def setCommentStatusUndefined: Self = StObject.set(x, "CommentStatus", js.undefined)
    
    inline def setContributor(value: User): Self = StObject.set(x, "Contributor", value.asInstanceOf[js.Any])
    
    inline def setContributorUndefined: Self = StObject.set(x, "Contributor", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setRecipientId(value: IdType): Self = StObject.set(x, "RecipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "RecipientId", js.undefined)
  }
}
