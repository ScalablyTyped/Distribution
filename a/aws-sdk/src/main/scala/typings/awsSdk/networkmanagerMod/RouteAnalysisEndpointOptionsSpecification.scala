package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteAnalysisEndpointOptionsSpecification extends StObject {
  
  /**
    * The IP address.
    */
  var IpAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The ARN of the transit gateway attachment.
    */
  var TransitGatewayAttachmentArn: js.UndefOr[typings.awsSdk.networkmanagerMod.TransitGatewayAttachmentArn] = js.undefined
}
object RouteAnalysisEndpointOptionsSpecification {
  
  inline def apply(): RouteAnalysisEndpointOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteAnalysisEndpointOptionsSpecification]
  }
  
  extension [Self <: RouteAnalysisEndpointOptionsSpecification](x: Self) {
    
    inline def setIpAddress(value: IPAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setTransitGatewayAttachmentArn(value: TransitGatewayAttachmentArn): Self = StObject.set(x, "TransitGatewayAttachmentArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentArnUndefined: Self = StObject.set(x, "TransitGatewayAttachmentArn", js.undefined)
  }
}
