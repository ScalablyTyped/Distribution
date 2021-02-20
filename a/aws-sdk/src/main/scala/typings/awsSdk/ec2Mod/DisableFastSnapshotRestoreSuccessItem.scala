package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableFastSnapshotRestoreSuccessItem extends StObject {
  
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
    * The state of fast snapshot restores for the snapshot.
    */
  var State: js.UndefOr[FastSnapshotRestoreStateCode] = js.native
  
  /**
    * The reason for the state transition. The possible values are as follows:    Client.UserInitiated - The state successfully transitioned to enabling or disabling.    Client.UserInitiated - Lifecycle state transition - The state successfully transitioned to optimizing, enabled, or disabled.  
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
}
object DisableFastSnapshotRestoreSuccessItem {
  
  @scala.inline
  def apply(): DisableFastSnapshotRestoreSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreSuccessItem]
  }
  
  @scala.inline
  implicit class DisableFastSnapshotRestoreSuccessItemMutableBuilder[Self <: DisableFastSnapshotRestoreSuccessItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDisabledTime(value: MillisecondDateTime): Self = StObject.set(x, "DisabledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTimeUndefined: Self = StObject.set(x, "DisabledTime", js.undefined)
    
    @scala.inline
    def setDisablingTime(value: MillisecondDateTime): Self = StObject.set(x, "DisablingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablingTimeUndefined: Self = StObject.set(x, "DisablingTime", js.undefined)
    
    @scala.inline
    def setEnabledTime(value: MillisecondDateTime): Self = StObject.set(x, "EnabledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledTimeUndefined: Self = StObject.set(x, "EnabledTime", js.undefined)
    
    @scala.inline
    def setEnablingTime(value: MillisecondDateTime): Self = StObject.set(x, "EnablingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablingTimeUndefined: Self = StObject.set(x, "EnablingTime", js.undefined)
    
    @scala.inline
    def setOptimizingTime(value: MillisecondDateTime): Self = StObject.set(x, "OptimizingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizingTimeUndefined: Self = StObject.set(x, "OptimizingTime", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: String): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setState(value: FastSnapshotRestoreStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
