package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstance extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The date when the Scheduled Instance was purchased.
    */
  var CreateDate: js.UndefOr[DateTime] = js.native
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The number of instances.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.native
  /**
    * The time for the next schedule to start.
    */
  var NextSlotStartTime: js.UndefOr[DateTime] = js.native
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The time that the previous schedule ended or will end.
    */
  var PreviousSlotEndTime: js.UndefOr[DateTime] = js.native
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.native
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: js.UndefOr[String] = js.native
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.native
  /**
    * The end date for the Scheduled Instance.
    */
  var TermEndDate: js.UndefOr[DateTime] = js.native
  /**
    * The start date for the Scheduled Instance.
    */
  var TermStartDate: js.UndefOr[DateTime] = js.native
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.native
}

object ScheduledInstance {
  @scala.inline
  def apply(): ScheduledInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstance]
  }
  @scala.inline
  implicit class ScheduledInstanceOps[Self <: ScheduledInstance] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: DateTime): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setHourlyPrice(value: String): Self = this.set("HourlyPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourlyPrice: Self = this.set("HourlyPrice", js.undefined)
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setNetworkPlatform(value: String): Self = this.set("NetworkPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPlatform: Self = this.set("NetworkPlatform", js.undefined)
    @scala.inline
    def setNextSlotStartTime(value: DateTime): Self = this.set("NextSlotStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSlotStartTime: Self = this.set("NextSlotStartTime", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPreviousSlotEndTime(value: DateTime): Self = this.set("PreviousSlotEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousSlotEndTime: Self = this.set("PreviousSlotEndTime", js.undefined)
    @scala.inline
    def setRecurrence(value: ScheduledInstanceRecurrence): Self = this.set("Recurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrence: Self = this.set("Recurrence", js.undefined)
    @scala.inline
    def setScheduledInstanceId(value: String): Self = this.set("ScheduledInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledInstanceId: Self = this.set("ScheduledInstanceId", js.undefined)
    @scala.inline
    def setSlotDurationInHours(value: Integer): Self = this.set("SlotDurationInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotDurationInHours: Self = this.set("SlotDurationInHours", js.undefined)
    @scala.inline
    def setTermEndDate(value: DateTime): Self = this.set("TermEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermEndDate: Self = this.set("TermEndDate", js.undefined)
    @scala.inline
    def setTermStartDate(value: DateTime): Self = this.set("TermStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermStartDate: Self = this.set("TermStartDate", js.undefined)
    @scala.inline
    def setTotalScheduledInstanceHours(value: Integer): Self = this.set("TotalScheduledInstanceHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalScheduledInstanceHours: Self = this.set("TotalScheduledInstanceHours", js.undefined)
  }
  
}

