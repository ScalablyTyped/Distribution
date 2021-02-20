package typings.braftEditor.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomText extends StObject {
  
  var bottomText: js.UndefOr[ReactNode] = js.native
  
  var cancelText: js.UndefOr[String] = js.native
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  
  var closeOnCancel: js.UndefOr[Boolean] = js.native
  
  var closeOnConfirm: js.UndefOr[Boolean] = js.native
  
  var confirmText: js.UndefOr[String] = js.native
  
  var confirmable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var onBlur: js.UndefOr[js.Function] = js.native
  
  var onCancel: js.UndefOr[js.Function] = js.native
  
  var onClose: js.UndefOr[js.Function] = js.native
  
  var onConfirm: js.UndefOr[js.Function] = js.native
  
  var showCancel: js.UndefOr[Boolean] = js.native
  
  var showClose: js.UndefOr[Boolean] = js.native
  
  var showConfirm: js.UndefOr[Boolean] = js.native
  
  var showFooter: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BottomText {
  
  @scala.inline
  def apply(id: String): BottomText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomText]
  }
  
  @scala.inline
  implicit class BottomTextMutableBuilder[Self <: BottomText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomText(value: ReactNode): Self = StObject.set(x, "bottomText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomTextUndefined: Self = StObject.set(x, "bottomText", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
    
    @scala.inline
    def setCloseOnCancel(value: Boolean): Self = StObject.set(x, "closeOnCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnCancelUndefined: Self = StObject.set(x, "closeOnCancel", js.undefined)
    
    @scala.inline
    def setCloseOnConfirm(value: Boolean): Self = StObject.set(x, "closeOnConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnConfirmUndefined: Self = StObject.set(x, "closeOnConfirm", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    @scala.inline
    def setConfirmable(value: Boolean): Self = StObject.set(x, "confirmable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmableUndefined: Self = StObject.set(x, "confirmable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCancel(value: js.Function): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: js.Function): Self = StObject.set(x, "onConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
    
    @scala.inline
    def setShowConfirm(value: Boolean): Self = StObject.set(x, "showConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConfirmUndefined: Self = StObject.set(x, "showConfirm", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
