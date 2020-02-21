package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionByoipCidrResult extends js.Object {
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.native
}

object ProvisionByoipCidrResult {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): ProvisionByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrResult]
  }
}

