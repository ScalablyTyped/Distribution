package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInterconnectResponse extends js.Object {
  /**
    * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.    unknown: The state of the interconnect is not available.  
    */
  var interconnectState: js.UndefOr[InterconnectState] = js.native
}

object DeleteInterconnectResponse {
  @scala.inline
  def apply(interconnectState: InterconnectState = null): DeleteInterconnectResponse = {
    val __obj = js.Dynamic.literal()
    if (interconnectState != null) __obj.updateDynamic("interconnectState")(interconnectState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInterconnectResponse]
  }
}

