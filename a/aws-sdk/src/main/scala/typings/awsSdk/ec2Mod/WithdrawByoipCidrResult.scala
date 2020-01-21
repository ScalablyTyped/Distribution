package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithdrawByoipCidrResult extends js.Object {
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.native
}

object WithdrawByoipCidrResult {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): WithdrawByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrResult]
  }
}

