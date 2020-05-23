package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalPortDetails extends js.Object {
  /**
    * The port number of the local connection.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The port name of the local connection.
    */
  var PortName: js.UndefOr[String] = js.native
}

object LocalPortDetails {
  @scala.inline
  def apply(Port: js.UndefOr[Integer] = js.undefined, PortName: String = null): LocalPortDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (PortName != null) __obj.updateDynamic("PortName")(PortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalPortDetails]
  }
}

