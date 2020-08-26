package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoSnapshotsResult extends js.Object {
  /**
    * An array of objects that describe the automatic snapshots that are available for the specified source instance or disk.
    */
  var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.native
  /**
    * The name of the source instance or disk for the automatic snapshots.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The resource type (e.g., Instance or Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object GetAutoSnapshotsResult {
  @scala.inline
  def apply(): GetAutoSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoSnapshotsResult]
  }
  @scala.inline
  implicit class GetAutoSnapshotsResultOps[Self <: GetAutoSnapshotsResult] (val x: Self) extends AnyVal {
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
    def setAutoSnapshotsVarargs(value: AutoSnapshotDetails*): Self = this.set("autoSnapshots", js.Array(value :_*))
    @scala.inline
    def setAutoSnapshots(value: AutoSnapshotDetailsList): Self = this.set("autoSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSnapshots: Self = this.set("autoSnapshots", js.undefined)
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

