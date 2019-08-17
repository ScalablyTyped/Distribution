package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentsForComparedCommitMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._Comment
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreLocationMod._Location
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CommentsForComparedCommit extends js.Object {
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
  var comments: js.UndefOr[js.Array[_Comment] | Iterable[_Comment]] = js.undefined
  /**
    * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
    */
  var location: js.UndefOr[_Location] = js.undefined
  /**
    * <p>The name of the repository that contains the compared commits.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object _CommentsForComparedCommit {
  @scala.inline
  def apply(
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comments: js.Array[_Comment] | Iterable[_Comment] = null,
    location: _Location = null,
    repositoryName: String = null
  ): _CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_CommentsForComparedCommit]
  }
}

