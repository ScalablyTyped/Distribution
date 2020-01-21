package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The resource state of the document. Only ACTIVE and RECYCLED are supported.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
}

object UpdateDocumentRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Name: ResourceNameType = null,
    ParentFolderId: ResourceIdType = null,
    ResourceState: ResourceStateType = null
  ): UpdateDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ParentFolderId != null) __obj.updateDynamic("ParentFolderId")(ParentFolderId.asInstanceOf[js.Any])
    if (ResourceState != null) __obj.updateDynamic("ResourceState")(ResourceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentRequest]
  }
}

