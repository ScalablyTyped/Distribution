package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNatGatewayResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the NAT gateway.
    */
  var NatGateway: js.UndefOr[typings.awsSdk.ec2Mod.NatGateway] = js.undefined
}
object CreateNatGatewayResult {
  
  @scala.inline
  def apply(): CreateNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNatGatewayResult]
  }
  
  @scala.inline
  implicit class CreateNatGatewayResultMutableBuilder[Self <: CreateNatGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setNatGateway(value: NatGateway): Self = StObject.set(x, "NatGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayUndefined: Self = StObject.set(x, "NatGateway", js.undefined)
  }
}
