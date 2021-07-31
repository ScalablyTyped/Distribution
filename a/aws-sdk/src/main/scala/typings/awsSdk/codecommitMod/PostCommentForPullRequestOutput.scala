package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCommentForPullRequestOutput extends StObject {
  
  /**
    * In the directionality of the pull request, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The full commit ID of the commit in the destination branch where the pull request is merged.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * In the directionality of the pull request, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * The location of the change where you posted your comment.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
  
  /**
    * The name of the repository where you posted a comment on a pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object PostCommentForPullRequestOutput {
  
  @scala.inline
  def apply(): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
  
  @scala.inline
  implicit class PostCommentForPullRequestOutputMutableBuilder[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterBlobId(value: ObjectId): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
    
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeBlobId(value: ObjectId): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
