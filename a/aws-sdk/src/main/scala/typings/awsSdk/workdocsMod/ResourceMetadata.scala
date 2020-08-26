package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMetadata extends js.Object {
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The original name of the resource before a rename operation.
    */
  var OriginalName: js.UndefOr[ResourceNameType] = js.native
  /**
    * The owner of the resource.
    */
  var Owner: js.UndefOr[UserMetadata] = js.native
  /**
    * The parent ID of the resource before a rename operation.
    */
  var ParentId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[ResourceType] = js.native
  /**
    * The version ID of the resource. This is an optional field and is filled for action on document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}

object ResourceMetadata {
  @scala.inline
  def apply(): ResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceMetadata]
  }
  @scala.inline
  implicit class ResourceMetadataOps[Self <: ResourceMetadata] (val x: Self) extends AnyVal {
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
    def setId(value: ResourceIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: ResourceNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOriginalName(value: ResourceNameType): Self = this.set("OriginalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalName: Self = this.set("OriginalName", js.undefined)
    @scala.inline
    def setOwner(value: UserMetadata): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setParentId(value: ResourceIdType): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    @scala.inline
    def setType(value: ResourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

