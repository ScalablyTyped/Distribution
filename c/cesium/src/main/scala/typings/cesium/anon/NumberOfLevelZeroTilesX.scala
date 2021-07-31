package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfLevelZeroTilesX extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
}
object NumberOfLevelZeroTilesX {
  
  @scala.inline
  def apply(): NumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfLevelZeroTilesX]
  }
  
  @scala.inline
  implicit class NumberOfLevelZeroTilesXMutableBuilder[Self <: NumberOfLevelZeroTilesX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setNumberOfLevelZeroTilesX(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLevelZeroTilesXUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesX", js.undefined)
    
    @scala.inline
    def setNumberOfLevelZeroTilesY(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLevelZeroTilesYUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesY", js.undefined)
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
