package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomMetadataRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * Flag to indicate removal of all custom metadata properties from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.native
  /**
    * List of properties to remove.
    */
  var Keys: js.UndefOr[CustomMetadataKeyList] = js.native
  /**
    * The ID of the resource, either a document or folder.
    */
  var ResourceId: ResourceIdType = js.native
  /**
    * The ID of the version, if the custom metadata is being deleted from a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}

object DeleteCustomMetadataRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    DeleteAll: js.UndefOr[BooleanType] = js.undefined,
    Keys: CustomMetadataKeyList = null,
    VersionId: DocumentVersionIdType = null
  ): DeleteCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteAll)) __obj.updateDynamic("DeleteAll")(DeleteAll.get.asInstanceOf[js.Any])
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomMetadataRequest]
  }
}

