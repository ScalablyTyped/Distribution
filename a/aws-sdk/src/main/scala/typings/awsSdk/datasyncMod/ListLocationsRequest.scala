package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationsRequest extends StObject {
  
  /**
    * You can use API filters to narrow down the list of resources returned by ListLocations. For example, to retrieve all tasks on a specific source location, you can use ListLocations with filter name LocationType S3 and Operator Equals.
    */
  var Filters: js.UndefOr[LocationFilters] = js.undefined
  
  /**
    * The maximum number of locations to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.datasyncMod.MaxResults] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin the next list of locations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.undefined
}
object ListLocationsRequest {
  
  inline def apply(): ListLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationsRequest]
  }
  
  extension [Self <: ListLocationsRequest](x: Self) {
    
    inline def setFilters(value: LocationFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: LocationFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
