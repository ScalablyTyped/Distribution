package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCandidatesForAutoMLJobRequest extends js.Object {
  
  /**
    * List the Candidates created for the job by providing the job's name.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
  
  /**
    * List the Candidates for the job and filter by candidate name.
    */
  var CandidateNameEquals: js.UndefOr[CandidateName] = js.native
  
  /**
    * List the job's Candidates up to a specified limit.
    */
  var MaxResults: js.UndefOr[AutoMLMaxResults] = js.native
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The parameter by which to sort the results. The default is Descending.
    */
  var SortBy: js.UndefOr[CandidateSortBy] = js.native
  
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[AutoMLSortOrder] = js.native
  
  /**
    * List the Candidates for the job and filter by status.
    */
  var StatusEquals: js.UndefOr[CandidateStatus] = js.native
}
object ListCandidatesForAutoMLJobRequest {
  
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): ListCandidatesForAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobRequest]
  }
  
  @scala.inline
  implicit class ListCandidatesForAutoMLJobRequestOps[Self <: ListCandidatesForAutoMLJobRequest] (val x: Self) extends AnyVal {
    
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
    def setAutoMLJobName(value: AutoMLJobName): Self = this.set("AutoMLJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateNameEquals(value: CandidateName): Self = this.set("CandidateNameEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandidateNameEquals: Self = this.set("CandidateNameEquals", js.undefined)
    
    @scala.inline
    def setMaxResults(value: AutoMLMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: CandidateSortBy): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: AutoMLSortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: CandidateStatus): Self = this.set("StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusEquals: Self = this.set("StatusEquals", js.undefined)
  }
}
