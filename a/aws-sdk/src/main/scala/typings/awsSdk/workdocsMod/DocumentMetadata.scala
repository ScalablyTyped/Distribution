package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetadata extends js.Object {
  /**
    * The time when the document was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  /**
    * List of labels on the document.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  /**
    * The latest version of the document.
    */
  var LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata] = js.native
  /**
    * The time when the document was updated.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The resource state.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
}

object DocumentMetadata {
  @scala.inline
  def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  @scala.inline
  implicit class DocumentMetadataOps[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
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
    def setCreatedTimestamp(value: TimestampType): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setCreatorId(value: IdType): Self = this.set("CreatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorId: Self = this.set("CreatorId", js.undefined)
    @scala.inline
    def setId(value: ResourceIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: SharedLabel*): Self = this.set("Labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: SharedLabels): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    @scala.inline
    def setLatestVersionMetadata(value: DocumentVersionMetadata): Self = this.set("LatestVersionMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestVersionMetadata: Self = this.set("LatestVersionMetadata", js.undefined)
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = this.set("ModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedTimestamp: Self = this.set("ModifiedTimestamp", js.undefined)
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

