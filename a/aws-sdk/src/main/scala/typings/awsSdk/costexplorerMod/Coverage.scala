package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coverage extends js.Object {
  /**
    * The amount of cost that the reservation covered.
    */
  var CoverageCost: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageCost] = js.native
  /**
    * The amount of instance usage that the reservation covered, in hours.
    */
  var CoverageHours: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageHours] = js.native
  /**
    * The amount of instance usage that the reservation covered, in normalized units.
    */
  var CoverageNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageNormalizedUnits] = js.native
}

object Coverage {
  @scala.inline
  def apply(
    CoverageCost: CoverageCost = null,
    CoverageHours: CoverageHours = null,
    CoverageNormalizedUnits: CoverageNormalizedUnits = null
  ): Coverage = {
    val __obj = js.Dynamic.literal()
    if (CoverageCost != null) __obj.updateDynamic("CoverageCost")(CoverageCost.asInstanceOf[js.Any])
    if (CoverageHours != null) __obj.updateDynamic("CoverageHours")(CoverageHours.asInstanceOf[js.Any])
    if (CoverageNormalizedUnits != null) __obj.updateDynamic("CoverageNormalizedUnits")(CoverageNormalizedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
}

