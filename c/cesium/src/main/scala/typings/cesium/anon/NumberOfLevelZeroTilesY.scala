package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfLevelZeroTilesY extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  
  var rectangleNortheastInMeters: js.UndefOr[Cartesian2] = js.undefined
  
  var rectangleSouthwestInMeters: js.UndefOr[Cartesian2] = js.undefined
}
object NumberOfLevelZeroTilesY {
  
  inline def apply(): NumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfLevelZeroTilesY]
  }
  
  extension [Self <: NumberOfLevelZeroTilesY](x: Self) {
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setNumberOfLevelZeroTilesX(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesX", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLevelZeroTilesXUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesX", js.undefined)
    
    inline def setNumberOfLevelZeroTilesY(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesY", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLevelZeroTilesYUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesY", js.undefined)
    
    inline def setRectangleNortheastInMeters(value: Cartesian2): Self = StObject.set(x, "rectangleNortheastInMeters", value.asInstanceOf[js.Any])
    
    inline def setRectangleNortheastInMetersUndefined: Self = StObject.set(x, "rectangleNortheastInMeters", js.undefined)
    
    inline def setRectangleSouthwestInMeters(value: Cartesian2): Self = StObject.set(x, "rectangleSouthwestInMeters", value.asInstanceOf[js.Any])
    
    inline def setRectangleSouthwestInMetersUndefined: Self = StObject.set(x, "rectangleSouthwestInMeters", js.undefined)
  }
}
