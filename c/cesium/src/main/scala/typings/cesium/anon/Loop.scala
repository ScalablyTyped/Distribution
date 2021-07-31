package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loop extends StObject {
  
  var arcType: js.UndefOr[typings.cesium.mod.ArcType] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.Array[Cartesian3]
  
  var width: js.UndefOr[Double] = js.undefined
}
object Loop {
  
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): Loop = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  
  @scala.inline
  implicit class LoopMutableBuilder[Self <: Loop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcType(value: typings.cesium.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
