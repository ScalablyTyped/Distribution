package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprovisionByoipCidrRequest extends js.Object {
  /**
    * The address range, in CIDR notation. The prefix must be the same prefix that you specified when you provisioned the address range.
    */
  var Cidr: GenericString = js.native
}

object DeprovisionByoipCidrRequest {
  @scala.inline
  def apply(Cidr: GenericString): DeprovisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprovisionByoipCidrRequest]
  }
}

