package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRoutingProfilesResponse extends StObject {
  
  /**
    * The total number of routing profiles which matched your search query.
    */
  var ApproximateTotalCount: js.UndefOr[typings.awsSdk.connectMod.ApproximateTotalCount] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  /**
    * Information about the routing profiles.
    */
  var RoutingProfiles: js.UndefOr[RoutingProfileList] = js.undefined
}
object SearchRoutingProfilesResponse {
  
  inline def apply(): SearchRoutingProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRoutingProfilesResponse]
  }
  
  extension [Self <: SearchRoutingProfilesResponse](x: Self) {
    
    inline def setApproximateTotalCount(value: ApproximateTotalCount): Self = StObject.set(x, "ApproximateTotalCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateTotalCountUndefined: Self = StObject.set(x, "ApproximateTotalCount", js.undefined)
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoutingProfiles(value: RoutingProfileList): Self = StObject.set(x, "RoutingProfiles", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfilesUndefined: Self = StObject.set(x, "RoutingProfiles", js.undefined)
    
    inline def setRoutingProfilesVarargs(value: RoutingProfile*): Self = StObject.set(x, "RoutingProfiles", js.Array(value*))
  }
}
