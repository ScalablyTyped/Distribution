package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingSessionsRequest extends StObject {
  
  /**
    * Filters the request to streaming sessions created by the given user.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    * The token to request the next page of results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Filters the request to streaming session owned by the given user
    */
  var ownedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Filters the request to only the provided session IDs.
    */
  var sessionIds: js.UndefOr[String] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object ListStreamingSessionsRequest {
  
  inline def apply(studioId: String): ListStreamingSessionsRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamingSessionsRequest]
  }
  
  extension [Self <: ListStreamingSessionsRequest](x: Self) {
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOwnedBy(value: String): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setSessionIds(value: String): Self = StObject.set(x, "sessionIds", value.asInstanceOf[js.Any])
    
    inline def setSessionIdsUndefined: Self = StObject.set(x, "sessionIds", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
