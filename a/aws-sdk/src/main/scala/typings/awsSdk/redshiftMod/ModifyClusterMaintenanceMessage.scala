package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterMaintenanceMessage extends js.Object {
  
  /**
    * A unique identifier for the cluster.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * A boolean indicating whether to enable the deferred maintenance window. 
    */
  var DeferMaintenance: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
    */
  var DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
    */
  var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A unique identifier for the deferred maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A timestamp indicating the start time for the deferred maintenance window.
    */
  var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.native
}
object ModifyClusterMaintenanceMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterMaintenanceMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterMaintenanceMessage]
  }
  
  @scala.inline
  implicit class ModifyClusterMaintenanceMessageOps[Self <: ModifyClusterMaintenanceMessage] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferMaintenance(value: BooleanOptional): Self = this.set("DeferMaintenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenance: Self = this.set("DeferMaintenance", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceDuration(value: IntegerOptional): Self = this.set("DeferMaintenanceDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceDuration: Self = this.set("DeferMaintenanceDuration", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceEndTime(value: TStamp): Self = this.set("DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceEndTime: Self = this.set("DeferMaintenanceEndTime", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceIdentifier(value: String): Self = this.set("DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceIdentifier: Self = this.set("DeferMaintenanceIdentifier", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceStartTime(value: TStamp): Self = this.set("DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceStartTime: Self = this.set("DeferMaintenanceStartTime", js.undefined)
  }
}
