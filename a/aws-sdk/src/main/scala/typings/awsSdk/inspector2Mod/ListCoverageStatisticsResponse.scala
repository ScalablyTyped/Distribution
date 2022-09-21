package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoverageStatisticsResponse extends StObject {
  
  /**
    * An array with the number for each group.
    */
  var countsByGroup: js.UndefOr[CountsList] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The total number for all groups.
    */
  var totalCounts: Long
}
object ListCoverageStatisticsResponse {
  
  inline def apply(totalCounts: Long): ListCoverageStatisticsResponse = {
    val __obj = js.Dynamic.literal(totalCounts = totalCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCoverageStatisticsResponse]
  }
  
  extension [Self <: ListCoverageStatisticsResponse](x: Self) {
    
    inline def setCountsByGroup(value: CountsList): Self = StObject.set(x, "countsByGroup", value.asInstanceOf[js.Any])
    
    inline def setCountsByGroupUndefined: Self = StObject.set(x, "countsByGroup", js.undefined)
    
    inline def setCountsByGroupVarargs(value: Counts*): Self = StObject.set(x, "countsByGroup", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTotalCounts(value: Long): Self = StObject.set(x, "totalCounts", value.asInstanceOf[js.Any])
  }
}
