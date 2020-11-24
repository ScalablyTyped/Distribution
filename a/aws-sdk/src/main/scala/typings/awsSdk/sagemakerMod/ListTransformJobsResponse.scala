package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTransformJobsResponse extends js.Object {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of TransformJobSummary objects.
    */
  var TransformJobSummaries: typings.awsSdk.sagemakerMod.TransformJobSummaries = js.native
}
object ListTransformJobsResponse {
  
  @scala.inline
  def apply(TransformJobSummaries: TransformJobSummaries): ListTransformJobsResponse = {
    val __obj = js.Dynamic.literal(TransformJobSummaries = TransformJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTransformJobsResponse]
  }
  
  @scala.inline
  implicit class ListTransformJobsResponseOps[Self <: ListTransformJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setTransformJobSummariesVarargs(value: TransformJobSummary*): Self = this.set("TransformJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTransformJobSummaries(value: TransformJobSummaries): Self = this.set("TransformJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
