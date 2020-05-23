package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageCost extends js.Object {
  /**
    * How much an On-Demand Instance costs.
    */
  var OnDemandCost: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandCost] = js.native
}

object CoverageCost {
  @scala.inline
  def apply(OnDemandCost: OnDemandCost = null): CoverageCost = {
    val __obj = js.Dynamic.literal()
    if (OnDemandCost != null) __obj.updateDynamic("OnDemandCost")(OnDemandCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageCost]
  }
}

