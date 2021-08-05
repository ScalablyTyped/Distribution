package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationsResponse extends StObject {
  
  /**
    * An array that contains a list of locations.
    */
  var Locations: js.UndefOr[LocationList] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of locations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.undefined
}
object ListLocationsResponse {
  
  inline def apply(): ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationsResponse]
  }
  
  extension [Self <: ListLocationsResponse](x: Self) {
    
    inline def setLocations(value: LocationList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    inline def setLocationsVarargs(value: LocationListEntry*): Self = StObject.set(x, "Locations", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
