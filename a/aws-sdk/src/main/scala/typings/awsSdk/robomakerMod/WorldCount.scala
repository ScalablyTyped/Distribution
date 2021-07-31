package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldCount extends StObject {
  
  /**
    * The number of unique floorplans.
    */
  var floorplanCount: js.UndefOr[FloorplanCount] = js.undefined
  
  /**
    * The number of unique interiors per floorplan.
    */
  var interiorCountPerFloorplan: js.UndefOr[InteriorCountPerFloorplan] = js.undefined
}
object WorldCount {
  
  @scala.inline
  def apply(): WorldCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldCount]
  }
  
  @scala.inline
  implicit class WorldCountMutableBuilder[Self <: WorldCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloorplanCount(value: FloorplanCount): Self = StObject.set(x, "floorplanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorplanCountUndefined: Self = StObject.set(x, "floorplanCount", js.undefined)
    
    @scala.inline
    def setInteriorCountPerFloorplan(value: InteriorCountPerFloorplan): Self = StObject.set(x, "interiorCountPerFloorplan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteriorCountPerFloorplanUndefined: Self = StObject.set(x, "interiorCountPerFloorplan", js.undefined)
  }
}
