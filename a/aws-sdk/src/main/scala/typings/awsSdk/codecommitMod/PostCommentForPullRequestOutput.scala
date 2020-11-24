package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentForPullRequestOutput extends js.Object {
  
  /**
    * In the directionality of the pull request, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit in the destination branch where the pull request is merged.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * In the directionality of the pull request, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.native
  
  /**
    * The location of the change where you posted your comment.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  
  /**
    * The name of the repository where you posted a comment on a pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object PostCommentForPullRequestOutput {
  
  @scala.inline
  def apply(): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
  
  @scala.inline
  implicit class PostCommentForPullRequestOutputOps[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
    
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
    def setAfterBlobId(value: ObjectId): Self = this.set("afterBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlobId: Self = this.set("afterBlobId", js.undefined)
    
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCommitId: Self = this.set("afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeBlobId(value: ObjectId): Self = this.set("beforeBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlobId: Self = this.set("beforeBlobId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
