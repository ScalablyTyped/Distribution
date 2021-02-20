package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayRoute extends StObject {
  
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The ID of the prefix list used for destination matches.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.native
  
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
  implicit class TransitGatewayRouteMutableBuilder[Self <: TransitGatewayRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayRouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachments(value: TransitGatewayRouteAttachmentList): Self = StObject.set(x, "TransitGatewayAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayAttachments", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentsVarargs(value: TransitGatewayRouteAttachment*): Self = StObject.set(x, "TransitGatewayAttachments", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TransitGatewayRouteType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
