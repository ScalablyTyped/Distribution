package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationCoverageGroup extends js.Object {
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * How much instance usage this group of reservations covered.
    */
  var Coverage: js.UndefOr[typings.awsSdk.costexplorerMod.Coverage] = js.native
}

object ReservationCoverageGroup {
  @scala.inline
  def apply(Attributes: Attributes = null, Coverage: Coverage = null): ReservationCoverageGroup = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Coverage != null) __obj.updateDynamic("Coverage")(Coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationCoverageGroup]
  }
}

