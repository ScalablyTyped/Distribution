package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfservicePermissions extends StObject {
  
  /**
    * Specifies whether users can change the compute type (bundle) for their WorkSpace.
    */
  var ChangeComputeType: js.UndefOr[ReconnectEnum] = js.undefined
  
  /**
    * Specifies whether users can increase the volume size of the drives on their WorkSpace.
    */
  var IncreaseVolumeSize: js.UndefOr[ReconnectEnum] = js.undefined
  
  /**
    * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
    */
  var RebuildWorkspace: js.UndefOr[ReconnectEnum] = js.undefined
  
  /**
    * Specifies whether users can restart their WorkSpace.
    */
  var RestartWorkspace: js.UndefOr[ReconnectEnum] = js.undefined
  
  /**
    * Specifies whether users can switch the running mode of their WorkSpace.
    */
  var SwitchRunningMode: js.UndefOr[ReconnectEnum] = js.undefined
}
object SelfservicePermissions {
  
  @scala.inline
  def apply(): SelfservicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfservicePermissions]
  }
  
  @scala.inline
  implicit class SelfservicePermissionsMutableBuilder[Self <: SelfservicePermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeComputeType(value: ReconnectEnum): Self = StObject.set(x, "ChangeComputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeComputeTypeUndefined: Self = StObject.set(x, "ChangeComputeType", js.undefined)
    
    @scala.inline
    def setIncreaseVolumeSize(value: ReconnectEnum): Self = StObject.set(x, "IncreaseVolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseVolumeSizeUndefined: Self = StObject.set(x, "IncreaseVolumeSize", js.undefined)
    
    @scala.inline
    def setRebuildWorkspace(value: ReconnectEnum): Self = StObject.set(x, "RebuildWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuildWorkspaceUndefined: Self = StObject.set(x, "RebuildWorkspace", js.undefined)
    
    @scala.inline
    def setRestartWorkspace(value: ReconnectEnum): Self = StObject.set(x, "RestartWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartWorkspaceUndefined: Self = StObject.set(x, "RestartWorkspace", js.undefined)
    
    @scala.inline
    def setSwitchRunningMode(value: ReconnectEnum): Self = StObject.set(x, "SwitchRunningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchRunningModeUndefined: Self = StObject.set(x, "SwitchRunningMode", js.undefined)
  }
}
