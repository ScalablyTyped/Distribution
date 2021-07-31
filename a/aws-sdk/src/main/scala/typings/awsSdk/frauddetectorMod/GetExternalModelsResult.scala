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
  
  @scala.inline
  def apply(): GetExternalModelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsResult]
  }
  
  @scala.inline
  implicit class GetExternalModelsResultMutableBuilder[Self <: GetExternalModelsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalModels(value: ExternalModelList): Self = StObject.set(x, "externalModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelsUndefined: Self = StObject.set(x, "externalModels", js.undefined)
    
    @scala.inline
    def setExternalModelsVarargs(value: ExternalModel*): Self = StObject.set(x, "externalModels", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
