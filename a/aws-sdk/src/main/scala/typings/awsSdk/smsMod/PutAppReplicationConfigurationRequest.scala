package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppReplicationConfigurationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * Information about the replication configurations for server groups in the application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
}
object PutAppReplicationConfigurationRequest {
  
  @scala.inline
  def apply(): PutAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutAppReplicationConfigurationRequestMutableBuilder[Self <: PutAppReplicationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = StObject.set(x, "serverGroupReplicationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupReplicationConfigurationsUndefined: Self = StObject.set(x, "serverGroupReplicationConfigurations", js.undefined)
    
    @scala.inline
    def setServerGroupReplicationConfigurationsVarargs(value: ServerGroupReplicationConfiguration*): Self = StObject.set(x, "serverGroupReplicationConfigurations", js.Array(value :_*))
  }
}
