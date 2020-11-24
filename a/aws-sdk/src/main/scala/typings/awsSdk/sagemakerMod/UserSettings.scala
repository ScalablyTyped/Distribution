package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSettings extends js.Object {
  
  /**
    * The execution role for the user.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.native
  
  /**
    * The Jupyter server's app settings.
    */
  var JupyterServerAppSettings: js.UndefOr[typings.awsSdk.sagemakerMod.JupyterServerAppSettings] = js.native
  
  /**
    * The kernel gateway app settings.
    */
  var KernelGatewayAppSettings: js.UndefOr[typings.awsSdk.sagemakerMod.KernelGatewayAppSettings] = js.native
  
  /**
    * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication. Optional when the CreateDomain.AppNetworkAccessType parameter is set to PublicInternetOnly. Required when the CreateDomain.AppNetworkAccessType parameter is set to VpcOnly.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.native
  
  /**
    * The sharing settings.
    */
  var SharingSettings: js.UndefOr[typings.awsSdk.sagemakerMod.SharingSettings] = js.native
  
  /**
    * The TensorBoard app settings.
    */
  var TensorBoardAppSettings: js.UndefOr[typings.awsSdk.sagemakerMod.TensorBoardAppSettings] = js.native
}
object UserSettings {
  
  @scala.inline
  def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  
  @scala.inline
  implicit class UserSettingsOps[Self <: UserSettings] (val x: Self) extends AnyVal {
    
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
    def setExecutionRole(value: RoleArn): Self = this.set("ExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRole: Self = this.set("ExecutionRole", js.undefined)
    
    @scala.inline
    def setJupyterServerAppSettings(value: JupyterServerAppSettings): Self = this.set("JupyterServerAppSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJupyterServerAppSettings: Self = this.set("JupyterServerAppSettings", js.undefined)
    
    @scala.inline
    def setKernelGatewayAppSettings(value: KernelGatewayAppSettings): Self = this.set("KernelGatewayAppSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelGatewayAppSettings: Self = this.set("KernelGatewayAppSettings", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupIds): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSharingSettings(value: SharingSettings): Self = this.set("SharingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingSettings: Self = this.set("SharingSettings", js.undefined)
    
    @scala.inline
    def setTensorBoardAppSettings(value: TensorBoardAppSettings): Self = this.set("TensorBoardAppSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorBoardAppSettings: Self = this.set("TensorBoardAppSettings", js.undefined)
  }
}
