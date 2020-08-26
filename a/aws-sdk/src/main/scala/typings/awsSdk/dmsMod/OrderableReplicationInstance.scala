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
  def apply(): OrderableReplicationInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableReplicationInstance]
  }
  @scala.inline
  implicit class OrderableReplicationInstanceOps[Self <: OrderableReplicationInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZonesList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setDefaultAllocatedStorage(value: Integer): Self = this.set("DefaultAllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAllocatedStorage: Self = this.set("DefaultAllocatedStorage", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setIncludedAllocatedStorage(value: Integer): Self = this.set("IncludedAllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedAllocatedStorage: Self = this.set("IncludedAllocatedStorage", js.undefined)
    @scala.inline
    def setMaxAllocatedStorage(value: Integer): Self = this.set("MaxAllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllocatedStorage: Self = this.set("MaxAllocatedStorage", js.undefined)
    @scala.inline
    def setMinAllocatedStorage(value: Integer): Self = this.set("MinAllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAllocatedStorage: Self = this.set("MinAllocatedStorage", js.undefined)
    @scala.inline
    def setReleaseStatus(value: ReleaseStatusValues): Self = this.set("ReleaseStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseStatus: Self = this.set("ReleaseStatus", js.undefined)
    @scala.inline
    def setReplicationInstanceClass(value: String): Self = this.set("ReplicationInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceClass: Self = this.set("ReplicationInstanceClass", js.undefined)
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
  }
  
}

