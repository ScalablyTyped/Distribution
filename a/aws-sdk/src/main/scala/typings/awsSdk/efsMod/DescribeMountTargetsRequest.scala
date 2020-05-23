package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMountTargetsRequest extends js.Object {
  /**
    * (Optional) The ID of the access point whose mount targets that you want to list. It must be included in your request if a FileSystemId or MountTargetId is not included in your request. Accepts either an access point ID or ARN as input.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.native
  /**
    * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your request if an AccessPointId or MountTargetId is not included. Accepts either a file system ID or ARN as input.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeMountTargets operation (String). If present, it specifies to continue the list from where the previous returning call left off.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  /**
    * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set to 10, and other values are ignored. The response is paginated at 100 per page if you have more than 100 mount targets.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.efsMod.MaxItems] = js.native
  /**
    * (Optional) ID of the mount target that you want to have described (String). It must be included in your request if FileSystemId is not included. Accepts either a mount target ID or ARN as input.
    */
  var MountTargetId: js.UndefOr[typings.awsSdk.efsMod.MountTargetId] = js.native
}

object DescribeMountTargetsRequest {
  @scala.inline
  def apply(
    AccessPointId: AccessPointId = null,
    FileSystemId: FileSystemId = null,
    Marker: Marker = null,
    MaxItems: js.UndefOr[MaxItems] = js.undefined,
    MountTargetId: MountTargetId = null
  ): DescribeMountTargetsRequest = {
    val __obj = js.Dynamic.literal()
    if (AccessPointId != null) __obj.updateDynamic("AccessPointId")(AccessPointId.asInstanceOf[js.Any])
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems.get.asInstanceOf[js.Any])
    if (MountTargetId != null) __obj.updateDynamic("MountTargetId")(MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMountTargetsRequest]
  }
}

