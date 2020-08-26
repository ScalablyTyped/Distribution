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
  def apply(): ReservationUtilizationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationUtilizationGroup]
  }
  @scala.inline
  implicit class ReservationUtilizationGroupOps[Self <: ReservationUtilizationGroup] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setKey(value: ReservationGroupKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setUtilization(value: ReservationAggregates): Self = this.set("Utilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilization: Self = this.set("Utilization", js.undefined)
    @scala.inline
    def setValue(value: ReservationGroupValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

