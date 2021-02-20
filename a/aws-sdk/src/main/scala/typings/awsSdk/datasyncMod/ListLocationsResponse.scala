package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLocationsResponse extends StObject {
  
  /**
    * An array that contains a list of locations.
    */
  var Locations: js.UndefOr[LocationList] = js.native
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of locations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
}
object ListLocationsResponse {
  
  @scala.inline
  def apply(): ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationsResponse]
  }
  
  @scala.inline
  implicit class ListLocationsResponseMutableBuilder[Self <: ListLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: LocationList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: LocationListEntry*): Self = StObject.set(x, "Locations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
