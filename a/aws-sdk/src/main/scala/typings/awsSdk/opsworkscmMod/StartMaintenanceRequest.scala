package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMaintenanceRequest extends js.Object {
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
  def apply(ServerName: ServerName, EngineAttributes: EngineAttributes = null): StartMaintenanceRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    if (EngineAttributes != null) __obj.updateDynamic("EngineAttributes")(EngineAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMaintenanceRequest]
  }
}

