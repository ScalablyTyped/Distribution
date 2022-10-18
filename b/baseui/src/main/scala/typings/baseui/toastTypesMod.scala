package typings.baseui

import typings.baseui.anon.Dismiss
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.FocusEvent
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastTypesMod {
  
  type Child = ReactNode
  
  type Children = ReactNode
  
  type ComponentRenderProp = js.Function1[/* props */ Dismiss, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.info
    - typings.baseui.baseuiStrings.positive
    - typings.baseui.baseuiStrings.warning
    - typings.baseui.baseuiStrings.negative
  */
  trait KindType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.`inline`
    - typings.baseui.baseuiStrings.toast
  */
  trait NotificationType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.topLeft
    - typings.baseui.baseuiStrings.topRight
    - typings.baseui.baseuiStrings.bottomLeft
    - typings.baseui.baseuiStrings.bottomRight
    - typings.baseui.baseuiStrings.bottom
    - typings.baseui.baseuiStrings.top
  */
  trait PlacementType extends StObject
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$closeable")
    var $closeable: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isRendered")
    var $isRendered: Boolean
    
    @JSName("$isVisible")
    var $isVisible: Boolean
    
    @JSName("$kind")
    var $kind: KindType
    
    @JSName("$type")
    var $type: NotificationType
  }
  object SharedStylePropsArg {
    
    inline def apply(
      $closeable: Boolean,
      $isFocusVisible: Boolean,
      $isRendered: Boolean,
      $isVisible: Boolean,
      $kind: KindType,
      $type: NotificationType
    ): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal($closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isRendered = $isRendered.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $kind = $kind.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isRendered(value: Boolean): Self = StObject.set(x, "$isRendered", value.asInstanceOf[js.Any])
      
      inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      inline def set$kind(value: KindType): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
      
      inline def set$type(value: NotificationType): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToastOverrides extends StObject {
    
    var Body: js.UndefOr[Override[Any]] = js.undefined
    
    var CloseIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var InnerContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object ToastOverrides {
    
    inline def apply(): ToastOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOverrides]
    }
    
    extension [Self <: ToastOverrides](x: Self) {
      
      inline def setBody(value: Override[Any]): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setCloseIcon(value: Override[Any]): Self = StObject.set(x, "CloseIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "CloseIcon", js.undefined)
      
      inline def setInnerContainer(value: Override[Any]): Self = StObject.set(x, "InnerContainer", value.asInstanceOf[js.Any])
      
      inline def setInnerContainerUndefined: Self = StObject.set(x, "InnerContainer", js.undefined)
    }
  }
  
  trait ToastPrivateState extends StObject {
    
    var isFocusVisible: Boolean
    
    var isRendered: Boolean
    
    var isVisible: Boolean
  }
  object ToastPrivateState {
    
    inline def apply(isFocusVisible: Boolean, isRendered: Boolean, isVisible: Boolean): ToastPrivateState = {
      val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastPrivateState]
    }
    
    extension [Self <: ToastPrivateState](x: Self) {
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToastProps extends StObject {
    
    /** This is a private property to detect manual changes to a toast
      *  i.e. calling toaster.info() with the same key twice
      *  currently the change detection is used to reset the autohide timer
      */
    var __updated: js.UndefOr[Double] = js.undefined
    
    /** If true, the toast close icon will receive focus on mount
      and restore focus to previously focused element on unmount.
      This should only be used when there is no autoHideDuration
      and the toast for some reason has an action within it.
      Focusing alerts is bad for screenreaders! */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** The number of milliseconds to wait before automatically dismissing a
      * notification. This behavior is disabled when the value is set to 0.*/
    var autoHideDuration: js.UndefOr[Double] = js.undefined
    
    /** Toast notification content. The children-as-function
      *  receives a dismiss method that can be called to
      * dismiss the notification and can be used as a
      * handler for an action inside the toast content. */
    var children: Children | ComponentRenderProp
    
    /** When set to true a close button is displayed and the notification can be dismissed by a user. */
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    /** Defines the type of notification. */
    var kind: js.UndefOr[KindType] = js.undefined
    
    var notificationType: js.UndefOr[NotificationType] = js.undefined
    
    /** A callback function called when a notification is dismissed. */
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
    
    var overrides: js.UndefOr[ToastOverrides] = js.undefined
  }
  object ToastProps {
    
    inline def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    extension [Self <: ToastProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      inline def setChildren(value: Children | ComponentRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ Dismiss => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined std.Partial<std.Omit<baseui.baseui/toast/types.ToastProps, 'children'>> */
  trait ToastPropsShape extends StObject {
    
    var __updated: js.UndefOr[Double] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoHideDuration: js.UndefOr[Double] = js.undefined
    
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var kind: js.UndefOr[KindType] = js.undefined
    
    var notificationType: js.UndefOr[NotificationType] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
    
    var overrides: js.UndefOr[ToastOverrides] = js.undefined
  }
  object ToastPropsShape {
    
    inline def apply(): ToastPropsShape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastPropsShape]
    }
    
    extension [Self <: ToastPropsShape](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
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
  
  trait ToasterContainerState extends StObject {
    
    var isMounted: Boolean
    
    var toasts: js.Array[ToastProps]
  }
  object ToasterContainerState {
    
    inline def apply(isMounted: Boolean, toasts: js.Array[ToastProps]): ToasterContainerState = {
      val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToasterContainerState]
    }
    
    extension [Self <: ToasterContainerState](x: Self) {
      
      inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      inline def setToasts(value: js.Array[ToastProps]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
      
      inline def setToastsVarargs(value: ToastProps*): Self = StObject.set(x, "toasts", js.Array(value*))
    }
  }
  
  trait ToasterOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var ToastBody: js.UndefOr[Override[Any]] = js.undefined
    
    var ToastCloseIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var ToastInnerContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object ToasterOverrides {
    
    inline def apply(): ToasterOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterOverrides]
    }
    
    extension [Self <: ToasterOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setToastBody(value: Override[Any]): Self = StObject.set(x, "ToastBody", value.asInstanceOf[js.Any])
      
      inline def setToastBodyUndefined: Self = StObject.set(x, "ToastBody", js.undefined)
      
      inline def setToastCloseIcon(value: Override[Any]): Self = StObject.set(x, "ToastCloseIcon", value.asInstanceOf[js.Any])
      
      inline def setToastCloseIconUndefined: Self = StObject.set(x, "ToastCloseIcon", js.undefined)
      
      inline def setToastInnerContainer(value: Override[Any]): Self = StObject.set(x, "ToastInnerContainer", value.asInstanceOf[js.Any])
      
      inline def setToastInnerContainerUndefined: Self = StObject.set(x, "ToastInnerContainer", js.undefined)
    }
  }
  
  trait ToasterProps extends StObject {
    
    /** If true, the toast close icon will receive focus on mount
      and restore focus to previously focused element on unmount.
      This should only be used when there is no autoHideDuration
      and toasts for some reason have actions within them.
      Focusing alerts is bad for screenreaders! */
    var autoFocus: Boolean
    
    /** The number of milliseconds to wait before automatically dismissing a
      * notification. This behavior is disabled when the value is set to 0.*/
    var autoHideDuration: Double
    
    var children: ReactNode
    
    /** When set to true a close button is displayed and the notification can be dismissed by a user. */
    var closeable: Boolean
    
    var overrides: ToasterOverrides
    
    var placement: PlacementType
    
    /** Defines if updating a toast resets the autohide timer */
    var resetAutoHideTimerOnUpdate: js.UndefOr[Boolean] = js.undefined
    
    var usePortal: Boolean
  }
  object ToasterProps {
    
    inline def apply(
      autoFocus: Boolean,
      autoHideDuration: Double,
      closeable: Boolean,
      overrides: ToasterOverrides,
      placement: PlacementType,
      usePortal: Boolean
    ): ToasterProps = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], autoHideDuration = autoHideDuration.asInstanceOf[js.Any], closeable = closeable.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToasterProps]
    }
    
    extension [Self <: ToasterProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setResetAutoHideTimerOnUpdate(value: Boolean): Self = StObject.set(x, "resetAutoHideTimerOnUpdate", value.asInstanceOf[js.Any])
      
      inline def setResetAutoHideTimerOnUpdateUndefined: Self = StObject.set(x, "resetAutoHideTimerOnUpdate", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToasterSharedStylePropsArg extends StObject {
    
    @JSName("$placement")
    var $placement: PlacementType
  }
  object ToasterSharedStylePropsArg {
    
    inline def apply($placement: PlacementType): ToasterSharedStylePropsArg = {
      val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToasterSharedStylePropsArg]
    }
    
    extension [Self <: ToasterSharedStylePropsArg](x: Self) {
      
      inline def set$placement(value: PlacementType): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    }
  }
}
