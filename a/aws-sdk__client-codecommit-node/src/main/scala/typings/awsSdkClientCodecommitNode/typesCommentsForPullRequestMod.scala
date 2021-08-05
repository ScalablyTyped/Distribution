package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentsForPullRequestMod {
  
  trait CommentsForPullRequest extends StObject {
    
    /**
      * <p>The full blob ID of the file on which you want to comment on the source commit.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>he full commit ID of the commit that was the tip of the source branch at the time the comment was made. </p>
      */
    var afterCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full blob ID of the file on which you want to comment on the destination commit.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full commit ID of the commit that was the tip of the destination branch when the pull request was created. This commit will be superceded by the after commit in the source branch when and if you merge the source branch into the destination branch.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
      */
    var comments: js.UndefOr[js.Array[Comment] | Iterable[Comment]] = js.undefined
    
    /**
      * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
      */
    var location: js.UndefOr[Location] = js.undefined
    
    /**
      * <p>The system-generated ID of the pull request.</p>
      */
    var pullRequestId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository that contains the pull request.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object CommentsForPullRequest {
    
    inline def apply(): CommentsForPullRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentsForPullRequest]
    }
    
    extension [Self <: CommentsForPullRequest](x: Self) {
      
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
      
      inline def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
      inline def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  trait UnmarshalledCommentsForPullRequest
    extends StObject
       with CommentsForPullRequest {
    
    /**
      * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
      */
    @JSName("comments")
    var comments_UnmarshalledCommentsForPullRequest: js.UndefOr[js.Array[UnmarshalledComment]] = js.undefined
    
    /**
      * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
      */
    @JSName("location")
    var location_UnmarshalledCommentsForPullRequest: js.UndefOr[UnmarshalledLocation] = js.undefined
  }
  object UnmarshalledCommentsForPullRequest {
    
    inline def apply(): UnmarshalledCommentsForPullRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCommentsForPullRequest]
    }
    
    extension [Self <: UnmarshalledCommentsForPullRequest](x: Self) {
      
      inline def setComments(value: js.Array[UnmarshalledComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCommentsVarargs(value: UnmarshalledComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      inline def setLocation(value: UnmarshalledLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
