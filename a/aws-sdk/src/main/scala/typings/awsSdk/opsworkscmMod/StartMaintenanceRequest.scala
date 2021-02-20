package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMaintenanceRequest extends StObject {
  
  /**
    * Engine attributes that are specific to the server on which you want to run maintenance.  Attributes accepted in a StartMaintenance request for Chef     CHEF_MAJOR_UPGRADE: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a StartMaintenance request and set the value to true to upgrade the server to Chef Automate 2. For more information, see Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2.   
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  
  /**
    * The name of the server on which to run maintenance. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}
object StartMaintenanceRequest {
  
  @scala.inline
  def apply(ServerName: ServerName): StartMaintenanceRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMaintenanceRequest]
  }
  
  @scala.inline
  implicit class StartMaintenanceRequestMutableBuilder[Self <: StartMaintenanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    @scala.inline
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value :_*))
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
