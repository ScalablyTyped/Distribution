package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInfrastructureConfigurationResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that was created by this request. 
    */
  var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateInfrastructureConfigurationResponse {
  
  @scala.inline
  def apply(): CreateInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInfrastructureConfigurationResponse]
  }
  
  @scala.inline
  implicit class CreateInfrastructureConfigurationResponseMutableBuilder[Self <: CreateInfrastructureConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureConfigurationArnUndefined: Self = StObject.set(x, "infrastructureConfigurationArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
