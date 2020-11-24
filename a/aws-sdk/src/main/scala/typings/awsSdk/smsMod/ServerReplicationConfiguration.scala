package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerReplicationConfiguration extends js.Object {
  
  /**
    * The ID of the server with which this replication configuration is associated.
    */
  var server: js.UndefOr[Server] = js.native
  
  /**
    * The parameters for replicating the server.
    */
  var serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.native
}
object ServerReplicationConfiguration {
  
  @scala.inline
  def apply(): ServerReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationConfiguration]
  }
  
  @scala.inline
  implicit class ServerReplicationConfigurationOps[Self <: ServerReplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setServerReplicationParameters(value: ServerReplicationParameters): Self = this.set("serverReplicationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerReplicationParameters: Self = this.set("serverReplicationParameters", js.undefined)
  }
}
