package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLaunchProfileMembersRequest extends StObject {
  
  /**
    * The Launch Profile ID.
    */
  var launchProfileId: String
  
  /**
    * The max number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to request the next page of results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object ListLaunchProfileMembersRequest {
  
  inline def apply(launchProfileId: String, studioId: String): ListLaunchProfileMembersRequest = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLaunchProfileMembersRequest]
  }
  
  extension [Self <: ListLaunchProfileMembersRequest](x: Self) {
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
