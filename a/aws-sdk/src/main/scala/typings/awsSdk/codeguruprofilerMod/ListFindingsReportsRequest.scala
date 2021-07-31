package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsReportsRequest extends StObject {
  
  /**
    * A Boolean value indicating whether to only return reports from daily profiles. If set to True, only analysis data from daily profiles is returned. If set to False, analysis data is returned from smaller time windows (for example, one hour).
    */
  var dailyReportsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The end time of the profile to get analysis data about. You must specify startTime and endTime. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: Timestamp
  
  /**
    * The maximum number of report results returned by ListFindingsReports in paginated output. When this parameter is used, ListFindingsReports only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListFindingsReports request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListFindingsReportsRequest request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the profiling group from which to search for analysis data.
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    *  The start time of the profile to get analysis data about. You must specify startTime and endTime. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: Timestamp
}
object ListFindingsReportsRequest {
  
  @scala.inline
  def apply(endTime: Timestamp, profilingGroupName: ProfilingGroupName, startTime: Timestamp): ListFindingsReportsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsReportsRequest]
  }
  
  @scala.inline
  implicit class ListFindingsReportsRequestMutableBuilder[Self <: ListFindingsReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyReportsOnly(value: Boolean): Self = StObject.set(x, "dailyReportsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyReportsOnlyUndefined: Self = StObject.set(x, "dailyReportsOnly", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
