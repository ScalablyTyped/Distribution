package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerReplicationConfiguration extends StObject {
  
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
  implicit class ServerReplicationConfigurationMutableBuilder[Self <: ServerReplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerReplicationParameters(value: ServerReplicationParameters): Self = StObject.set(x, "serverReplicationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerReplicationParametersUndefined: Self = StObject.set(x, "serverReplicationParameters", js.undefined)
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
