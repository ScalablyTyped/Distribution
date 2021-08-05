package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRegistration extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the transit gateway registration.
    */
  var State: js.UndefOr[TransitGatewayRegistrationStateReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[String] = js.undefined
}
object TransitGatewayRegistration {
  
  inline def apply(): TransitGatewayRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRegistration]
  }
  
  extension [Self <: TransitGatewayRegistration](x: Self) {
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setState(value: TransitGatewayRegistrationStateReason): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayArn(value: String): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArnUndefined: Self = StObject.set(x, "TransitGatewayArn", js.undefined)
  }
}
