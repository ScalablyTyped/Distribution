package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerName extends StObject {
  
  var markerName: String
  
  var markerRange: default
}
object MarkerName {
  
  inline def apply(markerName: String, markerRange: default): MarkerName = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any], markerRange = markerRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerName] (val x: Self) extends AnyVal {
    
    inline def setMarkerName(value: String): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
    
    inline def setMarkerRange(value: default): Self = StObject.set(x, "markerRange", value.asInstanceOf[js.Any])
  }
}
