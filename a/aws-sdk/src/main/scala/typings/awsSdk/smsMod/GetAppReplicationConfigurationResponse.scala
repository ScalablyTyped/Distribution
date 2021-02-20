package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppReplicationConfigurationResponse extends StObject {
  
  /**
    * The replication configurations associated with server groups in this application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.native
}
object GetAppReplicationConfigurationResponse {
  
  @scala.inline
  def apply(): GetAppReplicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetAppReplicationConfigurationResponseMutableBuilder[Self <: GetAppReplicationConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = StObject.set(x, "serverGroupReplicationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupReplicationConfigurationsUndefined: Self = StObject.set(x, "serverGroupReplicationConfigurations", js.undefined)
    
    @scala.inline
    def setServerGroupReplicationConfigurationsVarargs(value: ServerGroupReplicationConfiguration*): Self = StObject.set(x, "serverGroupReplicationConfigurations", js.Array(value :_*))
  }
}
