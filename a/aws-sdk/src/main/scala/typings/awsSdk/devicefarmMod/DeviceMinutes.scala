package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMinutes extends js.Object {
  /**
    * When specified, represents only the sum of metered minutes used by the resource to run tests.
    */
  var metered: js.UndefOr[Double] = js.native
  /**
    * When specified, represents the total minutes used by the resource to run tests.
    */
  var total: js.UndefOr[Double] = js.native
  /**
    * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
    */
  var unmetered: js.UndefOr[Double] = js.native
}

object DeviceMinutes {
  @scala.inline
  def apply(
    metered: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined,
    unmetered: js.UndefOr[Double] = js.undefined
  ): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metered)) __obj.updateDynamic("metered")(metered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unmetered)) __obj.updateDynamic("unmetered")(unmetered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMinutes]
  }
}

