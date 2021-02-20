package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataSourceSyncJobsRequest extends StObject {
  
  /**
    * The identifier of the data source.
    */
  var Id: DataSourceId = js.native
  
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  
  /**
    * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest] = js.native
  
  /**
    * If the result of the previous request to GetDataSourceSyncJobHistory was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
  
  /**
    * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates. 
    */
  var StartTimeFilter: js.UndefOr[TimeRange] = js.native
  
  /**
    * When specified, only returns synchronization jobs with the Status field equal to the specified status.
    */
  var StatusFilter: js.UndefOr[DataSourceSyncJobStatus] = js.native
}
object ListDataSourceSyncJobsRequest {
  
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): ListDataSourceSyncJobsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourceSyncJobsRequest]
  }
  
  @scala.inline
  implicit class ListDataSourceSyncJobsRequestMutableBuilder[Self <: ListDataSourceSyncJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResultsIntegerForListDataSourceSyncJobsRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTimeFilter(value: TimeRange): Self = StObject.set(x, "StartTimeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeFilterUndefined: Self = StObject.set(x, "StartTimeFilter", js.undefined)
    
    @scala.inline
    def setStatusFilter(value: DataSourceSyncJobStatus): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusFilterUndefined: Self = StObject.set(x, "StatusFilter", js.undefined)
  }
}
