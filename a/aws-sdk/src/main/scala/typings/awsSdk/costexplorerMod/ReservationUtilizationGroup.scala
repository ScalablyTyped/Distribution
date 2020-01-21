package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationUtilizationGroup extends js.Object {
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The key for a specific reservation attribute.
    */
  var Key: js.UndefOr[ReservationGroupKey] = js.native
  /**
    * How much you used this group of reservations.
    */
  var Utilization: js.UndefOr[ReservationAggregates] = js.native
  /**
    * The value of a specific reservation attribute.
    */
  var Value: js.UndefOr[ReservationGroupValue] = js.native
}

object ReservationUtilizationGroup {
  @scala.inline
  def apply(
    Attributes: Attributes = null,
    Key: ReservationGroupKey = null,
    Utilization: ReservationAggregates = null,
    Value: ReservationGroupValue = null
  ): ReservationUtilizationGroup = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Utilization != null) __obj.updateDynamic("Utilization")(Utilization.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationUtilizationGroup]
  }
}

