package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMaintenanceRequest extends StObject {
  
  /**
    * Engine attributes that are specific to the server on which you want to run maintenance.  Attributes accepted in a StartMaintenance request for Chef     CHEF_MAJOR_UPGRADE: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a StartMaintenance request and set the value to true to upgrade the server to Chef Automate 2. For more information, see Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2.   
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttributes] = js.undefined
  
  /**
    * The name of the server on which to run maintenance. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName
}
object StartMaintenanceRequest {
  
  inline def apply(ServerName: ServerName): StartMaintenanceRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMaintenanceRequest]
  }
  
  extension [Self <: StartMaintenanceRequest](x: Self) {
    
    inline def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    inline def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    inline def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value :_*))
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
