package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupReplicationConfiguration extends js.Object {
  
  /**
    * The ID of the server group with which this replication configuration is associated.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  
  /**
    * The replication configuration for servers in the server group.
    */
  var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.native
}
object ServerGroupReplicationConfiguration {
  
  @scala.inline
  def apply(): ServerGroupReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupReplicationConfiguration]
  }
  
  @scala.inline
  implicit class ServerGroupReplicationConfigurationOps[Self <: ServerGroupReplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setServerGroupId(value: ServerGroupId): Self = this.set("serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroupId: Self = this.set("serverGroupId", js.undefined)
    
    @scala.inline
    def setServerReplicationConfigurationsVarargs(value: ServerReplicationConfiguration*): Self = this.set("serverReplicationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServerReplicationConfigurations(value: ServerReplicationConfigurations): Self = this.set("serverReplicationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerReplicationConfigurations: Self = this.set("serverReplicationConfigurations", js.undefined)
  }
}
