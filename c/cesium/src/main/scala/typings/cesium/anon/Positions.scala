package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positions extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.Array[Cartesian3]
}
object Positions {
  
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): Positions = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions]
  }
  
  @scala.inline
  implicit class PositionsMutableBuilder[Self <: Positions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPerPositionHeight(value: Boolean): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
    
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value :_*))
  }
}
