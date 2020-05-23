package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGatewayRequest extends js.Object {
  /**
    * A unique, friendly name for the gateway.
    */
  var gatewayName: Name = js.native
  /**
    * The gateway's platform. You can only specify one platform in a gateway.
    */
  var gatewayPlatform: GatewayPlatform = js.native
  /**
    * A list of key-value pairs that contain metadata for the gateway. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateGatewayRequest {
  @scala.inline
  def apply(gatewayName: Name, gatewayPlatform: GatewayPlatform, tags: TagMap = null): CreateGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayName = gatewayName.asInstanceOf[js.Any], gatewayPlatform = gatewayPlatform.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayRequest]
  }
}

