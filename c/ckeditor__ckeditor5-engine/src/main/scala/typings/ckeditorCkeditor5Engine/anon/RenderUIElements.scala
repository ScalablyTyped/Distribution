package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderUIElements extends StObject {
  
  var renderUIElements: js.UndefOr[Boolean] = js.undefined
  
  var rootName: js.UndefOr[Boolean] = js.undefined
  
  var showAttributeElementId: js.UndefOr[Boolean] = js.undefined
  
  var showPriority: js.UndefOr[Boolean] = js.undefined
  
  var showType: js.UndefOr[Boolean] = js.undefined
  
  var withoutSelection: js.UndefOr[Boolean] = js.undefined
}
object RenderUIElements {
  
  inline def apply(): RenderUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderUIElements]
  }
  
  extension [Self <: RenderUIElements](x: Self) {
    
    inline def setRenderUIElements(value: Boolean): Self = StObject.set(x, "renderUIElements", value.asInstanceOf[js.Any])
    
    inline def setRenderUIElementsUndefined: Self = StObject.set(x, "renderUIElements", js.undefined)
    
    inline def setRootName(value: Boolean): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    inline def setShowAttributeElementId(value: Boolean): Self = StObject.set(x, "showAttributeElementId", value.asInstanceOf[js.Any])
    
    inline def setShowAttributeElementIdUndefined: Self = StObject.set(x, "showAttributeElementId", js.undefined)
    
    inline def setShowPriority(value: Boolean): Self = StObject.set(x, "showPriority", value.asInstanceOf[js.Any])
    
    inline def setShowPriorityUndefined: Self = StObject.set(x, "showPriority", js.undefined)
    
    inline def setShowType(value: Boolean): Self = StObject.set(x, "showType", value.asInstanceOf[js.Any])
    
    inline def setShowTypeUndefined: Self = StObject.set(x, "showType", js.undefined)
    
    inline def setWithoutSelection(value: Boolean): Self = StObject.set(x, "withoutSelection", value.asInstanceOf[js.Any])
    
    inline def setWithoutSelectionUndefined: Self = StObject.set(x, "withoutSelection", js.undefined)
  }
}
