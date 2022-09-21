package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayAttachmentBgpConfiguration extends StObject {
  
  /**
    * The BGP status.
    */
  var BgpStatus: js.UndefOr[typings.awsSdk.ec2Mod.BgpStatus] = js.undefined
  
  /**
    * The interior BGP peer IP address for the appliance.
    */
  var PeerAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The peer Autonomous System Number (ASN).
    */
  var PeerAsn: js.UndefOr[Long] = js.undefined
  
  /**
    * The interior BGP peer IP address for the transit gateway.
    */
  var TransitGatewayAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The transit gateway Autonomous System Number (ASN).
    */
  var TransitGatewayAsn: js.UndefOr[Long] = js.undefined
}
object TransitGatewayAttachmentBgpConfiguration {
  
  inline def apply(): TransitGatewayAttachmentBgpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentBgpConfiguration]
  }
  
  extension [Self <: TransitGatewayAttachmentBgpConfiguration](x: Self) {
    
    inline def setBgpStatus(value: BgpStatus): Self = StObject.set(x, "BgpStatus", value.asInstanceOf[js.Any])
    
    inline def setBgpStatusUndefined: Self = StObject.set(x, "BgpStatus", js.undefined)
    
    inline def setPeerAddress(value: String): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerAddressUndefined: Self = StObject.set(x, "PeerAddress", js.undefined)
    
    inline def setPeerAsn(value: Long): Self = StObject.set(x, "PeerAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerAsnUndefined: Self = StObject.set(x, "PeerAsn", js.undefined)
    
    inline def setTransitGatewayAddress(value: String): Self = StObject.set(x, "TransitGatewayAddress", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAddressUndefined: Self = StObject.set(x, "TransitGatewayAddress", js.undefined)
    
    inline def setTransitGatewayAsn(value: Long): Self = StObject.set(x, "TransitGatewayAsn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAsnUndefined: Self = StObject.set(x, "TransitGatewayAsn", js.undefined)
  }
}
