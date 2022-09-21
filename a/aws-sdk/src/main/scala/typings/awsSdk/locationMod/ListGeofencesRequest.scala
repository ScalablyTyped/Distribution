package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeofencesRequest extends StObject {
  
  /**
    * The name of the geofence collection storing the list of geofences.
    */
  var CollectionName: ResourceName
  
  /**
    * An optional limit for the number of geofences returned in a single call.  Default value: 100 
    */
  var MaxResults: js.UndefOr[ListGeofencesRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page.  Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListGeofencesRequest {
  
  inline def apply(CollectionName: ResourceName): ListGeofencesRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeofencesRequest]
  }
  
  extension [Self <: ListGeofencesRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListGeofencesRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
