package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlacementsResponse extends StObject {
  
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object listing the requested placements.
    */
  var placements: PlacementSummaryList
}
object ListPlacementsResponse {
  
  inline def apply(placements: PlacementSummaryList): ListPlacementsResponse = {
    val __obj = js.Dynamic.literal(placements = placements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlacementsResponse]
  }
  
  extension [Self <: ListPlacementsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPlacements(value: PlacementSummaryList): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    inline def setPlacementsVarargs(value: PlacementSummary*): Self = StObject.set(x, "placements", js.Array(value :_*))
  }
}
