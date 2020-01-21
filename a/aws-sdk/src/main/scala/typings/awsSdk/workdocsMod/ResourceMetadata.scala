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
  def apply(
    Id: ResourceIdType = null,
    Name: ResourceNameType = null,
    OriginalName: ResourceNameType = null,
    Owner: UserMetadata = null,
    ParentId: ResourceIdType = null,
    Type: ResourceType = null,
    VersionId: DocumentVersionIdType = null
  ): ResourceMetadata = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OriginalName != null) __obj.updateDynamic("OriginalName")(OriginalName.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetadata]
  }
}

