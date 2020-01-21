package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortForwardingConfig extends js.Object {
  /**
    * The port mappings for the configuration.
    */
  var portMappings: js.UndefOr[PortMappingList] = js.native
}

object PortForwardingConfig {
  @scala.inline
  def apply(portMappings: PortMappingList = null): PortForwardingConfig = {
    val __obj = js.Dynamic.literal()
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortForwardingConfig]
  }
}

