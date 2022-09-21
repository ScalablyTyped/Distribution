package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentMod {
  
  trait Comment extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the person who posted the comment.</p>
      */
    var authorArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
      */
    var clientRequestToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The system-generated comment ID.</p>
      */
    var commentId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The content of the comment.</p>
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time the comment was created, in timestamp format.</p>
      */
    var creationDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>A Boolean value indicating whether the comment has been deleted.</p>
      */
    var deleted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The ID of the comment for which this comment is a reply, if any.</p>
      */
    var inReplyTo: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time the comment was most recently modified, in timestamp format.</p>
      */
    var lastModifiedDate: js.UndefOr[js.Date | String | Double] = js.undefined
  }
  object Comment {
    
    inline def apply(): Comment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setAuthorArn(value: String): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
      
      inline def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
      
      inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
      
      inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
      
      inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
      
      inline def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date | String | Double): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    }
  }
  
  trait UnmarshalledComment
    extends StObject
       with Comment {
    
    /**
      * <p>The date and time the comment was created, in timestamp format.</p>
      */
    @JSName("creationDate")
    var creationDate_UnmarshalledComment: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The date and time the comment was most recently modified, in timestamp format.</p>
      */
    @JSName("lastModifiedDate")
    var lastModifiedDate_UnmarshalledComment: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledComment {
    
    inline def apply(): UnmarshalledComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledComment]
    }
    
    extension [Self <: UnmarshalledComment](x: Self) {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    }
  }
}
