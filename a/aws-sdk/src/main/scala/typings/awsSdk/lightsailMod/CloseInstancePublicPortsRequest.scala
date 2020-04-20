package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance on which you're attempting to close the public ports.
    */
  var instanceName: ResourceName = js.native
  /**
    * Information about the public port you are trying to close.
    */
  var portInfo: PortInfo = js.native
}

object CloseInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): CloseInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseInstancePublicPortsRequest]
  }
}

