package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSourceSyncJobsResponse extends StObject {
  
  /**
    * A history of synchronization jobs for the data source.
    */
  var History: js.UndefOr[DataSourceSyncJobHistoryList] = js.undefined
  
  /**
    * The GetDataSourceSyncJobHistory operation returns a page of vocabularies at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Kendra returns the NextPage token. Include the token in the next request to the GetDataSourceSyncJobHistory operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
}
object ListDataSourceSyncJobsResponse {
  
  inline def apply(): ListDataSourceSyncJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourceSyncJobsResponse]
  }
  
  extension [Self <: ListDataSourceSyncJobsResponse](x: Self) {
    
    inline def setHistory(value: DataSourceSyncJobHistoryList): Self = StObject.set(x, "History", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "History", js.undefined)
    
    inline def setHistoryVarargs(value: DataSourceSyncJob*): Self = StObject.set(x, "History", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
