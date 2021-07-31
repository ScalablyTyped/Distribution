package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNatGatewayResult extends StObject {
  
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.undefined
}
object DeleteNatGatewayResult {
  
  @scala.inline
  def apply(): DeleteNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNatGatewayResult]
  }
  
  @scala.inline
  implicit class DeleteNatGatewayResultMutableBuilder[Self <: DeleteNatGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNatGatewayId(value: String): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
  }
}
