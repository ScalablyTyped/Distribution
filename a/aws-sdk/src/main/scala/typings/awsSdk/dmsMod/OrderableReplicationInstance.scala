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
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. For example to specify the instance class dms.c4.large, set this parameter to "dms.c4.large". For more information on the settings and capacities for the available replication instance classes, see  Selecting the right AWS DMS replication instance for your migration. 
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
    DefaultAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    EngineVersion: String = null,
    IncludedAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    MaxAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    MinAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    ReleaseStatus: ReleaseStatusValues = null,
    ReplicationInstanceClass: String = null,
    StorageType: String = null
  ): OrderableReplicationInstance = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultAllocatedStorage)) __obj.updateDynamic("DefaultAllocatedStorage")(DefaultAllocatedStorage.get.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludedAllocatedStorage)) __obj.updateDynamic("IncludedAllocatedStorage")(IncludedAllocatedStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxAllocatedStorage)) __obj.updateDynamic("MaxAllocatedStorage")(MaxAllocatedStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinAllocatedStorage)) __obj.updateDynamic("MinAllocatedStorage")(MinAllocatedStorage.get.asInstanceOf[js.Any])
    if (ReleaseStatus != null) __obj.updateDynamic("ReleaseStatus")(ReleaseStatus.asInstanceOf[js.Any])
    if (ReplicationInstanceClass != null) __obj.updateDynamic("ReplicationInstanceClass")(ReplicationInstanceClass.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableReplicationInstance]
  }
}

