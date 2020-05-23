package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageTotal extends js.Object {
  /**
    * The type of currency that the value for the metric (estimatedCost) is reported in.
    */
  var currency: js.UndefOr[Currency] = js.native
  /**
    * The estimated value for the metric.
    */
  var estimatedCost: js.UndefOr[string] = js.native
  /**
    * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
    */
  var `type`: js.UndefOr[UsageType] = js.native
}

object UsageTotal {
  @scala.inline
  def apply(currency: Currency = null, estimatedCost: string = null, `type`: UsageType = null): UsageTotal = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (estimatedCost != null) __obj.updateDynamic("estimatedCost")(estimatedCost.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageTotal]
  }
}

