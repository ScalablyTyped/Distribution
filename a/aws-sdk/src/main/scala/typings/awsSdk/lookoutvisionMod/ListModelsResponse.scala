package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelsResponse extends StObject {
  
  /**
    * A list of model versions in the specified project. 
    */
  var Models: js.UndefOr[ModelMetadataList] = js.undefined
  
  /**
    * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent request to retrieve the next set of models. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListModelsResponse {
  
  inline def apply(): ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResponse]
  }
  
  extension [Self <: ListModelsResponse](x: Self) {
    
    inline def setModels(value: ModelMetadataList): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    inline def setModelsVarargs(value: ModelMetadata*): Self = StObject.set(x, "Models", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
