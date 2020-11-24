package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportJobsResponse extends js.Object {
  
  /**
    * A list of the import job summaries.
    */
  var ImportJobs: js.UndefOr[ImportJobSummaryList] = js.native
  
  /**
    * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a subsequent call to ListImportJobs with the same parameters to retrieve the next page of import jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object ListImportJobsResponse {
  
  @scala.inline
  def apply(): ListImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsResponse]
  }
  
  @scala.inline
  implicit class ListImportJobsResponseOps[Self <: ListImportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setImportJobsVarargs(value: ImportJobSummary*): Self = this.set("ImportJobs", js.Array(value :_*))
    
    @scala.inline
    def setImportJobs(value: ImportJobSummaryList): Self = this.set("ImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportJobs: Self = this.set("ImportJobs", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
