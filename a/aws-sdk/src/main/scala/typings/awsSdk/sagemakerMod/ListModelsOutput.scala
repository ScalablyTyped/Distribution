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
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListModelsOutput {
  
  @scala.inline
  def apply(Models: ModelSummaryList): ListModelsOutput = {
    val __obj = js.Dynamic.literal(Models = Models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsOutput]
  }
  
  @scala.inline
  implicit class ListModelsOutputMutableBuilder[Self <: ListModelsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: ModelSummaryList): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsVarargs(value: ModelSummary*): Self = StObject.set(x, "Models", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
