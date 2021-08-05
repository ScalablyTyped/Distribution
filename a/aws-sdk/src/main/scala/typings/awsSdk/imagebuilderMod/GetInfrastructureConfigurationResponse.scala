package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInfrastructureConfigurationResponse extends StObject {
  
  /**
    * The infrastructure configuration object. 
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetInfrastructureConfigurationResponse {
  
  inline def apply(): GetInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfrastructureConfigurationResponse]
  }
  
  extension [Self <: GetInfrastructureConfigurationResponse](x: Self) {
    
    inline def setInfrastructureConfiguration(value: InfrastructureConfiguration): Self = StObject.set(x, "infrastructureConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureConfigurationUndefined: Self = StObject.set(x, "infrastructureConfiguration", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
