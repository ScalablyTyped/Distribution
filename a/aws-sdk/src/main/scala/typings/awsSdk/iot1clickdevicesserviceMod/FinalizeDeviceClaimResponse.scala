package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalizeDeviceClaimResponse extends js.Object {
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.native
}

object FinalizeDeviceClaimResponse {
  @scala.inline
  def apply(State: string = null): FinalizeDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeDeviceClaimResponse]
  }
}

