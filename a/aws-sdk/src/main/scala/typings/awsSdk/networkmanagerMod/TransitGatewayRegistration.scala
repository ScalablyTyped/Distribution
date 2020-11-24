package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayRegistration extends js.Object {
  
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
  implicit class TransitGatewayRegistrationOps[Self <: TransitGatewayRegistration] (val x: Self) extends AnyVal {
    
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
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayRegistrationStateReason): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTransitGatewayArn(value: String): Self = this.set("TransitGatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayArn: Self = this.set("TransitGatewayArn", js.undefined)
  }
}
