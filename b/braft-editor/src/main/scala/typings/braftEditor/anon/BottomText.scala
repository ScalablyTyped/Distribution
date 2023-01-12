package typings.braftEditor.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomText extends StObject {
  
  var bottomText: js.UndefOr[ReactNode] = js.undefined
  
  var cancelText: js.UndefOr[String] = js.undefined
  
  var children: ReactNode
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var closeOnCancel: js.UndefOr[Boolean] = js.undefined
  
  var closeOnConfirm: js.UndefOr[Boolean] = js.undefined
  
  var confirmText: js.UndefOr[String] = js.undefined
  
  var confirmable: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: String
  
  var onBlur: js.UndefOr[js.Function] = js.undefined
  
  var onCancel: js.UndefOr[js.Function] = js.undefined
  
  var onClose: js.UndefOr[js.Function] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function] = js.undefined
  
  var showCancel: js.UndefOr[Boolean] = js.undefined
  
  var showClose: js.UndefOr[Boolean] = js.undefined
  
  var showConfirm: js.UndefOr[Boolean] = js.undefined
  
  var showFooter: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BottomText {
  
  inline def apply(id: String): BottomText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomText] (val x: Self) extends AnyVal {
    
    inline def setBottomText(value: ReactNode): Self = StObject.set(x, "bottomText", value.asInstanceOf[js.Any])
    
    inline def setBottomTextUndefined: Self = StObject.set(x, "bottomText", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    inline def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
    
    inline def setCloseOnCancel(value: Boolean): Self = StObject.set(x, "closeOnCancel", value.asInstanceOf[js.Any])
    
    inline def setCloseOnCancelUndefined: Self = StObject.set(x, "closeOnCancel", js.undefined)
    
    inline def setCloseOnConfirm(value: Boolean): Self = StObject.set(x, "closeOnConfirm", value.asInstanceOf[js.Any])
    
    inline def setCloseOnConfirmUndefined: Self = StObject.set(x, "closeOnConfirm", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setConfirmable(value: Boolean): Self = StObject.set(x, "confirmable", value.asInstanceOf[js.Any])
    
    inline def setConfirmableUndefined: Self = StObject.set(x, "confirmable", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCancel(value: js.Function): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnConfirm(value: js.Function): Self = StObject.set(x, "onConfirm", value.asInstanceOf[js.Any])
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
    
    inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
    
    inline def setShowConfirm(value: Boolean): Self = StObject.set(x, "showConfirm", value.asInstanceOf[js.Any])
    
    inline def setShowConfirmUndefined: Self = StObject.set(x, "showConfirm", js.undefined)
    
    inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
