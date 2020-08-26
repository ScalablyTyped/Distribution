package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFolderRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType = js.native
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The resource state of the folder. Only ACTIVE and RECYCLED are accepted values from the API.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
}

object UpdateFolderRequest {
  @scala.inline
  def apply(FolderId: ResourceIdType): UpdateFolderRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFolderRequest]
  }
  @scala.inline
  implicit class UpdateFolderRequestOps[Self <: UpdateFolderRequest] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = this.set("ParentFolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentFolderId: Self = this.set("ParentFolderId", js.undefined)
    @scala.inline
    def setResourceState(value: ResourceStateType): Self = this.set("ResourceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceState: Self = this.set("ResourceState", js.undefined)
  }
  
}

