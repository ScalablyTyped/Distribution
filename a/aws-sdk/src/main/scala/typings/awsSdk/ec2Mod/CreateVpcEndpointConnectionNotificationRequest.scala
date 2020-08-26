package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointConnectionNotificationRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * One or more endpoint events for which to receive notifications. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: ValueStringList = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  var ConnectionNotificationArn: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[VpcEndpointServiceId] = js.native
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointId] = js.native
}

object CreateVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(ConnectionEvents: ValueStringList, ConnectionNotificationArn: String): CreateVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionEvents = ConnectionEvents.asInstanceOf[js.Any], ConnectionNotificationArn = ConnectionNotificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationRequest]
  }
  @scala.inline
  implicit class CreateVpcEndpointConnectionNotificationRequestOps[Self <: CreateVpcEndpointConnectionNotificationRequest] (val x: Self) extends AnyVal {
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
    def setConnectionEventsVarargs(value: String*): Self = this.set("ConnectionEvents", js.Array(value :_*))
    @scala.inline
    def setConnectionEvents(value: ValueStringList): Self = this.set("ConnectionEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionNotificationArn(value: String): Self = this.set("ConnectionNotificationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setServiceId(value: VpcEndpointServiceId): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("ServiceId", js.undefined)
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
  }
  
}

