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
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.native
}

object CreateDiskFromSnapshotRequest {
  @scala.inline
  def apply(
    availabilityZone: NonEmptyString,
    diskName: ResourceName,
    sizeInGb: integer,
    addOns: AddOnRequestList = null,
    diskSnapshotName: ResourceName = null,
    restoreDate: String = null,
    sourceDiskName: String = null,
    tags: TagList = null,
    useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  ): CreateDiskFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], sizeInGb = sizeInGb.asInstanceOf[js.Any])
    if (addOns != null) __obj.updateDynamic("addOns")(addOns.asInstanceOf[js.Any])
    if (diskSnapshotName != null) __obj.updateDynamic("diskSnapshotName")(diskSnapshotName.asInstanceOf[js.Any])
    if (restoreDate != null) __obj.updateDynamic("restoreDate")(restoreDate.asInstanceOf[js.Any])
    if (sourceDiskName != null) __obj.updateDynamic("sourceDiskName")(sourceDiskName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(useLatestRestorableAutoSnapshot)) __obj.updateDynamic("useLatestRestorableAutoSnapshot")(useLatestRestorableAutoSnapshot.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
  }
}

