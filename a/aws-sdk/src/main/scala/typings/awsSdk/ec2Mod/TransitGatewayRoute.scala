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
  def apply(): TransitGatewayRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRoute]
  }
  @scala.inline
  implicit class TransitGatewayRouteOps[Self <: TransitGatewayRoute] (val x: Self) extends AnyVal {
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
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("DestinationCidrBlock", js.undefined)
    @scala.inline
    def setState(value: TransitGatewayRouteState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTransitGatewayAttachmentsVarargs(value: TransitGatewayRouteAttachment*): Self = this.set("TransitGatewayAttachments", js.Array(value :_*))
    @scala.inline
    def setTransitGatewayAttachments(value: TransitGatewayRouteAttachmentList): Self = this.set("TransitGatewayAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayAttachments: Self = this.set("TransitGatewayAttachments", js.undefined)
    @scala.inline
    def setType(value: TransitGatewayRouteType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

