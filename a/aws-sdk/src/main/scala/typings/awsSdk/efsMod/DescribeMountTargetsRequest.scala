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
  def apply(): DescribeMountTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMountTargetsRequest]
  }
  @scala.inline
  implicit class DescribeMountTargetsRequestOps[Self <: DescribeMountTargetsRequest] (val x: Self) extends AnyVal {
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
    def setAccessPointId(value: AccessPointId): Self = this.set("AccessPointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPointId: Self = this.set("AccessPointId", js.undefined)
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemId: Self = this.set("FileSystemId", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: MaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = this.set("MountTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountTargetId: Self = this.set("MountTargetId", js.undefined)
  }
  
}

