package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationPendingModifiedValues extends js.Object {
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. For more information on the settings and capacities for the available replication instance classes, see  Selecting the right AWS DMS replication instance for your migration. 
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
}

object ReplicationPendingModifiedValues {
  @scala.inline
  def apply(): ReplicationPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationPendingModifiedValues]
  }
  @scala.inline
  implicit class ReplicationPendingModifiedValuesOps[Self <: ReplicationPendingModifiedValues] (val x: Self) extends AnyVal {
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
    def setAllocatedStorage(value: IntegerOptional): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    @scala.inline
    def setReplicationInstanceClass(value: String): Self = this.set("ReplicationInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceClass: Self = this.set("ReplicationInstanceClass", js.undefined)
  }
  
}

