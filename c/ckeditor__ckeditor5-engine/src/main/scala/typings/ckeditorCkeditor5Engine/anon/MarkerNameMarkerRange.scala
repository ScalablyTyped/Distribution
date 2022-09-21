package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.rangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerNameMarkerRange extends StObject {
  
  var markerName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any
  
  var markerRange: default
}
object MarkerNameMarkerRange {
  
  inline def apply(
    markerName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any,
    markerRange: default
  ): MarkerNameMarkerRange = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any], markerRange = markerRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerNameMarkerRange]
  }
  
  extension [Self <: MarkerNameMarkerRange](x: Self) {
    
    inline def setMarkerName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any
    ): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
    
    inline def setMarkerRange(value: default): Self = StObject.set(x, "markerRange", value.asInstanceOf[js.Any])
  }
}
