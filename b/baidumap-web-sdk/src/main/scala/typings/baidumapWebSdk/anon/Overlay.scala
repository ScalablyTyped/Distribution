package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var overlay: typings.baidumapWebSdk.BMap.Overlay
  
  var pixel: typings.baidumapWebSdk.BMap.Pixel
  
  var point: typings.baidumapWebSdk.BMap.Point
  
  var target: js.Any
  
  var `type`: String
}
object Overlay {
  
  inline def apply(
    overlay: typings.baidumapWebSdk.BMap.Overlay,
    pixel: typings.baidumapWebSdk.BMap.Pixel,
    point: typings.baidumapWebSdk.BMap.Point,
    target: js.Any,
    `type`: String
  ): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  extension [Self <: Overlay](x: Self) {
    
    inline def setOverlay(value: typings.baidumapWebSdk.BMap.Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setPixel(value: typings.baidumapWebSdk.BMap.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typings.baidumapWebSdk.BMap.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
