package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var pixel: typings.baidumapWebSdk.BMap.Pixel
  
  var point: typings.baidumapWebSdk.BMap.Point
  
  var target: Any
  
  var `type`: String
  
  var zoom: Double
}
object Type {
  
  inline def apply(
    pixel: typings.baidumapWebSdk.BMap.Pixel,
    point: typings.baidumapWebSdk.BMap.Point,
    target: Any,
    `type`: String,
    zoom: Double
  ): Type = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setPixel(value: typings.baidumapWebSdk.BMap.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typings.baidumapWebSdk.BMap.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
