package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SatelliteListItem extends StObject {
  
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
object SatelliteListItem {
  
  inline def apply(): SatelliteListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SatelliteListItem]
  }
  
  extension [Self <: SatelliteListItem](x: Self) {
    
    inline def setGroundStations(value: GroundStationIdList): Self = StObject.set(x, "groundStations", value.asInstanceOf[js.Any])
    
    inline def setGroundStationsUndefined: Self = StObject.set(x, "groundStations", js.undefined)
    
    inline def setGroundStationsVarargs(value: String*): Self = StObject.set(x, "groundStations", js.Array(value :_*))
    
    inline def setNoradSatelliteID(value: noradSatelliteID): Self = StObject.set(x, "noradSatelliteID", value.asInstanceOf[js.Any])
    
    inline def setNoradSatelliteIDUndefined: Self = StObject.set(x, "noradSatelliteID", js.undefined)
    
    inline def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    inline def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
  }
}
