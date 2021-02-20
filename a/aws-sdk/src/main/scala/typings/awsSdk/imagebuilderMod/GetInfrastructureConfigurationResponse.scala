package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfrastructureConfigurationResponse extends StObject {
  
  /**
    * The infrastructure configuration object. 
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object GetInfrastructureConfigurationResponse {
  
  @scala.inline
  def apply(): GetInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfrastructureConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetInfrastructureConfigurationResponseMutableBuilder[Self <: GetInfrastructureConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfrastructureConfiguration(value: InfrastructureConfiguration): Self = StObject.set(x, "infrastructureConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureConfigurationUndefined: Self = StObject.set(x, "infrastructureConfiguration", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
