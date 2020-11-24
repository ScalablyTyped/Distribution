package typings.ckeditor.CKEDITOR.dialog.definition

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.widget
import typings.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait uiElement extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var commit: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.native
  
  var requiredContent: js.UndefOr[String | StringDictionary[js.Any] | style] = js.native
  
  var setup: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object uiElement {
  
  @scala.inline
  def apply(): uiElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[uiElement]
  }
  
  @scala.inline
  implicit class uiElementOps[Self <: uiElement] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCommit(value: /* widget */ widget => Unit): Self = this.set("commit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnHide(value: uiElement => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: uiElement => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnShow(value: uiElement => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setRequiredContent(value: String | StringDictionary[js.Any] | style): Self = this.set("requiredContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredContent: Self = this.set("requiredContent", js.undefined)
    
    @scala.inline
    def setSetup(value: /* widget */ widget => Unit): Self = this.set("setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
