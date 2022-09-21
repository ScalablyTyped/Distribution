package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayConnectPeerConfiguration extends StObject {
  
  /**
    * The BGP configuration details.
    */
  var BgpConfigurations: js.UndefOr[TransitGatewayAttachmentBgpConfigurationList] = js.undefined
  
  /**
    * The range of interior BGP peer IP addresses.
    */
  var InsideCidrBlocks: js.UndefOr[InsideCidrBlocksStringList] = js.undefined
  
  /**
    * The Connect peer IP address on the appliance side of the tunnel.
    */
  var PeerAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The tunnel protocol.
    */
  var Protocol: js.UndefOr[ProtocolValue] = js.undefined
  
  /**
    * The Connect peer IP address on the transit gateway side of the tunnel.
    */
  var TransitGatewayAddress: js.UndefOr[String] = js.undefined
}
object TransitGatewayConnectPeerConfiguration {
  
  inline def apply(): TransitGatewayConnectPeerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayConnectPeerConfiguration]
  }
  
  extension [Self <: TransitGatewayConnectPeerConfiguration](x: Self) {
    
    inline def setBgpConfigurations(value: TransitGatewayAttachmentBgpConfigurationList): Self = StObject.set(x, "BgpConfigurations", value.asInstanceOf[js.Any])
    
    inline def setBgpConfigurationsUndefined: Self = StObject.set(x, "BgpConfigurations", js.undefined)
    
    inline def setBgpConfigurationsVarargs(value: TransitGatewayAttachmentBgpConfiguration*): Self = StObject.set(x, "BgpConfigurations", js.Array(value*))
    
    inline def setInsideCidrBlocks(value: InsideCidrBlocksStringList): Self = StObject.set(x, "InsideCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setInsideCidrBlocksUndefined: Self = StObject.set(x, "InsideCidrBlocks", js.undefined)
    
    inline def setInsideCidrBlocksVarargs(value: String*): Self = StObject.set(x, "InsideCidrBlocks", js.Array(value*))
    
    inline def setPeerAddress(value: String): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerAddressUndefined: Self = StObject.set(x, "PeerAddress", js.undefined)
    
    inline def setProtocol(value: ProtocolValue): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setTransitGatewayAddress(value: String): Self = StObject.set(x, "TransitGatewayAddress", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAddressUndefined: Self = StObject.set(x, "TransitGatewayAddress", js.undefined)
  }
}
