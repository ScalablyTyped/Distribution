package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExternalModelsRequest extends StObject {
  
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[ExternalModelsMaxResults] = js.undefined
  
  /**
    * The Amazon SageMaker model endpoint.
    */
  var modelEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The next page token for the request.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetExternalModelsRequest {
  
  inline def apply(): GetExternalModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsRequest]
  }
  
  extension [Self <: GetExternalModelsRequest](x: Self) {
    
    inline def setMaxResults(value: ExternalModelsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setModelEndpoint(value: String): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
    
    inline def setModelEndpointUndefined: Self = StObject.set(x, "modelEndpoint", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
