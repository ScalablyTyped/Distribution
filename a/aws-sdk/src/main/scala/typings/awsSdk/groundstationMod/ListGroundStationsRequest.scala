package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroundStationsRequest extends StObject {
  
  /**
    * Maximum number of ground stations returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Satellite ID to retrieve on-boarded ground stations.
    */
  var satelliteId: js.UndefOr[String] = js.native
}
object ListGroundStationsRequest {
  
  @scala.inline
  def apply(): ListGroundStationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsRequest]
  }
  
  @scala.inline
  implicit class ListGroundStationsRequestMutableBuilder[Self <: ListGroundStationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSatelliteId(value: String): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
  }
}
