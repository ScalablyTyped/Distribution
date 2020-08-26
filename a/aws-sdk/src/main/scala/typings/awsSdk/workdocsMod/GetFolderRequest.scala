package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
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
  def apply(FolderId: ResourceIdType): GetFolderRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderRequest]
  }
  @scala.inline
  implicit class GetFolderRequestOps[Self <: GetFolderRequest] (val x: Self) extends AnyVal {
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
    def setFolderId(value: ResourceIdType): Self = this.set("FolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setIncludeCustomMetadata(value: BooleanType): Self = this.set("IncludeCustomMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCustomMetadata: Self = this.set("IncludeCustomMetadata", js.undefined)
  }
  
}

