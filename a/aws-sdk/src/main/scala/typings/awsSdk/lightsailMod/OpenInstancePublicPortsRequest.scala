package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance for which to open ports.
    */
  var instanceName: ResourceName = js.native
  /**
    * An object to describe the ports to open for the specified instance.
    */
  var portInfo: PortInfo = js.native
}

object OpenInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): OpenInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenInstancePublicPortsRequest]
  }
}

