package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroundStationsRequest extends StObject {
  
  /**
    * Maximum number of ground stations returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Satellite ID to retrieve on-boarded ground stations.
    */
  var satelliteId: js.UndefOr[String] = js.undefined
}
object ListGroundStationsRequest {
  
  inline def apply(): ListGroundStationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsRequest]
  }
  
  extension [Self <: ListGroundStationsRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSatelliteId(value: String): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
  }
}
