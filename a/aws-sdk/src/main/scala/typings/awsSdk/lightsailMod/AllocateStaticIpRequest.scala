package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateStaticIpRequest extends js.Object {
  /**
    * The name of the static IP address.
    */
  var staticIpName: ResourceName = js.native
}

object AllocateStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): AllocateStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateStaticIpRequest]
  }
}

