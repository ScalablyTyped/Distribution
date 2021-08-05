package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMissionProfilesRequest extends StObject {
  
  /**
    * Maximum number of mission profiles returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Next token returned in the request of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListMissionProfilesRequest {
  
  inline def apply(): ListMissionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMissionProfilesRequest]
  }
  
  extension [Self <: ListMissionProfilesRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
