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
    * A history of status changes for an IP address range that that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  var Events: js.UndefOr[ByoipCidrEvents] = js.native
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.native
}

object ByoipCidr {
  @scala.inline
  def apply(Cidr: GenericString = null, Events: ByoipCidrEvents = null, State: ByoipCidrState = null): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByoipCidr]
  }
}

