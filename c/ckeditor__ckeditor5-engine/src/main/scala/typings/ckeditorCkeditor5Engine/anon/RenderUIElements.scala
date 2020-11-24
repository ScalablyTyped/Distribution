package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderUIElements extends js.Object {
  
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
  implicit class RenderUIElementsOps[Self <: RenderUIElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRenderUIElements(value: Boolean): Self = this.set("renderUIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderUIElements: Self = this.set("renderUIElements", js.undefined)
    
    @scala.inline
    def setRootName(value: Boolean): Self = this.set("rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootName: Self = this.set("rootName", js.undefined)
    
    @scala.inline
    def setShowAttributeElementId(value: Boolean): Self = this.set("showAttributeElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAttributeElementId: Self = this.set("showAttributeElementId", js.undefined)
    
    @scala.inline
    def setShowPriority(value: Boolean): Self = this.set("showPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPriority: Self = this.set("showPriority", js.undefined)
    
    @scala.inline
    def setShowType(value: Boolean): Self = this.set("showType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowType: Self = this.set("showType", js.undefined)
    
    @scala.inline
    def setWithoutSelection(value: Boolean): Self = this.set("withoutSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutSelection: Self = this.set("withoutSelection", js.undefined)
  }
}
