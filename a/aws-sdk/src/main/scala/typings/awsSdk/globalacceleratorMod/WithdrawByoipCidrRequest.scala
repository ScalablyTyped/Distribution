package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithdrawByoipCidrRequest extends js.Object {
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: GenericString = js.native
}

object WithdrawByoipCidrRequest {
  @scala.inline
  def apply(Cidr: GenericString): WithdrawByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrRequest]
  }
}

