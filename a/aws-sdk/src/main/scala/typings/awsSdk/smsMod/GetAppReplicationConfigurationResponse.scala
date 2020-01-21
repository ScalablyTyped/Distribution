package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppReplicationConfigurationResponse extends js.Object {
  /**
    * Replication configurations associated with server groups in this application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.native
}

object GetAppReplicationConfigurationResponse {
  @scala.inline
  def apply(serverGroupReplicationConfigurations: ServerGroupReplicationConfigurations = null): GetAppReplicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (serverGroupReplicationConfigurations != null) __obj.updateDynamic("serverGroupReplicationConfigurations")(serverGroupReplicationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
  }
}

