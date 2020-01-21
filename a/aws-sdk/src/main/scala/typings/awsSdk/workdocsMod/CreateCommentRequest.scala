package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
    */
  var NotifyCollaborators: js.UndefOr[BooleanType] = js.native
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.native
  /**
    * The text of the comment.
    */
  var Text: CommentTextType = js.native
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.native
  /**
    * The ID of the document version.
    */
  var VersionId: DocumentVersionIdType = js.native
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.native
}

object CreateCommentRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    Text: CommentTextType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    NotifyCollaborators: js.UndefOr[Boolean] = js.undefined,
    ParentId: CommentIdType = null,
    ThreadId: CommentIdType = null,
    Visibility: CommentVisibilityType = null
  ): CreateCommentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(NotifyCollaborators)) __obj.updateDynamic("NotifyCollaborators")(NotifyCollaborators.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId.asInstanceOf[js.Any])
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommentRequest]
  }
}

