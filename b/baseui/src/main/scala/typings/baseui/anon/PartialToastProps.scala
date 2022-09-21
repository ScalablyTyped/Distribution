package typings.baseui.anon

import typings.baseui.toastTypesMod.ComponentRenderProp
import typings.baseui.toastTypesMod.KindType
import typings.baseui.toastTypesMod.NotificationType
import typings.baseui.toastTypesMod.ToastOverrides
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/toast/types.ToastProps> */
trait PartialToastProps extends StObject {
  
  var __updated: js.UndefOr[Double] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[typings.baseui.toastTypesMod.Children | ComponentRenderProp] = js.undefined
  
  var closeable: js.UndefOr[Boolean] = js.undefined
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  var kind: js.UndefOr[KindType] = js.undefined
  
  var notificationType: js.UndefOr[NotificationType] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  var overrides: js.UndefOr[ToastOverrides] = js.undefined
}
object PartialToastProps {
  
  inline def apply(): PartialToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastProps]
  }
  
  extension [Self <: PartialToastProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setChildren(value: typings.baseui.toastTypesMod.Children | ComponentRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ Dismiss => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKind(value: KindType): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    inline def setOnBlur(value: /* e */ FocusEvent[Element, Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClose(value: () => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnFocus(value: /* e */ FocusEvent[Element, Element] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def set__updated(value: Double): Self = StObject.set(x, "__updated", value.asInstanceOf[js.Any])
    
    inline def set__updatedUndefined: Self = StObject.set(x, "__updated", js.undefined)
  }
}
