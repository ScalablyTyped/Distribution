package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.selectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemMarkerName extends StObject {
  
  var item: js.UndefOr[default] = js.undefined
  
  var markerName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any
  
  var markerRange: typings.ckeditorCkeditor5Engine.rangeMod.default
  
  var range: js.UndefOr[typings.ckeditorCkeditor5Engine.rangeMod.default] = js.undefined
}
object ItemMarkerName {
  
  inline def apply(
    markerName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any,
    markerRange: typings.ckeditorCkeditor5Engine.rangeMod.default
  ): ItemMarkerName = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any], markerRange = markerRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMarkerName]
  }
  
  extension [Self <: ItemMarkerName](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMarkerName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any
    ): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
    
    inline def setMarkerRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "markerRange", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
