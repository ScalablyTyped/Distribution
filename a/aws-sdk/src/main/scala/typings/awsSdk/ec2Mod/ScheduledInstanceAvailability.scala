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
  def apply(
    AvailabilityZone: String = null,
    AvailableInstanceCount: Int | scala.Double = null,
    FirstSlotStartTime: DateTime = null,
    HourlyPrice: String = null,
    InstanceType: String = null,
    MaxTermDurationInDays: Int | scala.Double = null,
    MinTermDurationInDays: Int | scala.Double = null,
    NetworkPlatform: String = null,
    Platform: String = null,
    PurchaseToken: String = null,
    Recurrence: ScheduledInstanceRecurrence = null,
    SlotDurationInHours: Int | scala.Double = null,
    TotalScheduledInstanceHours: Int | scala.Double = null
  ): ScheduledInstanceAvailability = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (AvailableInstanceCount != null) __obj.updateDynamic("AvailableInstanceCount")(AvailableInstanceCount.asInstanceOf[js.Any])
    if (FirstSlotStartTime != null) __obj.updateDynamic("FirstSlotStartTime")(FirstSlotStartTime.asInstanceOf[js.Any])
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (MaxTermDurationInDays != null) __obj.updateDynamic("MaxTermDurationInDays")(MaxTermDurationInDays.asInstanceOf[js.Any])
    if (MinTermDurationInDays != null) __obj.updateDynamic("MinTermDurationInDays")(MinTermDurationInDays.asInstanceOf[js.Any])
    if (NetworkPlatform != null) __obj.updateDynamic("NetworkPlatform")(NetworkPlatform.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PurchaseToken != null) __obj.updateDynamic("PurchaseToken")(PurchaseToken.asInstanceOf[js.Any])
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence.asInstanceOf[js.Any])
    if (SlotDurationInHours != null) __obj.updateDynamic("SlotDurationInHours")(SlotDurationInHours.asInstanceOf[js.Any])
    if (TotalScheduledInstanceHours != null) __obj.updateDynamic("TotalScheduledInstanceHours")(TotalScheduledInstanceHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstanceAvailability]
  }
}

