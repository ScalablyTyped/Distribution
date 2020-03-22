package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFolderContentsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType = js.native
}

object DeleteFolderContentsRequest {
  @scala.inline
  def apply(FolderId: ResourceIdType, AuthenticationToken: AuthenticationHeaderType = null): DeleteFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFolderContentsRequest]
  }
}

