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
  
  @scala.inline
  def apply(): GetExternalModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsRequest]
  }
  
  @scala.inline
  implicit class GetExternalModelsRequestMutableBuilder[Self <: GetExternalModelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ExternalModelsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setModelEndpoint(value: String): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelEndpointUndefined: Self = StObject.set(x, "modelEndpoint", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
