package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointConnectionNotificationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the notification.
    */
  var ConnectionNotification: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotification] = js.native
}

object CreateVpcEndpointConnectionNotificationResult {
  @scala.inline
  def apply(ClientToken: String = null, ConnectionNotification: ConnectionNotification = null): CreateVpcEndpointConnectionNotificationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (ConnectionNotification != null) __obj.updateDynamic("ConnectionNotification")(ConnectionNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationResult]
  }
}

