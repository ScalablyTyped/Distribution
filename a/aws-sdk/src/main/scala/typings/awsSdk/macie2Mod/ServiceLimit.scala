package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLimit extends js.Object {
  /**
    * Specifies whether the account has met the quota that corresponds to the metric specified by the UsageByAccount.type field in the response.
    */
  var isServiceLimited: js.UndefOr[boolean] = js.native
  /**
    * The unit of measurement for the value specified by the value field.
    */
  var unit: js.UndefOr[Unit] = js.native
  /**
    * The value for the metric specified by the UsageByAccount.type field in the response.
    */
  var value: js.UndefOr[long] = js.native
}

object ServiceLimit {
  @scala.inline
  def apply(
    isServiceLimited: js.UndefOr[boolean] = js.undefined,
    unit: Unit = null,
    value: js.UndefOr[long] = js.undefined
  ): ServiceLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServiceLimited)) __obj.updateDynamic("isServiceLimited")(isServiceLimited.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLimit]
  }
}

