package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance for which to open ports.
    */
  var instanceName: ResourceName = js.native
  /**
    * An array of objects to describe the ports to open for the specified instance.
    */
  var portInfos: PortInfoList = js.native
}

object PutInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfos: PortInfoList): PutInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfos = portInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInstancePublicPortsRequest]
  }
}

