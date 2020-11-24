package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportJobsRequest extends js.Object {
  
  /**
    * The destination of the import job, which can be used to list import jobs that have a certain ImportDestinationType.
    */
  var ImportDestinationType: js.UndefOr[typings.awsSdk.sesv2Mod.ImportDestinationType] = js.native
  
  /**
    * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a subsequent call to ListImportJobs with the same parameters to retrieve the next page of import jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  
  /**
    * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import jobs exist beyond the specified limit, the NextToken element is sent in the response. Use the NextToken value in subsequent requests to retrieve additional addresses.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}
object ListImportJobsRequest {
  
  @scala.inline
  def apply(): ListImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsRequest]
  }
  
  @scala.inline
  implicit class ListImportJobsRequestOps[Self <: ListImportJobsRequest] (val x: Self) extends AnyVal {
    
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
    def setImportDestinationType(value: ImportDestinationType): Self = this.set("ImportDestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDestinationType: Self = this.set("ImportDestinationType", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: MaxItems): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
}
