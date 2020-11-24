package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsForComparedCommit extends js.Object {
  
  /**
    * The full blob ID of the commit used to establish the after of the comparison.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit used to establish the after of the comparison.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The full blob ID of the commit used to establish the before of the comparison.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit used to establish the before of the comparison.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * An array of comment objects. Each comment object contains information about a comment on the comparison between commits.
    */
  var comments: js.UndefOr[Comments] = js.native
  
  /**
    * Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is BEFORE or AFTER.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The name of the repository that contains the compared commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object CommentsForComparedCommit {
  
  @scala.inline
  def apply(): CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsForComparedCommit]
  }
  
  @scala.inline
  implicit class CommentsForComparedCommitOps[Self <: CommentsForComparedCommit] (val x: Self) extends AnyVal {
    
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
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: Comments): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
