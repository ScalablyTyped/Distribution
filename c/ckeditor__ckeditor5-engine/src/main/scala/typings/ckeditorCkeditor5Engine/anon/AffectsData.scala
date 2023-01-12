package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffectsData extends StObject {
  
  var affectsData: Boolean
  
  var baseVersion: Double | Null
  
  var name: String
  
  var newRange: js.UndefOr[ReturnType[js.Function0[End]]] = js.undefined
  
  var oldRange: js.UndefOr[ReturnType[js.Function0[End]]] = js.undefined
}
object AffectsData {
  
  inline def apply(affectsData: Boolean, name: String): AffectsData = {
    val __obj = js.Dynamic.literal(affectsData = affectsData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[AffectsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffectsData] (val x: Self) extends AnyVal {
    
    inline def setAffectsData(value: Boolean): Self = StObject.set(x, "affectsData", value.asInstanceOf[js.Any])
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
    
    inline def setNewRangeUndefined: Self = StObject.set(x, "newRange", js.undefined)
    
    inline def setOldRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    
    inline def setOldRangeUndefined: Self = StObject.set(x, "oldRange", js.undefined)
  }
}
