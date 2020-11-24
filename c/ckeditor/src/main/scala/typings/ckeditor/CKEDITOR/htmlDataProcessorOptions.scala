package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait htmlDataProcessorOptions extends js.Object {
  
  var context: js.UndefOr[String] = js.native
  
  var dontFilter: js.UndefOr[Boolean] = js.native
  
  var enterMode: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.native
  
  var fixForBody: js.UndefOr[Boolean] = js.native
  
  var protectedWhitespaces: js.UndefOr[Boolean] = js.native
}
object htmlDataProcessorOptions {
  
  @scala.inline
  def apply(): htmlDataProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[htmlDataProcessorOptions]
  }
  
  @scala.inline
  implicit class htmlDataProcessorOptionsOps[Self <: htmlDataProcessorOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDontFilter(value: Boolean): Self = this.set("dontFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontFilter: Self = this.set("dontFilter", js.undefined)
    
    @scala.inline
    def setEnterMode(value: Double): Self = this.set("enterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterMode: Self = this.set("enterMode", js.undefined)
    
    @scala.inline
    def setFilter(value: filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFixForBody(value: Boolean): Self = this.set("fixForBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixForBody: Self = this.set("fixForBody", js.undefined)
    
    @scala.inline
    def setProtectedWhitespaces(value: Boolean): Self = this.set("protectedWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedWhitespaces: Self = this.set("protectedWhitespaces", js.undefined)
  }
}
