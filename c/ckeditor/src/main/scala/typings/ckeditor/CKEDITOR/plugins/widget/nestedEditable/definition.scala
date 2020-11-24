package typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable

import typings.ckeditor.CKEDITOR.filter.allowedContentRule
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.disallowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait definition extends js.Object {
  
  var allowedContent: js.UndefOr[allowedContentRules] = js.native
  
  var disallowedContent: js.UndefOr[disallowedContentRules] = js.native
  
  var pathName: js.UndefOr[String] = js.native
  
  var selector: js.UndefOr[String] = js.native
}
object definition {
  
  @scala.inline
  def apply(): definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[definition]
  }
  
  @scala.inline
  implicit class definitionOps[Self <: definition] (val x: Self) extends AnyVal {
    
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
    def setAllowedContentVarargs(value: allowedContentRule*): Self = this.set("allowedContent", js.Array(value :_*))
    
    @scala.inline
    def setAllowedContent(value: allowedContentRules): Self = this.set("allowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedContent: Self = this.set("allowedContent", js.undefined)
    
    @scala.inline
    def setDisallowedContent(value: disallowedContentRules): Self = this.set("disallowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowedContent: Self = this.set("disallowedContent", js.undefined)
    
    @scala.inline
    def setPathName(value: String): Self = this.set("pathName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathName: Self = this.set("pathName", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
