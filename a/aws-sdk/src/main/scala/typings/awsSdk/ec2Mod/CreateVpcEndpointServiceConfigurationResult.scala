package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcEndpointServiceConfigurationResult extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the service configuration.
    */
  var ServiceConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.ServiceConfiguration] = js.native
}
object CreateVpcEndpointServiceConfigurationResult {
  
  @scala.inline
  def apply(): CreateVpcEndpointServiceConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointServiceConfigurationResultOps[Self <: CreateVpcEndpointServiceConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setServiceConfiguration(value: ServiceConfiguration): Self = this.set("ServiceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfiguration: Self = this.set("ServiceConfiguration", js.undefined)
  }
}
