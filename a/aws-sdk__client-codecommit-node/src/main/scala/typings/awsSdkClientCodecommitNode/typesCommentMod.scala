package typings.awsSdkClientCodecommitNode

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentMod {
  
  @js.native
  trait Comment extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the person who posted the comment.</p>
      */
    var authorArn: js.UndefOr[String] = js.native
    
    /**
      * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
      */
    var clientRequestToken: js.UndefOr[String] = js.native
    
    /**
      * <p>The system-generated comment ID.</p>
      */
    var commentId: js.UndefOr[String] = js.native
    
    /**
      * <p>The content of the comment.</p>
      */
    var content: js.UndefOr[String] = js.native
    
    /**
      * <p>The date and time the comment was created, in timestamp format.</p>
      */
    var creationDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>A Boolean value indicating whether the comment has been deleted.</p>
      */
    var deleted: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The ID of the comment for which this comment is a reply, if any.</p>
      */
    var inReplyTo: js.UndefOr[String] = js.native
    
    /**
      * <p>The date and time the comment was most recently modified, in timestamp format.</p>
      */
    var lastModifiedDate: js.UndefOr[Date | String | Double] = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(): Comment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorArn(value: String): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
      
      @scala.inline
      def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
      
      @scala.inline
      def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCreationDate(value: Date | String | Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
      
      @scala.inline
      def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: Date | String | Double): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledComment extends Comment {
    
    /**
      * <p>The date and time the comment was created, in timestamp format.</p>
      */
    @JSName("creationDate")
    var creationDate_UnmarshalledComment: js.UndefOr[Date] = js.native
    
    /**
      * <p>The date and time the comment was most recently modified, in timestamp format.</p>
      */
    @JSName("lastModifiedDate")
    var lastModifiedDate_UnmarshalledComment: js.UndefOr[Date] = js.native
  }
  object UnmarshalledComment {
    
    @scala.inline
    def apply(): UnmarshalledComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledComment]
    }
    
    @scala.inline
    implicit class UnmarshalledCommentMutableBuilder[Self <: UnmarshalledComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    }
  }
}
