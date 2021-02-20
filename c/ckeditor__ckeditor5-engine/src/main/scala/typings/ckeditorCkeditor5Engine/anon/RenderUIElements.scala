package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderUIElements extends StObject {
  
  var renderUIElements: js.UndefOr[Boolean] = js.native
  
  var rootName: js.UndefOr[Boolean] = js.native
  
  var showAttributeElementId: js.UndefOr[Boolean] = js.native
  
  var showPriority: js.UndefOr[Boolean] = js.native
  
  var showType: js.UndefOr[Boolean] = js.native
  
  var withoutSelection: js.UndefOr[Boolean] = js.native
}
object RenderUIElements {
  
  @scala.inline
  def apply(): RenderUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderUIElements]
  }
  
  @scala.inline
  implicit class RenderUIElementsMutableBuilder[Self <: RenderUIElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderUIElements(value: Boolean): Self = StObject.set(x, "renderUIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUIElementsUndefined: Self = StObject.set(x, "renderUIElements", js.undefined)
    
    @scala.inline
    def setRootName(value: Boolean): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    @scala.inline
    def setShowAttributeElementId(value: Boolean): Self = StObject.set(x, "showAttributeElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAttributeElementIdUndefined: Self = StObject.set(x, "showAttributeElementId", js.undefined)
    
    @scala.inline
    def setShowPriority(value: Boolean): Self = StObject.set(x, "showPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPriorityUndefined: Self = StObject.set(x, "showPriority", js.undefined)
    
    @scala.inline
    def setShowType(value: Boolean): Self = StObject.set(x, "showType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTypeUndefined: Self = StObject.set(x, "showType", js.undefined)
    
    @scala.inline
    def setWithoutSelection(value: Boolean): Self = StObject.set(x, "withoutSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutSelectionUndefined: Self = StObject.set(x, "withoutSelection", js.undefined)
  }
}
