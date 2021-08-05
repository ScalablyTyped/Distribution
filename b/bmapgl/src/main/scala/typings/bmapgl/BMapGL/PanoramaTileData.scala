package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaTileData extends StObject {
  
  var centerHeading: Double
  
  var tileSize: Size
  
  var worldSize: Size
}
object PanoramaTileData {
  
  inline def apply(centerHeading: Double, tileSize: Size, worldSize: Size): PanoramaTileData = {
    val __obj = js.Dynamic.literal(centerHeading = centerHeading.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], worldSize = worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaTileData]
  }
  
  extension [Self <: PanoramaTileData](x: Self) {
    
    inline def setCenterHeading(value: Double): Self = StObject.set(x, "centerHeading", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setWorldSize(value: Size): Self = StObject.set(x, "worldSize", value.asInstanceOf[js.Any])
  }
}
