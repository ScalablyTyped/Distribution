package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterSnapshotScheduleMessage extends js.Object {
  
  /**
    * A unique identifier for the cluster whose snapshot schedule you want to modify. 
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
    */
  var DisassociateSchedule: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
}
object ModifyClusterSnapshotScheduleMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotScheduleMessage]
  }
  
  @scala.inline
  implicit class ModifyClusterSnapshotScheduleMessageOps[Self <: ModifyClusterSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    
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
    def setDisassociateSchedule(value: BooleanOptional): Self = this.set("DisassociateSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisassociateSchedule: Self = this.set("DisassociateSchedule", js.undefined)
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = this.set("ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleIdentifier: Self = this.set("ScheduleIdentifier", js.undefined)
  }
}
