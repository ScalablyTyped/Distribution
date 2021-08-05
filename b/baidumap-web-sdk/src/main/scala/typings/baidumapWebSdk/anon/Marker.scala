package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marker extends StObject {
  
  var marker: typings.baidumapWebSdk.BMap.Marker
  
  var target: js.Any
  
  var `type`: String
}
object Marker {
  
  inline def apply(marker: typings.baidumapWebSdk.BMap.Marker, target: js.Any, `type`: String): Marker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  extension [Self <: Marker](x: Self) {
    
    inline def setMarker(value: typings.baidumapWebSdk.BMap.Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
