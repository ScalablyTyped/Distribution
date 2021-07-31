package typings.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var overlay: typings.bmapgl.BMapGL.Overlay
  
  var pixel: typings.bmapgl.BMapGL.Pixel
  
  var point: typings.bmapgl.BMapGL.Point
  
  var target: js.Any
  
  var `type`: String
}
object Overlay {
  
  @scala.inline
  def apply(
    overlay: typings.bmapgl.BMapGL.Overlay,
    pixel: typings.bmapgl.BMapGL.Pixel,
    point: typings.bmapgl.BMapGL.Point,
    target: js.Any,
    `type`: String
  ): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit class OverlayMutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverlay(value: typings.bmapgl.BMapGL.Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel(value: typings.bmapgl.BMapGL.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: typings.bmapgl.BMapGL.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
