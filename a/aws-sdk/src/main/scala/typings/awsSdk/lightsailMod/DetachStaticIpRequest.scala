package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachStaticIpRequest extends js.Object {
  /**
    * The name of the static IP to detach from the instance.
    */
  var staticIpName: ResourceName = js.native
}

object DetachStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): DetachStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachStaticIpRequest]
  }
}

