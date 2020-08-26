package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayAttachmentAssociation extends js.Object {
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.native
  /**
    * The ID of the route table for the transit gateway.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}

object TransitGatewayAttachmentAssociation {
  @scala.inline
  def apply(): TransitGatewayAttachmentAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentAssociation]
  }
  @scala.inline
  implicit class TransitGatewayAttachmentAssociationOps[Self <: TransitGatewayAttachmentAssociation] (val x: Self) extends AnyVal {
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
    def setState(value: TransitGatewayAssociationState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayRouteTableId: Self = this.set("TransitGatewayRouteTableId", js.undefined)
  }
  
}

