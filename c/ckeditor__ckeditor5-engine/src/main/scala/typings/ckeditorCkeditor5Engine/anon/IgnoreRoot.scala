package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreRoot extends StObject {
  
  var ignoreRoot: js.UndefOr[Boolean] = js.native
  
  var renderUIElements: js.UndefOr[Boolean] = js.native
  
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.native
  
  var showAttributeElementId: js.UndefOr[Boolean] = js.native
  
  var showPriority: js.UndefOr[Boolean] = js.native
  
  var showType: js.UndefOr[Boolean] = js.native
}
object IgnoreRoot {
  
  @scala.inline
  def apply(): IgnoreRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRoot]
  }
  
  @scala.inline
  implicit class IgnoreRootMutableBuilder[Self <: IgnoreRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreRoot(value: Boolean): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
    
    @scala.inline
    def setRenderUIElements(value: Boolean): Self = StObject.set(x, "renderUIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUIElementsUndefined: Self = StObject.set(x, "renderUIElements", js.undefined)
    
    @scala.inline
    def setSameSelectionCharacters(value: Boolean): Self = StObject.set(x, "sameSelectionCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSelectionCharactersUndefined: Self = StObject.set(x, "sameSelectionCharacters", js.undefined)
    
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
  }
}
