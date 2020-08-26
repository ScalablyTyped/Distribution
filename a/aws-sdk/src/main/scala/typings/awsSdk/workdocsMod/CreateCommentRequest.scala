package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
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
  def apply(DocumentId: ResourceIdType, Text: CommentTextType, VersionId: DocumentVersionIdType): CreateCommentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommentRequest]
  }
  @scala.inline
  implicit class CreateCommentRequestOps[Self <: CreateCommentRequest] (val x: Self) extends AnyVal {
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
    def setDocumentId(value: ResourceIdType): Self = this.set("DocumentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: CommentTextType): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setNotifyCollaborators(value: BooleanType): Self = this.set("NotifyCollaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyCollaborators: Self = this.set("NotifyCollaborators", js.undefined)
    @scala.inline
    def setParentId(value: CommentIdType): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    @scala.inline
    def setThreadId(value: CommentIdType): Self = this.set("ThreadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadId: Self = this.set("ThreadId", js.undefined)
    @scala.inline
    def setVisibility(value: CommentVisibilityType): Self = this.set("Visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("Visibility", js.undefined)
  }
  
}

