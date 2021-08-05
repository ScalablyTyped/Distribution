package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerGatewayResult extends StObject {
  
  /**
    * Information about the customer gateway.
    */
  var CustomerGateway: js.UndefOr[typings.awsSdk.ec2Mod.CustomerGateway] = js.undefined
}
object CreateCustomerGatewayResult {
  
  inline def apply(): CreateCustomerGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomerGatewayResult]
  }
  
  extension [Self <: CreateCustomerGatewayResult](x: Self) {
    
    inline def setCustomerGateway(value: CustomerGateway): Self = StObject.set(x, "CustomerGateway", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayUndefined: Self = StObject.set(x, "CustomerGateway", js.undefined)
  }
}
