package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInfrastructureConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that was deleted. 
    */
  var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object DeleteInfrastructureConfigurationResponse {
  
  @scala.inline
  def apply(): DeleteInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInfrastructureConfigurationResponse]
  }
  
  @scala.inline
  implicit class DeleteInfrastructureConfigurationResponseMutableBuilder[Self <: DeleteInfrastructureConfigurationResponse] (val x: Self) extends AnyVal {
    
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
