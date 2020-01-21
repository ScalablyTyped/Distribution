package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMaintenanceResponse extends js.Object {
  /**
    * Contains the response to a StartMaintenance request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.native
}

object StartMaintenanceResponse {
  @scala.inline
  def apply(Server: Server = null): StartMaintenanceResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMaintenanceResponse]
  }
}

