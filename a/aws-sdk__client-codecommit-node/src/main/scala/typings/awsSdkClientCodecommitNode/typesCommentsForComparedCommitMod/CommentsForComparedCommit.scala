package typings.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod

import typings.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typings.awsSdkClientCodecommitNode.typesLocationMod.Location
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsForComparedCommit extends js.Object {
  /**
    * <p>The full blob ID of the commit used to establish the 'after' of the comparison.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit used to establish the 'after' of the comparison.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The full blob ID of the commit used to establish the 'before' of the comparison.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit used to establish the 'before' of the comparison.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
    */
  var comments: js.UndefOr[js.Array[Comment] | Iterable[Comment]] = js.native
  /**
    * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * <p>The name of the repository that contains the compared commits.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
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
    def setAfterBlobId(value: String): Self = this.set("afterBlobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterBlobId: Self = this.set("afterBlobId", js.undefined)
    @scala.inline
    def setAfterCommitId(value: String): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCommitId: Self = this.set("afterCommitId", js.undefined)
    @scala.inline
    def setBeforeBlobId(value: String): Self = this.set("beforeBlobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeBlobId: Self = this.set("beforeBlobId", js.undefined)
    @scala.inline
    def setBeforeCommitId(value: String): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[Comment] | Iterable[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

