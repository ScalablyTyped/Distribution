package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentsForComparedCommitMod {
  
  trait CommentsForComparedCommit extends StObject {
    
    /**
      * <p>The full blob ID of the commit used to establish the 'after' of the comparison.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the commit used to establish the 'after' of the comparison.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full blob ID of the commit used to establish the 'before' of the comparison.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the commit used to establish the 'before' of the comparison.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
      */
    var comments: js.UndefOr[js.Array[Comment] | Iterable[Comment]] = js.undefined
    
    /**
      * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
      */
    var location: js.UndefOr[Location] = js.undefined
    
    /**
      * <p>The name of the repository that contains the compared commits.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object CommentsForComparedCommit {
    
    inline def apply(): CommentsForComparedCommit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentsForComparedCommit]
    }
    
    extension [Self <: CommentsForComparedCommit](x: Self) {
      
      inline def setAfterBlobId(value: String): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
      
      inline def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
      
      inline def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      inline def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      inline def setBeforeBlobId(value: String): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
      
      inline def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
      
      inline def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      inline def setComments(value: js.Array[Comment] | Iterable[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  trait UnmarshalledCommentsForComparedCommit
    extends StObject
       with CommentsForComparedCommit {
    
    /**
      * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
      */
    @JSName("comments")
    var comments_UnmarshalledCommentsForComparedCommit: js.UndefOr[js.Array[UnmarshalledComment]] = js.undefined
    
    /**
      * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
      */
    @JSName("location")
    var location_UnmarshalledCommentsForComparedCommit: js.UndefOr[UnmarshalledLocation] = js.undefined
  }
  object UnmarshalledCommentsForComparedCommit {
    
    inline def apply(): UnmarshalledCommentsForComparedCommit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCommentsForComparedCommit]
    }
    
    extension [Self <: UnmarshalledCommentsForComparedCommit](x: Self) {
      
      inline def setComments(value: js.Array[UnmarshalledComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCommentsVarargs(value: UnmarshalledComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      inline def setLocation(value: UnmarshalledLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
