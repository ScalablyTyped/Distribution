package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLabelingJobsResponse extends js.Object {
  
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobSummaryList] = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListLabelingJobsResponse {
  
  @scala.inline
  def apply(): ListLabelingJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelingJobsResponse]
  }
  
  @scala.inline
  implicit class ListLabelingJobsResponseOps[Self <: ListLabelingJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setLabelingJobSummaryListVarargs(value: LabelingJobSummary*): Self = this.set("LabelingJobSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setLabelingJobSummaryList(value: LabelingJobSummaryList): Self = this.set("LabelingJobSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelingJobSummaryList: Self = this.set("LabelingJobSummaryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
