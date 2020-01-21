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
  def apply(
    CreatedTimestamp: TimestampType = null,
    CreatorId: IdType = null,
    Id: ResourceIdType = null,
    Labels: SharedLabels = null,
    LatestVersionMetadata: DocumentVersionMetadata = null,
    ModifiedTimestamp: TimestampType = null,
    ParentFolderId: ResourceIdType = null,
    ResourceState: ResourceStateType = null
  ): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (LatestVersionMetadata != null) __obj.updateDynamic("LatestVersionMetadata")(LatestVersionMetadata.asInstanceOf[js.Any])
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp.asInstanceOf[js.Any])
    if (ParentFolderId != null) __obj.updateDynamic("ParentFolderId")(ParentFolderId.asInstanceOf[js.Any])
    if (ResourceState != null) __obj.updateDynamic("ResourceState")(ResourceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

