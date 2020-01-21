package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRoute extends js.Object {
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The state of the route.
    */
  var State: js.UndefOr[TransitGatewayRouteState] = js.native
  /**
    * The attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayRouteAttachmentList] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[TransitGatewayRouteType] = js.native
}

object TransitGatewayRoute {
  @scala.inline
  def apply(
    DestinationCidrBlock: String = null,
    State: TransitGatewayRouteState = null,
    TransitGatewayAttachments: TransitGatewayRouteAttachmentList = null,
    Type: TransitGatewayRouteType = null
  ): TransitGatewayRoute = {
    val __obj = js.Dynamic.literal()
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayAttachments != null) __obj.updateDynamic("TransitGatewayAttachments")(TransitGatewayAttachments.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayRoute]
  }
}

