package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDiskFromSnapshotRequest extends js.Object {
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.native
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString = js.native
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
  /**
    * The name of the disk snapshot (e.g., my-snapshot) from which to create the new storage disk. Constraint:   This parameter cannot be defined together with the source disk name parameter. The disk snapshot name and source disk name parameters are mutually exclusive.  
    */
  var diskSnapshotName: js.UndefOr[ResourceName] = js.native
  /**
    * The date of the automatic snapshot to use for the new disk. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.native
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer = js.native
  /**
    * The name of the source disk from which the source automatic snapshot was created. Constraints:   This parameter cannot be defined together with the disk snapshot name parameter. The source disk name and disk snapshot name parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var sourceDiskName: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.native
}

object CreateDiskFromSnapshotRequest {
  @scala.inline
  def apply(availabilityZone: NonEmptyString, diskName: ResourceName, sizeInGb: integer): CreateDiskFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], sizeInGb = sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
  }
  @scala.inline
  implicit class CreateDiskFromSnapshotRequestOps[Self <: CreateDiskFromSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: NonEmptyString): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiskName(value: ResourceName): Self = this.set("diskName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddOnsVarargs(value: AddOnRequest*): Self = this.set("addOns", js.Array(value :_*))
    @scala.inline
    def setAddOns(value: AddOnRequestList): Self = this.set("addOns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    @scala.inline
    def setDiskSnapshotName(value: ResourceName): Self = this.set("diskSnapshotName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSnapshotName: Self = this.set("diskSnapshotName", js.undefined)
    @scala.inline
    def setRestoreDate(value: String): Self = this.set("restoreDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreDate: Self = this.set("restoreDate", js.undefined)
    @scala.inline
    def setSourceDiskName(value: String): Self = this.set("sourceDiskName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDiskName: Self = this.set("sourceDiskName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUseLatestRestorableAutoSnapshot(value: Boolean): Self = this.set("useLatestRestorableAutoSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLatestRestorableAutoSnapshot: Self = this.set("useLatestRestorableAutoSnapshot", js.undefined)
  }
  
}

