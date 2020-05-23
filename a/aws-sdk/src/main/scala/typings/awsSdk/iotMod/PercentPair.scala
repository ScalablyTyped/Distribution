package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PercentPair extends js.Object {
  /**
    * The percentile.
    */
  var percent: js.UndefOr[Percent] = js.native
  /**
    * The value of the percentile.
    */
  var value: js.UndefOr[PercentValue] = js.native
}

object PercentPair {
  @scala.inline
  def apply(percent: js.UndefOr[Percent] = js.undefined, value: js.UndefOr[PercentValue] = js.undefined): PercentPair = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentPair]
  }
}

