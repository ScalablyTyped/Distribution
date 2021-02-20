package typings.braftEditor.anon

import typings.braftEditor.braftEditorStrings.dropdown
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowActive extends ExtendControlType {
  
  var arrowActive: js.UndefOr[Boolean] = js.native
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var component: ReactNode = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var html: js.UndefOr[String | Null] = js.native
  
  var key: String = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String | ReactNode] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: dropdown = js.native
}
object ArrowActive {
  
  @scala.inline
  def apply(key: String, `type`: dropdown): ArrowActive = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowActive]
  }
  
  @scala.inline
  implicit class ArrowActiveMutableBuilder[Self <: ArrowActive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowActive(value: Boolean): Self = StObject.set(x, "arrowActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowActiveUndefined: Self = StObject.set(x, "arrowActive", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setComponent(value: ReactNode): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlNull: Self = StObject.set(x, "html", null)
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    @scala.inline
    def setText(value: String | ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: dropdown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
