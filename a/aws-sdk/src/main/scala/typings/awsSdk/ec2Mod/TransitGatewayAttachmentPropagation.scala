package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): TransitGatewayAttachmentPropagation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentPropagation]
  }
  
  @scala.inline
  implicit class TransitGatewayAttachmentPropagationOps[Self <: TransitGatewayAttachmentPropagation] (val x: Self) extends AnyVal {
    
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
    def setState(value: TransitGatewayPropagationState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayRouteTableId: Self = this.set("TransitGatewayRouteTableId", js.undefined)
  }
}
