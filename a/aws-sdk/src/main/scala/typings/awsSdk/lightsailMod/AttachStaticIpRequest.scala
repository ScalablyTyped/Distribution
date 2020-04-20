package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachStaticIpRequest extends js.Object {
  /**
    * The instance name to which you want to attach the static IP address.
    */
  var instanceName: ResourceName = js.native
  /**
    * The name of the static IP.
    */
  var staticIpName: ResourceName = js.native
}

object AttachStaticIpRequest {
  @scala.inline
  def apply(instanceName: ResourceName, staticIpName: ResourceName): AttachStaticIpRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStaticIpRequest]
  }
}

