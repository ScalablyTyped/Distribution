package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceContributorCount extends js.Object {
  /**
    * Indicates whether the maximum count is reached.
    */
  var CapExceeded: js.UndefOr[Boolean] = js.native
  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
    */
  var CappedCount: js.UndefOr[Integer] = js.native
}

object ComplianceContributorCount {
  @scala.inline
  def apply(CapExceeded: js.UndefOr[Boolean] = js.undefined, CappedCount: js.UndefOr[Integer] = js.undefined): ComplianceContributorCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CapExceeded)) __obj.updateDynamic("CapExceeded")(CapExceeded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CappedCount)) __obj.updateDynamic("CappedCount")(CappedCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceContributorCount]
  }
}

