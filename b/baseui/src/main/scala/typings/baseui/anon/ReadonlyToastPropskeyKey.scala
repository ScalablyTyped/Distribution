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

/* Inlined std.Readonly<baseui.baseui/toast.ToastProps> & {  key :react.react.Key} */
trait ReadonlyToastPropskeyKey extends StObject {
  
  val autoFocus: js.UndefOr[Boolean] = js.undefined
  
  val autoHideDuration: js.UndefOr[Double] = js.undefined
  
  val children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode] = js.undefined
  
  val closeable: js.UndefOr[Boolean] = js.undefined
  
  val `data-baseweb`: js.UndefOr[String] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] & typings.react.mod.Key
  
  val kind: js.UndefOr[info | positive | warning | negative] = js.undefined
  
  val notificationType: js.UndefOr[`inline` | toast] = js.undefined
  
  val onBlur: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  val onClose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  val onFocus: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  val onMouseEnter: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  val onMouseLeave: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  val overrides: js.UndefOr[ToastOverrides] = js.undefined
}
object ReadonlyToastPropskeyKey {
  
  inline def apply(key: js.UndefOr[typings.react.mod.Key] & typings.react.mod.Key): ReadonlyToastPropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToastPropskeyKey]
  }
  
  extension [Self <: ReadonlyToastPropskeyKey](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setChildren(value: (js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* args */ Dismiss => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    inline def setKey(value: js.UndefOr[typings.react.mod.Key] & typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: info | positive | warning | negative): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotificationType(value: `inline` | toast): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    inline def setOnBlur(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClose(value: () => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnFocus(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}
