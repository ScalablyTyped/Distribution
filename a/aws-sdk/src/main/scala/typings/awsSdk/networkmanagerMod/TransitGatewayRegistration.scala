package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayRegistration extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  
  /**
    * The state of the transit gateway registration.
    */
  var State: js.UndefOr[TransitGatewayRegistrationStateReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[String] = js.native
}
object TransitGatewayRegistration {
  
  @scala.inline
  def apply(): TransitGatewayRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRegistration]
  }
  
  @scala.inline
  implicit class TransitGatewayRegistrationMutableBuilder[Self <: TransitGatewayRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayRegistrationStateReason): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTransitGatewayArn(value: String): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayArnUndefined: Self = StObject.set(x, "TransitGatewayArn", js.undefined)
  }
}
