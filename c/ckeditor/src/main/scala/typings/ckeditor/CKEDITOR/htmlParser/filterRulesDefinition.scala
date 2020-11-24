package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait filterRulesDefinition extends js.Object {
  
  var attributeNames: js.UndefOr[js.Any] = js.native
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var comment: js.UndefOr[js.Any] = js.native
  
  var elementNames: js.UndefOr[js.Any] = js.native
  
  var elements: js.UndefOr[js.Any] = js.native
  
  var root: js.UndefOr[js.Any] = js.native
  
  var text: js.UndefOr[js.Any] = js.native
}
object filterRulesDefinition {
  
  @scala.inline
  def apply(): filterRulesDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[filterRulesDefinition]
  }
  
  @scala.inline
  implicit class filterRulesDefinitionOps[Self <: filterRulesDefinition] (val x: Self) extends AnyVal {
    
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
    def setAttributeNames(value: js.Any): Self = this.set("attributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeNames: Self = this.set("attributeNames", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setComment(value: js.Any): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setElementNames(value: js.Any): Self = this.set("elementNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementNames: Self = this.set("elementNames", js.undefined)
    
    @scala.inline
    def setElements(value: js.Any): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
