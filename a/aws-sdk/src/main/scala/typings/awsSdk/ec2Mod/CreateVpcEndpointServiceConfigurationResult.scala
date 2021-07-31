package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointServiceConfigurationResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the service configuration.
    */
  var ServiceConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.ServiceConfiguration] = js.undefined
}
object CreateVpcEndpointServiceConfigurationResult {
  
  @scala.inline
  def apply(): CreateVpcEndpointServiceConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointServiceConfigurationResultMutableBuilder[Self <: CreateVpcEndpointServiceConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setServiceConfiguration(value: ServiceConfiguration): Self = StObject.set(x, "ServiceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigurationUndefined: Self = StObject.set(x, "ServiceConfiguration", js.undefined)
  }
}
