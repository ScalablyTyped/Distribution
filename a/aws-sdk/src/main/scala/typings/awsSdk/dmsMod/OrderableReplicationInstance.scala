package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableReplicationInstance extends js.Object {
  /**
    * List of Availability Zones for this replication instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.native
  /**
    * The default amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var DefaultAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The version of the replication engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var IncludedAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MaxAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MinAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The value returned when the specified EngineVersion of the replication instance is in Beta or test mode. This indicates some features might not work as expected.  AWS DMS supports the ReleaseStatus parameter in versions 3.1.4 and later. 
    */
  var ReleaseStatus: js.UndefOr[ReleaseStatusValues] = js.native
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
  /**
    * The type of storage used by the replication instance.
    */
  var StorageType: js.UndefOr[String] = js.native
}

object OrderableReplicationInstance {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZonesList = null,
    DefaultAllocatedStorage: Int | Double = null,
    EngineVersion: String = null,
    IncludedAllocatedStorage: Int | Double = null,
    MaxAllocatedStorage: Int | Double = null,
    MinAllocatedStorage: Int | Double = null,
    ReleaseStatus: ReleaseStatusValues = null,
    ReplicationInstanceClass: String = null,
    StorageType: String = null
  ): OrderableReplicationInstance = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (DefaultAllocatedStorage != null) __obj.updateDynamic("DefaultAllocatedStorage")(DefaultAllocatedStorage.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (IncludedAllocatedStorage != null) __obj.updateDynamic("IncludedAllocatedStorage")(IncludedAllocatedStorage.asInstanceOf[js.Any])
    if (MaxAllocatedStorage != null) __obj.updateDynamic("MaxAllocatedStorage")(MaxAllocatedStorage.asInstanceOf[js.Any])
    if (MinAllocatedStorage != null) __obj.updateDynamic("MinAllocatedStorage")(MinAllocatedStorage.asInstanceOf[js.Any])
    if (ReleaseStatus != null) __obj.updateDynamic("ReleaseStatus")(ReleaseStatus.asInstanceOf[js.Any])
    if (ReplicationInstanceClass != null) __obj.updateDynamic("ReplicationInstanceClass")(ReplicationInstanceClass.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableReplicationInstance]
  }
}

