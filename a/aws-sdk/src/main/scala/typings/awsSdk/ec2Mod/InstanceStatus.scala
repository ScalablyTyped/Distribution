package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatus extends js.Object {
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Any scheduled events associated with the instance.
    */
  var Events: js.UndefOr[InstanceStatusEventList] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The intended state of the instance. DescribeInstanceStatus requires that an instance be in the running state.
    */
  var InstanceState: js.UndefOr[typings.awsSdk.ec2Mod.InstanceState] = js.native
  /**
    * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
    */
  var InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * Reports impaired functionality that stems from issues related to the systems that support an instance, such as hardware failures and network connectivity problems.
    */
  var SystemStatus: js.UndefOr[InstanceStatusSummary] = js.native
}

object InstanceStatus {
  @scala.inline
  def apply(): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatus]
  }
  @scala.inline
  implicit class InstanceStatusOps[Self <: InstanceStatus] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: InstanceStatusEvent*): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: InstanceStatusEventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setInstanceState(value: InstanceState): Self = this.set("InstanceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceState: Self = this.set("InstanceState", js.undefined)
    @scala.inline
    def setInstanceStatus(value: InstanceStatusSummary): Self = this.set("InstanceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceStatus: Self = this.set("InstanceStatus", js.undefined)
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setSystemStatus(value: InstanceStatusSummary): Self = this.set("SystemStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemStatus: Self = this.set("SystemStatus", js.undefined)
  }
  
}

