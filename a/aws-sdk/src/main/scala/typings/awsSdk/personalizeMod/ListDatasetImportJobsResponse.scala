package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetImportJobsResponse extends js.Object {
  
  /**
    * The list of dataset import jobs.
    */
  var datasetImportJobs: js.UndefOr[DatasetImportJobs] = js.native
  
  /**
    * A token for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasetImportJobsVarargs(value: DatasetImportJobSummary*): Self = this.set("datasetImportJobs", js.Array(value :_*))
    
    @scala.inline
    def setDatasetImportJobs(value: DatasetImportJobs): Self = this.set("datasetImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetImportJobs: Self = this.set("datasetImportJobs", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
