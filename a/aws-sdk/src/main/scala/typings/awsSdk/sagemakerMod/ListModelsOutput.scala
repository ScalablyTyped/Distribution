package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelsOutput extends StObject {
  
  /**
    * An array of ModelSummary objects, each of which lists a model.
    */
  var Models: ModelSummaryList
  
  /**
    *  If the response is truncated, SageMaker returns this token. To retrieve the next set of models, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListModelsOutput {
  
  inline def apply(Models: ModelSummaryList): ListModelsOutput = {
    val __obj = js.Dynamic.literal(Models = Models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsOutput]
  }
  
  extension [Self <: ListModelsOutput](x: Self) {
    
    inline def setModels(value: ModelSummaryList): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsVarargs(value: ModelSummary*): Self = StObject.set(x, "Models", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
