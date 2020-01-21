package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInstancePublicPortsRequest extends js.Object {
  /**
    * The Lightsail instance name of the public port(s) you are setting.
    */
  var instanceName: ResourceName = js.native
  /**
    * Specifies information about the public port(s).
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

