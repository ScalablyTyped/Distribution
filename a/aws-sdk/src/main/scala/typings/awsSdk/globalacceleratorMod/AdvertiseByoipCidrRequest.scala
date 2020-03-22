package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiseByoipCidrRequest extends js.Object {
  /**
    * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only a portion of the provisioned range.
    */
  var Cidr: GenericString = js.native
}

object AdvertiseByoipCidrRequest {
  @scala.inline
  def apply(Cidr: GenericString): AdvertiseByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvertiseByoipCidrRequest]
  }
}

