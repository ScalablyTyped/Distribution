package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithdrawByoipCidrResponse extends js.Object {
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}

object WithdrawByoipCidrResponse {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): WithdrawByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrResponse]
  }
}

