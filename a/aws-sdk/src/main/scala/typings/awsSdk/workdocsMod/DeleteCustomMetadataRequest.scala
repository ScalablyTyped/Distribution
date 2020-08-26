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
  def apply(ResourceId: ResourceIdType): DeleteCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomMetadataRequest]
  }
  @scala.inline
  implicit class DeleteCustomMetadataRequestOps[Self <: DeleteCustomMetadataRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: ResourceIdType): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setDeleteAll(value: BooleanType): Self = this.set("DeleteAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAll: Self = this.set("DeleteAll", js.undefined)
    @scala.inline
    def setKeysVarargs(value: CustomMetadataKeyType*): Self = this.set("Keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: CustomMetadataKeyList): Self = this.set("Keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("Keys", js.undefined)
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

