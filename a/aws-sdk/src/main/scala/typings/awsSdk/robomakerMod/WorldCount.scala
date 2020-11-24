package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldCount extends js.Object {
  
  /**
    * The number of unique floorplans.
    */
  var floorplanCount: js.UndefOr[FloorplanCount] = js.native
  
  /**
    * The number of unique interiors per floorplan.
    */
  var interiorCountPerFloorplan: js.UndefOr[InteriorCountPerFloorplan] = js.native
}
object WorldCount {
  
  @scala.inline
  def apply(): WorldCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldCount]
  }
  
  @scala.inline
  implicit class WorldCountOps[Self <: WorldCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFloorplanCount(value: FloorplanCount): Self = this.set("floorplanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorplanCount: Self = this.set("floorplanCount", js.undefined)
    
    @scala.inline
    def setInteriorCountPerFloorplan(value: InteriorCountPerFloorplan): Self = this.set("interiorCountPerFloorplan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteriorCountPerFloorplan: Self = this.set("interiorCountPerFloorplan", js.undefined)
  }
}
