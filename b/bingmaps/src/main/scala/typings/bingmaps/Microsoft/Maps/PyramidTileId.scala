package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PyramidTileId extends StObject {
  
  /** The height of the tile. */
  var pixelHeight: Double
  
  /** The width of the tile. */
  var pixelWidth: Double
  
  /** The quadkey ID of the tile. */
  var quadKey: String
  
  /** The x tile coordinate. */
  var x: Double
  
  /** The y tile coordinate. */
  var y: Double
  
  /** The zoom level of the tile. */
  var zoom: Double
}
object PyramidTileId {
  
  inline def apply(pixelHeight: Double, pixelWidth: Double, quadKey: String, x: Double, y: Double, zoom: Double): PyramidTileId = {
    val __obj = js.Dynamic.literal(pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any], quadKey = quadKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PyramidTileId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PyramidTileId] (val x: Self) extends AnyVal {
    
    inline def setPixelHeight(value: Double): Self = StObject.set(x, "pixelHeight", value.asInstanceOf[js.Any])
    
    inline def setPixelWidth(value: Double): Self = StObject.set(x, "pixelWidth", value.asInstanceOf[js.Any])
    
    inline def setQuadKey(value: String): Self = StObject.set(x, "quadKey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
