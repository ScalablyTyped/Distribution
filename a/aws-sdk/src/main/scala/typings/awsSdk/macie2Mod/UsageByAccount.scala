package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageByAccount extends js.Object {
  /**
    * The type of currency that the value for the metric (estimatedCost) is reported in.
    */
  var currency: js.UndefOr[Currency] = js.native
  /**
    * The estimated value for the metric.
    */
  var estimatedCost: js.UndefOr[string] = js.native
  /**
    * The current value for the quota that corresponds to the metric specified by the type field.
    */
  var serviceLimit: js.UndefOr[ServiceLimit] = js.native
  /**
    * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
    */
  var `type`: js.UndefOr[UsageType] = js.native
}

object UsageByAccount {
  @scala.inline
  def apply(
    currency: Currency = null,
    estimatedCost: string = null,
    serviceLimit: ServiceLimit = null,
    `type`: UsageType = null
  ): UsageByAccount = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (estimatedCost != null) __obj.updateDynamic("estimatedCost")(estimatedCost.asInstanceOf[js.Any])
    if (serviceLimit != null) __obj.updateDynamic("serviceLimit")(serviceLimit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageByAccount]
  }
}

