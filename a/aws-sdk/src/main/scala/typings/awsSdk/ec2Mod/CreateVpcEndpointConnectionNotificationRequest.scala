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
  var ServiceId: js.UndefOr[typings.awsSdk.ec2Mod.ServiceId] = js.native
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointId] = js.native
}

object CreateVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(
    ConnectionEvents: ValueStringList,
    ConnectionNotificationArn: String,
    ClientToken: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    ServiceId: ServiceId = null,
    VpcEndpointId: VpcEndpointId = null
  ): CreateVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionEvents = ConnectionEvents.asInstanceOf[js.Any], ConnectionNotificationArn = ConnectionNotificationArn.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId.asInstanceOf[js.Any])
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationRequest]
  }
}

