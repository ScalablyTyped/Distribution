package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSimulationApplicationsResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListSimulationApplications again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of simulation application summaries that meet the criteria of the request.
    */
  var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries] = js.native
}
object ListSimulationApplicationsResponse {
  
  @scala.inline
  def apply(): ListSimulationApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListSimulationApplicationsResponseMutableBuilder[Self <: ListSimulationApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSimulationApplicationSummaries(value: SimulationApplicationSummaries): Self = StObject.set(x, "simulationApplicationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationApplicationSummariesUndefined: Self = StObject.set(x, "simulationApplicationSummaries", js.undefined)
    
    @scala.inline
    def setSimulationApplicationSummariesVarargs(value: SimulationApplicationSummary*): Self = StObject.set(x, "simulationApplicationSummaries", js.Array(value :_*))
  }
}
