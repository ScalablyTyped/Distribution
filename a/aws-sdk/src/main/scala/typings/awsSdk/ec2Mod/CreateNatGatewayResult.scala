package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNatGatewayResult extends js.Object {
  
  /**
    * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the NAT gateway.
    */
  var NatGateway: js.UndefOr[typings.awsSdk.ec2Mod.NatGateway] = js.native
}
object CreateNatGatewayResult {
  
  @scala.inline
  def apply(): CreateNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNatGatewayResult]
  }
  
  @scala.inline
  implicit class CreateNatGatewayResultOps[Self <: CreateNatGatewayResult] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setNatGateway(value: NatGateway): Self = this.set("NatGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatGateway: Self = this.set("NatGateway", js.undefined)
  }
}
