package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomerGatewayResult extends StObject {
  
  /**
    * Information about the customer gateway.
    */
  var CustomerGateway: js.UndefOr[typings.awsSdk.ec2Mod.CustomerGateway] = js.native
}
object CreateCustomerGatewayResult {
  
  @scala.inline
  def apply(): CreateCustomerGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomerGatewayResult]
  }
  
  @scala.inline
  implicit class CreateCustomerGatewayResultMutableBuilder[Self <: CreateCustomerGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGateway(value: CustomerGateway): Self = StObject.set(x, "CustomerGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayUndefined: Self = StObject.set(x, "CustomerGateway", js.undefined)
  }
}
