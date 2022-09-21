package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEngagementsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident you're listing engagements for.
    */
  var IncidentId: js.UndefOr[typings.awsSdk.ssmcontactsMod.IncidentId] = js.undefined
  
  /**
    * The maximum number of engagements per page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmcontactsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The time range to lists engagements for an incident.
    */
  var TimeRangeValue: js.UndefOr[TimeRange] = js.undefined
}
object ListEngagementsRequest {
  
  inline def apply(): ListEngagementsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEngagementsRequest]
  }
  
  extension [Self <: ListEngagementsRequest](x: Self) {
    
    inline def setIncidentId(value: IncidentId): Self = StObject.set(x, "IncidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "IncidentId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTimeRangeValue(value: TimeRange): Self = StObject.set(x, "TimeRangeValue", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeValueUndefined: Self = StObject.set(x, "TimeRangeValue", js.undefined)
  }
}
