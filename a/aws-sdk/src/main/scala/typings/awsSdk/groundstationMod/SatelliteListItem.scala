package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SatelliteListItem extends js.Object {
  
  /**
    * A list of ground stations to which the satellite is on-boarded.
    */
  var groundStations: js.UndefOr[GroundStationIdList] = js.native
  
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typings.awsSdk.groundstationMod.noradSatelliteID] = js.native
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.native
  
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.native
}
object SatelliteListItem {
  
  @scala.inline
  def apply(): SatelliteListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SatelliteListItem]
  }
  
  @scala.inline
  implicit class SatelliteListItemOps[Self <: SatelliteListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroundStationsVarargs(value: String*): Self = this.set("groundStations", js.Array(value :_*))
    
    @scala.inline
    def setGroundStations(value: GroundStationIdList): Self = this.set("groundStations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundStations: Self = this.set("groundStations", js.undefined)
    
    @scala.inline
    def setNoradSatelliteID(value: noradSatelliteID): Self = this.set("noradSatelliteID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoradSatelliteID: Self = this.set("noradSatelliteID", js.undefined)
    
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = this.set("satelliteArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSatelliteArn: Self = this.set("satelliteArn", js.undefined)
    
    @scala.inline
    def setSatelliteId(value: Uuid): Self = this.set("satelliteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSatelliteId: Self = this.set("satelliteId", js.undefined)
  }
}
