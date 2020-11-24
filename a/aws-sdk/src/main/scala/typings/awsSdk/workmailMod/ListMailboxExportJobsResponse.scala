package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMailboxExportJobsResponse extends js.Object {
  
  /**
    * The mailbox export job details.
    */
  var Jobs: js.UndefOr[typings.awsSdk.workmailMod.Jobs] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
}
object ListMailboxExportJobsResponse {
  
  @scala.inline
  def apply(): ListMailboxExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMailboxExportJobsResponse]
  }
  
  @scala.inline
  implicit class ListMailboxExportJobsResponseOps[Self <: ListMailboxExportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: MailboxExportJob*): Self = this.set("Jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: Jobs): Self = this.set("Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("Jobs", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
