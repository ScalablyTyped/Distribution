package typings.ckeditor.CKEDITOR.ui.balloonPanel

import typings.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait templates extends js.Object {
  
  var close: js.UndefOr[template] = js.native
  
  var content: js.UndefOr[template] = js.native
  
  var panel: js.UndefOr[template] = js.native
  
  var title: js.UndefOr[template] = js.native
  
  var triangle: js.UndefOr[template] = js.native
  
  var triangleInner: js.UndefOr[template] = js.native
  
  var triangleOuter: js.UndefOr[template] = js.native
}
object templates {
  
  @scala.inline
  def apply(): templates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[templates]
  }
  
  @scala.inline
  implicit class templatesOps[Self <: templates] (val x: Self) extends AnyVal {
    
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
    def setClose(value: template): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setContent(value: template): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setPanel(value: template): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setTitle(value: template): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTriangle(value: template): Self = this.set("triangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangle: Self = this.set("triangle", js.undefined)
    
    @scala.inline
    def setTriangleInner(value: template): Self = this.set("triangleInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleInner: Self = this.set("triangleInner", js.undefined)
    
    @scala.inline
    def setTriangleOuter(value: template): Self = this.set("triangleOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleOuter: Self = this.set("triangleOuter", js.undefined)
  }
}
