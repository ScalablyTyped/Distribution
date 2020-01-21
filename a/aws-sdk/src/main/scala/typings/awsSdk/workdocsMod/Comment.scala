package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * The ID of the comment.
    */
  var CommentId: CommentIdType = js.native
  /**
    * The details of the user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.native
  /**
    * The time that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.native
  /**
    * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.native
  /**
    * The status of the comment.
    */
  var Status: js.UndefOr[CommentStatusType] = js.native
  /**
    * The text of the comment.
    */
  var Text: js.UndefOr[CommentTextType] = js.native
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.native
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.native
}

object Comment {
  @scala.inline
  def apply(
    CommentId: CommentIdType,
    Contributor: User = null,
    CreatedTimestamp: TimestampType = null,
    ParentId: CommentIdType = null,
    RecipientId: IdType = null,
    Status: CommentStatusType = null,
    Text: CommentTextType = null,
    ThreadId: CommentIdType = null,
    Visibility: CommentVisibilityType = null
  ): Comment = {
    val __obj = js.Dynamic.literal(CommentId = CommentId.asInstanceOf[js.Any])
    if (Contributor != null) __obj.updateDynamic("Contributor")(Contributor.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (RecipientId != null) __obj.updateDynamic("RecipientId")(RecipientId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId.asInstanceOf[js.Any])
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

