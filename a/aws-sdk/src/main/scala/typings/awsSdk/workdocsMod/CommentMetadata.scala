package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentMetadata extends js.Object {
  /**
    * The ID of the comment.
    */
  var CommentId: js.UndefOr[CommentIdType] = js.native
  /**
    * The status of the comment.
    */
  var CommentStatus: js.UndefOr[CommentStatusType] = js.native
  /**
    * The user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.native
  /**
    * The timestamp that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.native
}

object CommentMetadata {
  @scala.inline
  def apply(
    CommentId: CommentIdType = null,
    CommentStatus: CommentStatusType = null,
    Contributor: User = null,
    CreatedTimestamp: TimestampType = null,
    RecipientId: IdType = null
  ): CommentMetadata = {
    val __obj = js.Dynamic.literal()
    if (CommentId != null) __obj.updateDynamic("CommentId")(CommentId.asInstanceOf[js.Any])
    if (CommentStatus != null) __obj.updateDynamic("CommentStatus")(CommentStatus.asInstanceOf[js.Any])
    if (Contributor != null) __obj.updateDynamic("Contributor")(Contributor.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (RecipientId != null) __obj.updateDynamic("RecipientId")(RecipientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMetadata]
  }
}

