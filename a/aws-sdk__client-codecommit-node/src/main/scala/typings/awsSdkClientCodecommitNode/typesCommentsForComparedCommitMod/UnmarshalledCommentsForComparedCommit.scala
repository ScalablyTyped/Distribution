package typings.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod

import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCommentsForComparedCommit extends CommentsForComparedCommit {
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
  @scala.inline
  def apply(
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comments: js.Array[UnmarshalledComment] = null,
    location: UnmarshalledLocation = null,
    repositoryName: String = null
  ): UnmarshalledCommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCommentsForComparedCommit]
  }
}

