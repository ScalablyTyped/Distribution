package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType = js.native
  /**
    * Set to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.native
}

object GetFolderRequest {
  @scala.inline
  def apply(
    FolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    IncludeCustomMetadata: js.UndefOr[Boolean] = js.undefined
  ): GetFolderRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeCustomMetadata)) __obj.updateDynamic("IncludeCustomMetadata")(IncludeCustomMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderRequest]
  }
}

