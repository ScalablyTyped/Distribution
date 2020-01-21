package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderMetadata extends js.Object {
  /**
    * The time when the folder was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the folder.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  /**
    * List of labels on the folder.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  /**
    * The size of the latest version of the folder metadata.
    */
  var LatestVersionSize: js.UndefOr[SizeType] = js.native
  /**
    * The time when the folder was updated.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The resource state of the folder.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
  /**
    * The unique identifier created from the subfolders and documents of the folder.
    */
  var Signature: js.UndefOr[HashType] = js.native
  /**
    * The size of the folder metadata.
    */
  var Size: js.UndefOr[SizeType] = js.native
}

object FolderMetadata {
  @scala.inline
  def apply(
    CreatedTimestamp: TimestampType = null,
    CreatorId: IdType = null,
    Id: ResourceIdType = null,
    Labels: SharedLabels = null,
    LatestVersionSize: Int | Double = null,
    ModifiedTimestamp: TimestampType = null,
    Name: ResourceNameType = null,
    ParentFolderId: ResourceIdType = null,
    ResourceState: ResourceStateType = null,
    Signature: HashType = null,
    Size: Int | Double = null
  ): FolderMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (LatestVersionSize != null) __obj.updateDynamic("LatestVersionSize")(LatestVersionSize.asInstanceOf[js.Any])
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ParentFolderId != null) __obj.updateDynamic("ParentFolderId")(ParentFolderId.asInstanceOf[js.Any])
    if (ResourceState != null) __obj.updateDynamic("ResourceState")(ResourceState.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderMetadata]
  }
}

