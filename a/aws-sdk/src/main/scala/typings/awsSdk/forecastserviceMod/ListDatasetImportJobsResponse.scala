package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetImportJobsResponse extends js.Object {
  
  /**
    * An array of objects that summarize each dataset import job's properties.
    */
  var DatasetImportJobs: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetImportJobs] = js.native
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}
object ListDatasetImportJobsResponse {
  
  @scala.inline
  def apply(): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
  
  @scala.inline
  implicit class ListDatasetImportJobsResponseOps[Self <: ListDatasetImportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setDatasetImportJobsVarargs(value: DatasetImportJobSummary*): Self = this.set("DatasetImportJobs", js.Array(value :_*))
    
    @scala.inline
    def setDatasetImportJobs(value: DatasetImportJobs): Self = this.set("DatasetImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetImportJobs: Self = this.set("DatasetImportJobs", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
