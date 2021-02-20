package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupReplicationConfiguration extends StObject {
  
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
  implicit class ServerGroupReplicationConfigurationMutableBuilder[Self <: ServerGroupReplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    @scala.inline
    def setServerReplicationConfigurations(value: ServerReplicationConfigurations): Self = StObject.set(x, "serverReplicationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerReplicationConfigurationsUndefined: Self = StObject.set(x, "serverReplicationConfigurations", js.undefined)
    
    @scala.inline
    def setServerReplicationConfigurationsVarargs(value: ServerReplicationConfiguration*): Self = StObject.set(x, "serverReplicationConfigurations", js.Array(value :_*))
  }
}
