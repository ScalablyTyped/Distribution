package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumHeights extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var maximumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  
  var minimumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  
  var positions: js.Array[Cartesian3]
}
object MinimumHeights {
  
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): MinimumHeights = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumHeights]
  }
  
  @scala.inline
  implicit class MinimumHeightsMutableBuilder[Self <: MinimumHeights] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setMaximumHeights(value: js.Array[Double]): Self = StObject.set(x, "maximumHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumHeightsUndefined: Self = StObject.set(x, "maximumHeights", js.undefined)
    
    @scala.inline
    def setMaximumHeightsVarargs(value: Double*): Self = StObject.set(x, "maximumHeights", js.Array(value :_*))
    
    @scala.inline
    def setMinimumHeights(value: js.Array[Double]): Self = StObject.set(x, "minimumHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumHeightsUndefined: Self = StObject.set(x, "minimumHeights", js.undefined)
    
    @scala.inline
    def setMinimumHeightsVarargs(value: Double*): Self = StObject.set(x, "minimumHeights", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value :_*))
  }
}
