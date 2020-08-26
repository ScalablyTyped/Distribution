package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstanceAvailability extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of available instances.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The time period for the first schedule to start.
    */
  var FirstSlotStartTime: js.UndefOr[DateTime] = js.native
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The maximum term. The only possible value is 365 days.
    */
  var MaxTermDurationInDays: js.UndefOr[Integer] = js.native
  /**
    * The minimum term. The only possible value is 365 days.
    */
  var MinTermDurationInDays: js.UndefOr[Integer] = js.native
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.native
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The purchase token. This token expires in two hours.
    */
  var PurchaseToken: js.UndefOr[String] = js.native
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.native
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.native
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.native
}

object ScheduledInstanceAvailability {
  @scala.inline
  def apply(): ScheduledInstanceAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceAvailability]
  }
  @scala.inline
  implicit class ScheduledInstanceAvailabilityOps[Self <: ScheduledInstanceAvailability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setAvailableInstanceCount(value: Integer): Self = this.set("AvailableInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableInstanceCount: Self = this.set("AvailableInstanceCount", js.undefined)
    @scala.inline
    def setFirstSlotStartTime(value: DateTime): Self = this.set("FirstSlotStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSlotStartTime: Self = this.set("FirstSlotStartTime", js.undefined)
    @scala.inline
    def setHourlyPrice(value: String): Self = this.set("HourlyPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourlyPrice: Self = this.set("HourlyPrice", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setMaxTermDurationInDays(value: Integer): Self = this.set("MaxTermDurationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTermDurationInDays: Self = this.set("MaxTermDurationInDays", js.undefined)
    @scala.inline
    def setMinTermDurationInDays(value: Integer): Self = this.set("MinTermDurationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTermDurationInDays: Self = this.set("MinTermDurationInDays", js.undefined)
    @scala.inline
    def setNetworkPlatform(value: String): Self = this.set("NetworkPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPlatform: Self = this.set("NetworkPlatform", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPurchaseToken(value: String): Self = this.set("PurchaseToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurchaseToken: Self = this.set("PurchaseToken", js.undefined)
    @scala.inline
    def setRecurrence(value: ScheduledInstanceRecurrence): Self = this.set("Recurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrence: Self = this.set("Recurrence", js.undefined)
    @scala.inline
    def setSlotDurationInHours(value: Integer): Self = this.set("SlotDurationInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotDurationInHours: Self = this.set("SlotDurationInHours", js.undefined)
    @scala.inline
    def setTotalScheduledInstanceHours(value: Integer): Self = this.set("TotalScheduledInstanceHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalScheduledInstanceHours: Self = this.set("TotalScheduledInstanceHours", js.undefined)
  }
  
}

