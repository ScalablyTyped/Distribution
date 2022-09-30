package typings.braftEditor.anon

import typings.braftEditor.braftEditorStrings.dropdown
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowActive
  extends StObject
     with ExtendControlType {
  
  var arrowActive: js.UndefOr[Boolean] = js.undefined
  
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var component: ReactNode
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var html: js.UndefOr[String | Null] = js.undefined
  
  var key: String
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String | ReactNode] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: dropdown
}
object ArrowActive {
  
  inline def apply(key: String): ArrowActive = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropdown")
    __obj.asInstanceOf[ArrowActive]
  }
  
  extension [Self <: ArrowActive](x: Self) {
    
    inline def setArrowActive(value: Boolean): Self = StObject.set(x, "arrowActive", value.asInstanceOf[js.Any])
    
    inline def setArrowActiveUndefined: Self = StObject.set(x, "arrowActive", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponent(value: ReactNode): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setText(value: String | ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: dropdown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
