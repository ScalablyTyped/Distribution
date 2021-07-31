package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEgressOnlyInternetGatewayResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the egress-only internet gateway.
    */
  var EgressOnlyInternetGateway: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGateway] = js.undefined
}
object CreateEgressOnlyInternetGatewayResult {
  
  @scala.inline
  def apply(): CreateEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEgressOnlyInternetGatewayResult]
  }
  
  @scala.inline
  implicit class CreateEgressOnlyInternetGatewayResultMutableBuilder[Self <: CreateEgressOnlyInternetGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setEgressOnlyInternetGateway(value: EgressOnlyInternetGateway): Self = StObject.set(x, "EgressOnlyInternetGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyInternetGatewayUndefined: Self = StObject.set(x, "EgressOnlyInternetGateway", js.undefined)
  }
}
