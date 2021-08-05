package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreRoot extends StObject {
  
  var ignoreRoot: js.UndefOr[Boolean] = js.undefined
  
  var renderUIElements: js.UndefOr[Boolean] = js.undefined
  
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
  
  var showAttributeElementId: js.UndefOr[Boolean] = js.undefined
  
  var showPriority: js.UndefOr[Boolean] = js.undefined
  
  var showType: js.UndefOr[Boolean] = js.undefined
}
object IgnoreRoot {
  
  inline def apply(): IgnoreRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRoot]
  }
  
  extension [Self <: IgnoreRoot](x: Self) {
    
    inline def setIgnoreRoot(value: Boolean): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
    
    inline def setRenderUIElements(value: Boolean): Self = StObject.set(x, "renderUIElements", value.asInstanceOf[js.Any])
    
    inline def setRenderUIElementsUndefined: Self = StObject.set(x, "renderUIElements", js.undefined)
    
    inline def setSameSelectionCharacters(value: Boolean): Self = StObject.set(x, "sameSelectionCharacters", value.asInstanceOf[js.Any])
    
    inline def setSameSelectionCharactersUndefined: Self = StObject.set(x, "sameSelectionCharacters", js.undefined)
    
    inline def setShowAttributeElementId(value: Boolean): Self = StObject.set(x, "showAttributeElementId", value.asInstanceOf[js.Any])
    
    inline def setShowAttributeElementIdUndefined: Self = StObject.set(x, "showAttributeElementId", js.undefined)
    
    inline def setShowPriority(value: Boolean): Self = StObject.set(x, "showPriority", value.asInstanceOf[js.Any])
    
    inline def setShowPriorityUndefined: Self = StObject.set(x, "showPriority", js.undefined)
    
    inline def setShowType(value: Boolean): Self = StObject.set(x, "showType", value.asInstanceOf[js.Any])
    
    inline def setShowTypeUndefined: Self = StObject.set(x, "showType", js.undefined)
  }
}
