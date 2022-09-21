package typings.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marker extends StObject {
  
  var marker: typings.bmapgl.BMapGL.Marker
  
  var target: Any
  
  var `type`: String
}
object Marker {
  
  inline def apply(marker: typings.bmapgl.BMapGL.Marker, target: Any, `type`: String): Marker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  extension [Self <: Marker](x: Self) {
    
    inline def setMarker(value: typings.bmapgl.BMapGL.Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
