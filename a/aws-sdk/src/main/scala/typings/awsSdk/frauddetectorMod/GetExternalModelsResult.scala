package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExternalModelsResult extends StObject {
  
  /**
    * Gets the Amazon SageMaker models.
    */
  var externalModels: js.UndefOr[ExternalModelList] = js.undefined
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetExternalModelsResult {
  
  inline def apply(): GetExternalModelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsResult]
  }
  
  extension [Self <: GetExternalModelsResult](x: Self) {
    
    inline def setExternalModels(value: ExternalModelList): Self = StObject.set(x, "externalModels", value.asInstanceOf[js.Any])
    
    inline def setExternalModelsUndefined: Self = StObject.set(x, "externalModels", js.undefined)
    
    inline def setExternalModelsVarargs(value: ExternalModel*): Self = StObject.set(x, "externalModels", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
