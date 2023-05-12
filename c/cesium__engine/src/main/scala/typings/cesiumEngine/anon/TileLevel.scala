package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLevel extends StObject {
  
  var tileLevel: js.UndefOr[Double] = js.undefined
  
  var tileX: js.UndefOr[Double] = js.undefined
  
  var tileY: js.UndefOr[Double] = js.undefined
  
  var tileZ: js.UndefOr[Double] = js.undefined
}
object TileLevel {
  
  inline def apply(): TileLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLevel] (val x: Self) extends AnyVal {
    
    inline def setTileLevel(value: Double): Self = StObject.set(x, "tileLevel", value.asInstanceOf[js.Any])
    
    inline def setTileLevelUndefined: Self = StObject.set(x, "tileLevel", js.undefined)
    
    inline def setTileX(value: Double): Self = StObject.set(x, "tileX", value.asInstanceOf[js.Any])
    
    inline def setTileXUndefined: Self = StObject.set(x, "tileX", js.undefined)
    
    inline def setTileY(value: Double): Self = StObject.set(x, "tileY", value.asInstanceOf[js.Any])
    
    inline def setTileYUndefined: Self = StObject.set(x, "tileY", js.undefined)
    
    inline def setTileZ(value: Double): Self = StObject.set(x, "tileZ", value.asInstanceOf[js.Any])
    
    inline def setTileZUndefined: Self = StObject.set(x, "tileZ", js.undefined)
  }
}
