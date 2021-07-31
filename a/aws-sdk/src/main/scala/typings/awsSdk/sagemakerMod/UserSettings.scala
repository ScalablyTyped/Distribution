package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSettings extends StObject {
  
  /**
    * The execution role for the user.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The Jupyter server's app settings.
    */
  var JupyterServerAppSettings: js.UndefOr[typings.awsSdk.sagemakerMod.JupyterServerAppSettings] = js.undefined
  
  /**
    * The kernel gateway app settings.
    */
  var KernelGatewayAppSettings: js.UndefOr[typings.awsSdk.sagemakerMod.KernelGatewayAppSettings] = js.undefined
  
  /**
    * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication. Optional when the CreateDomain.AppNetworkAccessType parameter is set to PublicInternetOnly. Required when the CreateDomain.AppNetworkAccessType parameter is set to VpcOnly.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The sharing settings.
    */
  var SharingSettings: js.UndefOr[typings.awsSdk.sagemakerMod.SharingSettings] = js.undefined
  
  /**
    * The TensorBoard app settings.
    */
  var TensorBoardAppSettings: js.UndefOr[typings.awsSdk.sagemakerMod.TensorBoardAppSettings] = js.undefined
}
object UserSettings {
  
  @scala.inline
  def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  
  @scala.inline
  implicit class UserSettingsMutableBuilder[Self <: UserSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionRole(value: RoleArn): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleUndefined: Self = StObject.set(x, "ExecutionRole", js.undefined)
    
    @scala.inline
    def setJupyterServerAppSettings(value: JupyterServerAppSettings): Self = StObject.set(x, "JupyterServerAppSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJupyterServerAppSettingsUndefined: Self = StObject.set(x, "JupyterServerAppSettings", js.undefined)
    
    @scala.inline
    def setKernelGatewayAppSettings(value: KernelGatewayAppSettings): Self = StObject.set(x, "KernelGatewayAppSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelGatewayAppSettingsUndefined: Self = StObject.set(x, "KernelGatewayAppSettings", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSharingSettings(value: SharingSettings): Self = StObject.set(x, "SharingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingSettingsUndefined: Self = StObject.set(x, "SharingSettings", js.undefined)
    
    @scala.inline
    def setTensorBoardAppSettings(value: TensorBoardAppSettings): Self = StObject.set(x, "TensorBoardAppSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorBoardAppSettingsUndefined: Self = StObject.set(x, "TensorBoardAppSettings", js.undefined)
  }
}
