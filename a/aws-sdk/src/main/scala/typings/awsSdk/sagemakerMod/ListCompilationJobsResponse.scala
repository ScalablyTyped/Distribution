package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCompilationJobsResponse extends js.Object {
  
  /**
    * An array of CompilationJobSummary objects, each describing a model compilation job. 
    */
  var CompilationJobSummaries: typings.awsSdk.sagemakerMod.CompilationJobSummaries = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListCompilationJobsResponse {
  
  @scala.inline
  def apply(CompilationJobSummaries: CompilationJobSummaries): ListCompilationJobsResponse = {
    val __obj = js.Dynamic.literal(CompilationJobSummaries = CompilationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCompilationJobsResponse]
  }
  
  @scala.inline
  implicit class ListCompilationJobsResponseOps[Self <: ListCompilationJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setCompilationJobSummariesVarargs(value: CompilationJobSummary*): Self = this.set("CompilationJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setCompilationJobSummaries(value: CompilationJobSummaries): Self = this.set("CompilationJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
