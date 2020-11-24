package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupLaunchConfiguration extends js.Object {
  
  /**
    * The launch order of servers in the server group.
    */
  var launchOrder: js.UndefOr[LaunchOrder] = js.native
  
  /**
    * The ID of the server group with which the launch configuration is associated.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  
  /**
    * The launch configuration for servers in the server group.
    */
  var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.native
}
object ServerGroupLaunchConfiguration {
  
  @scala.inline
  def apply(): ServerGroupLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupLaunchConfiguration]
  }
  
  @scala.inline
  implicit class ServerGroupLaunchConfigurationOps[Self <: ServerGroupLaunchConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLaunchOrder(value: LaunchOrder): Self = this.set("launchOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchOrder: Self = this.set("launchOrder", js.undefined)
    
    @scala.inline
    def setServerGroupId(value: ServerGroupId): Self = this.set("serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroupId: Self = this.set("serverGroupId", js.undefined)
    
    @scala.inline
    def setServerLaunchConfigurationsVarargs(value: ServerLaunchConfiguration*): Self = this.set("serverLaunchConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServerLaunchConfigurations(value: ServerLaunchConfigurations): Self = this.set("serverLaunchConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerLaunchConfigurations: Self = this.set("serverLaunchConfigurations", js.undefined)
  }
}
