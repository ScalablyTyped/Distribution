package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStaticIpRequest extends js.Object {
  /**
    * The name of the static IP in Lightsail.
    */
  var staticIpName: ResourceName = js.native
}

object GetStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): GetStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpRequest]
  }
}

