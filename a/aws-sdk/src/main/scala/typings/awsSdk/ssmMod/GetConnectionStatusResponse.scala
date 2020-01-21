package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionStatusResponse extends js.Object {
  /**
    * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
    */
  var Status: js.UndefOr[ConnectionStatus] = js.native
  /**
    * The ID of the instance to check connection status. 
    */
  var Target: js.UndefOr[SessionTarget] = js.native
}

object GetConnectionStatusResponse {
  @scala.inline
  def apply(Status: ConnectionStatus = null, Target: SessionTarget = null): GetConnectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionStatusResponse]
  }
}

