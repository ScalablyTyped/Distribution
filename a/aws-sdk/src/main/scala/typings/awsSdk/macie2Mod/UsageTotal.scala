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
  def apply(): UsageTotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageTotal]
  }
  @scala.inline
  implicit class UsageTotalOps[Self <: UsageTotal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: Currency): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setEstimatedCost(value: string): Self = this.set("estimatedCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedCost: Self = this.set("estimatedCost", js.undefined)
    @scala.inline
    def setType(value: UsageType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

