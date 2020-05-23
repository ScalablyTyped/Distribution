package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialMinutes extends js.Object {
  /**
    * The number of free trial minutes remaining in the account.
    */
  var remaining: js.UndefOr[Double] = js.native
  /**
    * The total number of free trial minutes that the account started with.
    */
  var total: js.UndefOr[Double] = js.native
}

object TrialMinutes {
  @scala.inline
  def apply(remaining: js.UndefOr[Double] = js.undefined, total: js.UndefOr[Double] = js.undefined): TrialMinutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remaining)) __obj.updateDynamic("remaining")(remaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialMinutes]
  }
}

