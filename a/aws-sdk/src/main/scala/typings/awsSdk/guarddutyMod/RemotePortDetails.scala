package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemotePortDetails extends js.Object {
  /**
    * The port number of the remote connection.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The port name of the remote connection.
    */
  var PortName: js.UndefOr[String] = js.native
}

object RemotePortDetails {
  @scala.inline
  def apply(Port: js.UndefOr[Integer] = js.undefined, PortName: String = null): RemotePortDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (PortName != null) __obj.updateDynamic("PortName")(PortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePortDetails]
  }
}

