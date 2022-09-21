package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marker
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewRange extends StObject {
  
  var affectsData: Boolean
  
  var name: String
  
  var newRange: js.UndefOr[ReturnType[js.Function0[End]] | Null] = js.undefined
  
  var oldRange: js.UndefOr[ReturnType[js.Function0[End]] | Null] = js.undefined
  
  var `type`: marker
}
object NewRange {
  
  inline def apply(affectsData: Boolean, name: String): NewRange = {
    val __obj = js.Dynamic.literal(affectsData = affectsData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("marker")
    __obj.asInstanceOf[NewRange]
  }
  
  extension [Self <: NewRange](x: Self) {
    
    inline def setAffectsData(value: Boolean): Self = StObject.set(x, "affectsData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
    
    inline def setNewRangeNull: Self = StObject.set(x, "newRange", null)
    
    inline def setNewRangeUndefined: Self = StObject.set(x, "newRange", js.undefined)
    
    inline def setOldRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    
    inline def setOldRangeNull: Self = StObject.set(x, "oldRange", null)
    
    inline def setOldRangeUndefined: Self = StObject.set(x, "oldRange", js.undefined)
    
    inline def setType(value: marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
