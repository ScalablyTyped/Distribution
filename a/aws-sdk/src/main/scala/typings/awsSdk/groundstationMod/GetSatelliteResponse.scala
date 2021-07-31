package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSatelliteResponse extends StObject {
  
  /**
    * A list of ground stations to which the satellite is on-boarded.
    */
  var groundStations: js.UndefOr[GroundStationIdList] = js.undefined
  
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typings.awsSdk.groundstationMod.noradSatelliteID] = js.undefined
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.undefined
  
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
}
object GetSatelliteResponse {
  
  @scala.inline
  def apply(): GetSatelliteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSatelliteResponse]
  }
  
  @scala.inline
  implicit class GetSatelliteResponseMutableBuilder[Self <: GetSatelliteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroundStations(value: GroundStationIdList): Self = StObject.set(x, "groundStations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStationsUndefined: Self = StObject.set(x, "groundStations", js.undefined)
    
    @scala.inline
    def setGroundStationsVarargs(value: String*): Self = StObject.set(x, "groundStations", js.Array(value :_*))
    
    @scala.inline
    def setNoradSatelliteID(value: noradSatelliteID): Self = StObject.set(x, "noradSatelliteID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoradSatelliteIDUndefined: Self = StObject.set(x, "noradSatelliteID", js.undefined)
    
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    @scala.inline
    def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
  }
}
