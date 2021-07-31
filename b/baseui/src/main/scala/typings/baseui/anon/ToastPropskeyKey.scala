package typings.baseui.anon

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import typings.baseui.toastMod.ToastOverrides
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/toast.ToastProps & {  key :react.react.Key} */
trait ToastPropskeyKey extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode] = js.undefined
  
  var closeable: js.UndefOr[Boolean] = js.undefined
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[typings.react.mod.Key] & typings.react.mod.Key
  
  var kind: js.UndefOr[info | positive | warning | negative] = js.undefined
  
  var notificationType: js.UndefOr[`inline` | toast] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[ToastOverrides] = js.undefined
}
object ToastPropskeyKey {
  
  @scala.inline
  def apply(key: js.UndefOr[typings.react.mod.Key] & typings.react.mod.Key): ToastPropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastPropskeyKey]
  }
  
  @scala.inline
  implicit class ToastPropskeyKeyMutableBuilder[Self <: ToastPropskeyKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    @scala.inline
    def setChildren(value: (js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* args */ Dismiss => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    @scala.inline
    def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    @scala.inline
    def setKey(value: js.UndefOr[typings.react.mod.Key] & typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: info | positive | warning | negative): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNotificationType(value: `inline` | toast): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}
