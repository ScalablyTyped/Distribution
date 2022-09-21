package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.selectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerRange extends StObject {
  
  var item: js.UndefOr[default] = js.undefined
  
  var markerName: String
  
  var markerRange: typings.ckeditorCkeditor5Engine.rangeMod.default
  
  var range: js.UndefOr[typings.ckeditorCkeditor5Engine.rangeMod.default] = js.undefined
}
object MarkerRange {
  
  inline def apply(markerName: String, markerRange: typings.ckeditorCkeditor5Engine.rangeMod.default): MarkerRange = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any], markerRange = markerRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerRange]
  }
  
  extension [Self <: MarkerRange](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMarkerName(value: String): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
    
    inline def setMarkerRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "markerRange", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
