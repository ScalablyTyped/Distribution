package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PyramidTileId extends StObject {
  
  /** The height of the tile. */
  var pixelHeight: Double = js.native
  
  /** The width of the tile. */
  var pixelWidth: Double = js.native
  
  /** The quadkey ID of the tile. */
  var quadKey: String = js.native
  
  /** The x tile coordinate. */
  var x: Double = js.native
  
  /** The y tile coordinate. */
  var y: Double = js.native
  
  /** The zoom level of the tile. */
  var zoom: Double = js.native
}
object PyramidTileId {
  
  @scala.inline
  def apply(pixelHeight: Double, pixelWidth: Double, quadKey: String, x: Double, y: Double, zoom: Double): PyramidTileId = {
    val __obj = js.Dynamic.literal(pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any], quadKey = quadKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PyramidTileId]
  }
  
  @scala.inline
  implicit class PyramidTileIdMutableBuilder[Self <: PyramidTileId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPixelHeight(value: Double): Self = StObject.set(x, "pixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelWidth(value: Double): Self = StObject.set(x, "pixelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadKey(value: String): Self = StObject.set(x, "quadKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
