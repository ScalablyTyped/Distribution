package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFailoverConfig extends js.Object {
  /**
    * Recovery window time to look for dash-7 packets
    */
  var RecoveryWindow: js.UndefOr[integer] = js.native
  var State: js.UndefOr[typings.awsSdk.mediaconnectMod.State] = js.native
}

object UpdateFailoverConfig {
  @scala.inline
  def apply(RecoveryWindow: js.UndefOr[integer] = js.undefined, State: State = null): UpdateFailoverConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RecoveryWindow)) __obj.updateDynamic("RecoveryWindow")(RecoveryWindow.get.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFailoverConfig]
  }
}

