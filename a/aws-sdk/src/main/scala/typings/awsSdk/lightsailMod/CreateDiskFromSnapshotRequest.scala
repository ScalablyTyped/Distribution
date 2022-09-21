package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDiskFromSnapshotRequest extends StObject {
  
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.undefined
  
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString
  
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  
  /**
    * The name of the disk snapshot (e.g., my-snapshot) from which to create the new storage disk. Constraint:   This parameter cannot be defined together with the source disk name parameter. The disk snapshot name and source disk name parameters are mutually exclusive.  
    */
  var diskSnapshotName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The date of the automatic snapshot to use for the new disk. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Amazon Lightsail Developer Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer
  
  /**
    * The name of the source disk from which the source automatic snapshot was created. Constraints:   This parameter cannot be defined together with the disk snapshot name parameter. The source disk name and disk snapshot name parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Amazon Lightsail Developer Guide.  
    */
  var sourceDiskName: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Amazon Lightsail Developer Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
}
object CreateDiskFromSnapshotRequest {
  
  inline def apply(availabilityZone: NonEmptyString, diskName: ResourceName, sizeInGb: integer): CreateDiskFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], sizeInGb = sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
  }
  
  extension [Self <: CreateDiskFromSnapshotRequest](x: Self) {
    
    inline def setAddOns(value: AddOnRequestList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setAddOnsVarargs(value: AddOnRequest*): Self = StObject.set(x, "addOns", js.Array(value*))
    
    inline def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setDiskSnapshotName(value: ResourceName): Self = StObject.set(x, "diskSnapshotName", value.asInstanceOf[js.Any])
    
    inline def setDiskSnapshotNameUndefined: Self = StObject.set(x, "diskSnapshotName", js.undefined)
    
    inline def setRestoreDate(value: String): Self = StObject.set(x, "restoreDate", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateUndefined: Self = StObject.set(x, "restoreDate", js.undefined)
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskName(value: String): Self = StObject.set(x, "sourceDiskName", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskNameUndefined: Self = StObject.set(x, "sourceDiskName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUseLatestRestorableAutoSnapshot(value: Boolean): Self = StObject.set(x, "useLatestRestorableAutoSnapshot", value.asInstanceOf[js.Any])
    
    inline def setUseLatestRestorableAutoSnapshotUndefined: Self = StObject.set(x, "useLatestRestorableAutoSnapshot", js.undefined)
  }
}
