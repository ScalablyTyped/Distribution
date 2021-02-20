package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsRequest extends StObject {
  
  /**
    * 
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The List Jobs request returns jobs that match the statuses listed in this element.
    */
  var JobStatuses: js.UndefOr[JobStatusList] = js.native
  
  /**
    * The maximum number of jobs that Amazon S3 will include in the List Jobs response. If there are more jobs than this number, the response will include a pagination token in the NextToken field to enable you to retrieve the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.s3controlMod.MaxResults] = js.native
  
  /**
    * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the NextToken element of the ListJobsResult from the previous List Jobs request.
    */
  var NextToken: js.UndefOr[StringForNextToken] = js.native
}
object ListJobsRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): ListJobsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
  
  @scala.inline
  implicit class ListJobsRequestMutableBuilder[Self <: ListJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatuses(value: JobStatusList): Self = StObject.set(x, "JobStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusesUndefined: Self = StObject.set(x, "JobStatuses", js.undefined)
    
    @scala.inline
    def setJobStatusesVarargs(value: JobStatus*): Self = StObject.set(x, "JobStatuses", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: StringForNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
