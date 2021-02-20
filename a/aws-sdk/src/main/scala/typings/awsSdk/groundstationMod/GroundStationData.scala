package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundStationData extends StObject {
  
  /**
    * UUID of a ground station.
    */
  var groundStationId: js.UndefOr[String] = js.native
  
  /**
    * Name of a ground station.
    */
  var groundStationName: js.UndefOr[String] = js.native
  
  /**
    * Ground station Region.
    */
  var region: js.UndefOr[String] = js.native
}
object GroundStationData {
  
  @scala.inline
  def apply(): GroundStationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundStationData]
  }
  
  @scala.inline
  implicit class GroundStationDataMutableBuilder[Self <: GroundStationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroundStationId(value: String): Self = StObject.set(x, "groundStationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStationIdUndefined: Self = StObject.set(x, "groundStationId", js.undefined)
    
    @scala.inline
    def setGroundStationName(value: String): Self = StObject.set(x, "groundStationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStationNameUndefined: Self = StObject.set(x, "groundStationName", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
