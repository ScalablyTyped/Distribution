package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomerGatewayResult extends js.Object {
  
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
  implicit class CreateCustomerGatewayResultOps[Self <: CreateCustomerGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomerGateway(value: CustomerGateway): Self = this.set("CustomerGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerGateway: Self = this.set("CustomerGateway", js.undefined)
  }
}
