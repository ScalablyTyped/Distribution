package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayAttachmentPropagation extends StObject {
  
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
  implicit class TransitGatewayAttachmentPropagationMutableBuilder[Self <: TransitGatewayAttachmentPropagation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: TransitGatewayPropagationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
