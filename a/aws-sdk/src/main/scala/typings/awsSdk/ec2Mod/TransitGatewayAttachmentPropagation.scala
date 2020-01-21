package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayAttachmentPropagation extends js.Object {
  /**
    * The state of the propagation route table.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.native
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}

object TransitGatewayAttachmentPropagation {
  @scala.inline
  def apply(State: TransitGatewayPropagationState = null, TransitGatewayRouteTableId: String = null): TransitGatewayAttachmentPropagation = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayRouteTableId != null) __obj.updateDynamic("TransitGatewayRouteTableId")(TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayAttachmentPropagation]
  }
}

