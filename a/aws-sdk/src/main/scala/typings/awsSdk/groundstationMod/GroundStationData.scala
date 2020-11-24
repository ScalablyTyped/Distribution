package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundStationData extends js.Object {
  
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
  implicit class GroundStationDataOps[Self <: GroundStationData] (val x: Self) extends AnyVal {
    
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
    def setGroundStationId(value: String): Self = this.set("groundStationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundStationId: Self = this.set("groundStationId", js.undefined)
    
    @scala.inline
    def setGroundStationName(value: String): Self = this.set("groundStationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundStationName: Self = this.set("groundStationName", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
