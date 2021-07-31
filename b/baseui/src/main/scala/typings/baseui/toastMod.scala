package typings.baseui

import org.scalablytyped.runtime.Instantiable0
import typings.baseui.anon.Dismiss
import typings.baseui.anon.Placement
import typings.baseui.anon.ReadonlySharedStylePropsA
import typings.baseui.anon.ReadonlyToastProps
import typings.baseui.anon.ReadonlyToastPropskeyKey
import typings.baseui.anon.ReadonlyToasterProps
import typings.baseui.anon.ToastPropskeyKey
import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.baseuiStrings.warning
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Event
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("baseui/toast", "Body")
  @js.native
  val Body: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/toast", "CloseIconSvg")
  @js.native
  val CloseIconSvg: StyletronComponent[js.Any] = js.native
  
  trait KIND extends StObject {
    
    var info: typings.baseui.baseuiStrings.info
    
    var negative: typings.baseui.baseuiStrings.negative
    
    var positive: typings.baseui.baseuiStrings.positive
    
    var warning: typings.baseui.baseuiStrings.warning
  }
  object KIND {
    
    @JSImport("baseui/toast", "KIND")
    @js.native
    val ^ : KIND = js.native
    
    @scala.inline
    implicit class KINDMutableBuilder[Self <: KIND] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegative(value: negative): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositive(value: positive): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: warning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait PLACEMENT extends StObject {
    
    var bottom: typings.baseui.baseuiStrings.bottom
    
    var bottomLeft: typings.baseui.baseuiStrings.bottomLeft
    
    var bottomRight: typings.baseui.baseuiStrings.bottomRight
    
    var top: typings.baseui.baseuiStrings.top
    
    var topLeft: typings.baseui.baseuiStrings.topLeft
    
    var topRight: typings.baseui.baseuiStrings.topRight
  }
  object PLACEMENT {
    
    @JSImport("baseui/toast", "PLACEMENT")
    @js.native
    val ^ : PLACEMENT = js.native
    
    @scala.inline
    implicit class PLACEMENTMutableBuilder[Self <: PLACEMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: bottomLeft): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: bottomRight): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: topLeft): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: topRight): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/toast", "Root")
  @js.native
  val Root: StyletronComponent[js.Any] = js.native
  
  trait TYPE extends StObject {
    
    var `inline`: typings.baseui.baseuiStrings.`inline`
    
    var toast: typings.baseui.baseuiStrings.toast
  }
  object TYPE {
    
    @JSImport("baseui/toast", "TYPE")
    @js.native
    val ^ : TYPE = js.native
    
    @scala.inline
    implicit class TYPEMutableBuilder[Self <: TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: `inline`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast(value: toast): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/toast", "Toast")
  @js.native
  class Toast protected ()
    extends Component[ToastProps, ToastPrivateState, js.Any] {
    def this(props: ToastProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToastProps, context: js.Any) = this()
    
    def animateIn(): Unit = js.native
    
    def animateOut(): Unit = js.native
    
    def clearTimeout(): Unit = js.native
    
    def dismiss(): Unit = js.native
    
    def getSharedProps(): ReadonlySharedStylePropsA = js.native
    
    def onBlur(e: Event): Unit = js.native
    
    def onFocus(e: Event): Unit = js.native
    
    def onMouseEnter(e: Event): Unit = js.native
    
    def onMouseLeave(e: Event): Unit = js.native
    
    def startTimeout(): Unit = js.native
  }
  
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  class ToasterContainer protected ()
    extends Component[ReadonlyToasterProps, ToasterContainerState, js.Any] {
    def this(props: ReadonlyToasterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReadonlyToasterProps, context: js.Any) = this()
    
    def clear(key: Key): Unit = js.native
    
    def clearAll(): Unit = js.native
    
    def dismiss(key: Key): Unit = js.native
    
    def getOnCloseHandler(key: Key): js.Function0[js.Any] = js.native
    def getOnCloseHandler(key: Key, onClose: js.Function0[js.Any]): js.Function0[js.Any] = js.native
    
    def getSharedProps(): Placement = js.native
    
    def getToastProps(props: ToastProps): ReadonlyToastPropskeyKey = js.native
    
    def internalOnClose(key: Key): Unit = js.native
    
    def renderToast(toastProps: ToastPropskeyKey): ReactNode = js.native
    
    def show(props: ToastProps): Key = js.native
    
    def update(key: Key, props: ToastProps): Unit = js.native
  }
  
  @JSImport("baseui/toast", "toaster")
  @js.native
  val toaster: IToaster = js.native
  
  trait IToaster extends StObject {
    
    def clear(key: Key): Unit
    
    def getRef(): Ref[Instantiable0[ToasterContainer]]
    
    def info(children: ReactNode, props: ReadonlyToastProps): Key
    
    def negative(children: ReactNode, props: ReadonlyToastProps): Key
    
    def positive(children: ReactNode, props: ReadonlyToastProps): Key
    
    def show(children: ReactNode, props: ReadonlyToastProps): Key
    
    def update(key: Key, props: ReadonlyToastProps): Unit
    
    def warning(children: ReactNode, props: ReadonlyToastProps): Key
  }
  object IToaster {
    
    @scala.inline
    def apply(
      clear: Key => Unit,
      getRef: () => Ref[Instantiable0[ToasterContainer]],
      info: (ReactNode, ReadonlyToastProps) => Key,
      negative: (ReactNode, ReadonlyToastProps) => Key,
      positive: (ReactNode, ReadonlyToastProps) => Key,
      show: (ReactNode, ReadonlyToastProps) => Key,
      update: (Key, ReadonlyToastProps) => Unit,
      warning: (ReactNode, ReadonlyToastProps) => Key
    ): IToaster = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
      __obj.asInstanceOf[IToaster]
    }
    
    @scala.inline
    implicit class IToasterMutableBuilder[Self <: IToaster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: Key => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRef(value: () => Ref[Instantiable0[ToasterContainer]]): Self = StObject.set(x, "getRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInfo(value: (ReactNode, ReadonlyToastProps) => Key): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNegative(value: (ReactNode, ReadonlyToastProps) => Key): Self = StObject.set(x, "negative", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPositive(value: (ReactNode, ReadonlyToastProps) => Key): Self = StObject.set(x, "positive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShow(value: (ReactNode, ReadonlyToastProps) => Key): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: (Key, ReadonlyToastProps) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarning(value: (ReactNode, ReadonlyToastProps) => Key): Self = StObject.set(x, "warning", js.Any.fromFunction2(value))
    }
  }
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$closeable")
    var $closeable: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isRendered")
    var $isRendered: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isVisible")
    var $isVisible: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$kind")
    var $kind: js.UndefOr[info | positive | warning | negative] = js.undefined
    
    @JSName("$type")
    var $type: js.UndefOr[`inline` | toast] = js.undefined
  }
  object SharedStylePropsArg {
    
    @scala.inline
    def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    @scala.inline
    implicit class SharedStylePropsArgMutableBuilder[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
      
      @scala.inline
      def set$isRendered(value: Boolean): Self = StObject.set(x, "$isRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isRenderedUndefined: Self = StObject.set(x, "$isRendered", js.undefined)
      
      @scala.inline
      def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
      
      @scala.inline
      def set$kind(value: info | positive | warning | negative): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
      
      @scala.inline
      def set$type(value: `inline` | toast): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
    }
  }
  
  trait ToastOverrides extends StObject {
    
    var Body: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
    
    var CloseIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
    
    var InnerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
  }
  object ToastOverrides {
    
    @scala.inline
    def apply(): ToastOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOverrides]
    }
    
    @scala.inline
    implicit class ToastOverridesMutableBuilder[Self <: ToastOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setCloseIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "CloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "CloseIcon", js.undefined)
      
      @scala.inline
      def setInnerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "InnerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainerUndefined: Self = StObject.set(x, "InnerContainer", js.undefined)
    }
  }
  
  trait ToastPrivateState extends StObject {
    
    var isRendered: Boolean
    
    var isVisible: Boolean
  }
  object ToastPrivateState {
    
    @scala.inline
    def apply(isRendered: Boolean, isVisible: Boolean): ToastPrivateState = {
      val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastPrivateState]
    }
    
    @scala.inline
    implicit class ToastPrivateStateMutableBuilder[Self <: ToastPrivateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToastProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoHideDuration: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactNode]) | ReactNode] = js.undefined
    
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var kind: js.UndefOr[info | positive | warning | negative] = js.undefined
    
    var notificationType: js.UndefOr[`inline` | toast] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[ToastOverrides] = js.undefined
  }
  object ToastProps {
    
    @scala.inline
    def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    @scala.inline
    implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
      
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
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: info | positive | warning | negative): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setNotificationType(value: `inline` | toast): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ Event => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ Event => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* e */ Event => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* e */ Event => js.Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait ToasterContainerState extends StObject {
    
    var isMounted: Boolean
    
    var toasts: ReadonlyToastProps
  }
  object ToasterContainerState {
    
    @scala.inline
    def apply(isMounted: Boolean, toasts: ReadonlyToastProps): ToasterContainerState = {
      val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToasterContainerState]
    }
    
    @scala.inline
    implicit class ToasterContainerStateMutableBuilder[Self <: ToasterContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToasts(value: ReadonlyToastProps): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToasterOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
      ] = js.undefined
    
    var ToastBody: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
    
    var ToastCloseIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
  }
  object ToasterOverrides {
    
    @scala.inline
    def apply(): ToasterOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterOverrides]
    }
    
    @scala.inline
    implicit class ToasterOverridesMutableBuilder[Self <: ToasterOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setToastBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "ToastBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastBodyUndefined: Self = StObject.set(x, "ToastBody", js.undefined)
      
      @scala.inline
      def setToastCloseIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "ToastCloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastCloseIconUndefined: Self = StObject.set(x, "ToastCloseIcon", js.undefined)
    }
  }
  
  trait ToasterProps extends StObject {
    
    var autoHideDuration: js.UndefOr[Double] = js.undefined
    
    var overrides: js.UndefOr[ToasterOverrides] = js.undefined
    
    var placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object ToasterProps {
    
    @scala.inline
    def apply(): ToasterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterProps]
    }
    
    @scala.inline
    implicit class ToasterPropsMutableBuilder[Self <: ToasterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      @scala.inline
      def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPlacement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  trait ToasterSharedStylePropsArg extends StObject {
    
    @JSName("$placement")
    var $placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
  }
  object ToasterSharedStylePropsArg {
    
    @scala.inline
    def apply(): ToasterSharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterSharedStylePropsArg]
    }
    
    @scala.inline
    implicit class ToasterSharedStylePropsArgMutableBuilder[Self <: ToasterSharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
    }
  }
}
