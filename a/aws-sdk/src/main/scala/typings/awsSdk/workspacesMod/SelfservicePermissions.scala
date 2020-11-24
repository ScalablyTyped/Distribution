package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelfservicePermissions extends js.Object {
  
  /**
    * Specifies whether users can change the compute type (bundle) for their WorkSpace.
    */
  var ChangeComputeType: js.UndefOr[ReconnectEnum] = js.native
  
  /**
    * Specifies whether users can increase the volume size of the drives on their WorkSpace.
    */
  var IncreaseVolumeSize: js.UndefOr[ReconnectEnum] = js.native
  
  /**
    * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
    */
  var RebuildWorkspace: js.UndefOr[ReconnectEnum] = js.native
  
  /**
    * Specifies whether users can restart their WorkSpace.
    */
  var RestartWorkspace: js.UndefOr[ReconnectEnum] = js.native
  
  /**
    * Specifies whether users can switch the running mode of their WorkSpace.
    */
  var SwitchRunningMode: js.UndefOr[ReconnectEnum] = js.native
}
object SelfservicePermissions {
  
  @scala.inline
  def apply(): SelfservicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfservicePermissions]
  }
  
  @scala.inline
  implicit class SelfservicePermissionsOps[Self <: SelfservicePermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeComputeType(value: ReconnectEnum): Self = this.set("ChangeComputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeComputeType: Self = this.set("ChangeComputeType", js.undefined)
    
    @scala.inline
    def setIncreaseVolumeSize(value: ReconnectEnum): Self = this.set("IncreaseVolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseVolumeSize: Self = this.set("IncreaseVolumeSize", js.undefined)
    
    @scala.inline
    def setRebuildWorkspace(value: ReconnectEnum): Self = this.set("RebuildWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebuildWorkspace: Self = this.set("RebuildWorkspace", js.undefined)
    
    @scala.inline
    def setRestartWorkspace(value: ReconnectEnum): Self = this.set("RestartWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartWorkspace: Self = this.set("RestartWorkspace", js.undefined)
    
    @scala.inline
    def setSwitchRunningMode(value: ReconnectEnum): Self = this.set("SwitchRunningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchRunningMode: Self = this.set("SwitchRunningMode", js.undefined)
  }
}
