package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupReplicationConfiguration extends StObject {
  
  /**
    * The ID of the server group with which this replication configuration is associated.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  
  /**
    * The replication configuration for servers in the server group.
    */
  var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.undefined
}
object ServerGroupReplicationConfiguration {
  
  inline def apply(): ServerGroupReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupReplicationConfiguration]
  }
  
  extension [Self <: ServerGroupReplicationConfiguration](x: Self) {
    
    inline def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    inline def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    inline def setServerReplicationConfigurations(value: ServerReplicationConfigurations): Self = StObject.set(x, "serverReplicationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerReplicationConfigurationsUndefined: Self = StObject.set(x, "serverReplicationConfigurations", js.undefined)
    
    inline def setServerReplicationConfigurationsVarargs(value: ServerReplicationConfiguration*): Self = StObject.set(x, "serverReplicationConfigurations", js.Array(value*))
  }
}
