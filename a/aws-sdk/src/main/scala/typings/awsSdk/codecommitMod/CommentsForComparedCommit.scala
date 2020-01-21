package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    afterBlobId: ObjectId = null,
    afterCommitId: CommitId = null,
    beforeBlobId: ObjectId = null,
    beforeCommitId: CommitId = null,
    comments: Comments = null,
    location: Location = null,
    repositoryName: RepositoryName = null
  ): CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsForComparedCommit]
  }
}

