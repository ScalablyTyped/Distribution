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
  def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
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
    def setCoverageCost(value: CoverageCost): Self = this.set("CoverageCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageCost: Self = this.set("CoverageCost", js.undefined)
    @scala.inline
    def setCoverageHours(value: CoverageHours): Self = this.set("CoverageHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageHours: Self = this.set("CoverageHours", js.undefined)
    @scala.inline
    def setCoverageNormalizedUnits(value: CoverageNormalizedUnits): Self = this.set("CoverageNormalizedUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageNormalizedUnits: Self = this.set("CoverageNormalizedUnits", js.undefined)
  }
  
}

