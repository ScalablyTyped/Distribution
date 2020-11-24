package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListModelsOutput extends js.Object {
  
  /**
    * An array of ModelSummary objects, each of which lists a model.
    */
  var Models: ModelSummaryList = js.native
  
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListModelsOutput {
  
  @scala.inline
  def apply(Models: ModelSummaryList): ListModelsOutput = {
    val __obj = js.Dynamic.literal(Models = Models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsOutput]
  }
  
  @scala.inline
  implicit class ListModelsOutputOps[Self <: ListModelsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelsVarargs(value: ModelSummary*): Self = this.set("Models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: ModelSummaryList): Self = this.set("Models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
