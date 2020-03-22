package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByoipCidr extends js.Object {
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[GenericString] = js.native
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.native
}

object ByoipCidr {
  @scala.inline
  def apply(Cidr: GenericString = null, State: ByoipCidrState = null): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByoipCidr]
  }
}

