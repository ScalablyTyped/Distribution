package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaAutoScalingUpdate extends js.Object {
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
  
  /**
    * Represents the auto scaling settings of global secondary indexes that will be modified.
    */
  var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.native
  
  var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}
object ReplicaAutoScalingUpdate {
  
  @scala.inline
  def apply(RegionName: RegionName): ReplicaAutoScalingUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAutoScalingUpdate]
  }
  
  @scala.inline
  implicit class ReplicaAutoScalingUpdateOps[Self <: ReplicaAutoScalingUpdate] (val x: Self) extends AnyVal {
    
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
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexUpdatesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingUpdate*): Self = this.set("ReplicaGlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexUpdates(value: ReplicaGlobalSecondaryIndexAutoScalingUpdateList): Self = this.set("ReplicaGlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexUpdates: Self = this.set("ReplicaGlobalSecondaryIndexUpdates", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingUpdate: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingUpdate", js.undefined)
  }
}
