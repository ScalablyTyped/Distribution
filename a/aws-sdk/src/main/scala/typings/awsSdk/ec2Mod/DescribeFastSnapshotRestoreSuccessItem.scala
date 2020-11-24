package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFastSnapshotRestoreSuccessItem extends js.Object {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The time at which fast snapshot restores entered the disabled state.
    */
  var DisabledTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The time at which fast snapshot restores entered the disabling state.
    */
  var DisablingTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The time at which fast snapshot restores entered the enabled state.
    */
  var EnabledTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The time at which fast snapshot restores entered the enabling state.
    */
  var EnablingTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The time at which fast snapshot restores entered the optimizing state.
    */
  var OptimizingTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The AWS owner alias that enabled fast snapshot restores on the snapshot. This is intended for future use.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that enabled fast snapshot restores on the snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  
  /**
    * The state of fast snapshot restores.
    */
  var State: js.UndefOr[FastSnapshotRestoreStateCode] = js.native
  
  /**
    * The reason for the state transition. The possible values are as follows:    Client.UserInitiated - The state successfully transitioned to enabling or disabling.    Client.UserInitiated - Lifecycle state transition - The state successfully transitioned to optimizing, enabled, or disabled.  
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
}
object DescribeFastSnapshotRestoreSuccessItem {
  
  @scala.inline
  def apply(): DescribeFastSnapshotRestoreSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastSnapshotRestoreSuccessItem]
  }
  
  @scala.inline
  implicit class DescribeFastSnapshotRestoreSuccessItemOps[Self <: DescribeFastSnapshotRestoreSuccessItem] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDisabledTime(value: MillisecondDateTime): Self = this.set("DisabledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTime: Self = this.set("DisabledTime", js.undefined)
    
    @scala.inline
    def setDisablingTime(value: MillisecondDateTime): Self = this.set("DisablingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablingTime: Self = this.set("DisablingTime", js.undefined)
    
    @scala.inline
    def setEnabledTime(value: MillisecondDateTime): Self = this.set("EnabledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledTime: Self = this.set("EnabledTime", js.undefined)
    
    @scala.inline
    def setEnablingTime(value: MillisecondDateTime): Self = this.set("EnablingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablingTime: Self = this.set("EnablingTime", js.undefined)
    
    @scala.inline
    def setOptimizingTime(value: MillisecondDateTime): Self = this.set("OptimizingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizingTime: Self = this.set("OptimizingTime", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: String): Self = this.set("OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAlias: Self = this.set("OwnerAlias", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    
    @scala.inline
    def setState(value: FastSnapshotRestoreStateCode): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateTransitionReason(value: String): Self = this.set("StateTransitionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateTransitionReason: Self = this.set("StateTransitionReason", js.undefined)
  }
}
