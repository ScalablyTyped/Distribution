package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.ILinkProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.toastMod.IToastProps
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toasterMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
  @js.native
  class Toaster protected ()
    extends AbstractPureComponent2[IToasterProps, IToasterState, js.Object]
       with IToaster {
    def this(props: IToasterProps) = this()
    def this(props: IToasterProps, context: js.Any) = this()
    
    var createToastOptions: js.Any = js.native
    
    def dismiss(key: String, timeoutExpired: Boolean): Unit = js.native
    
    var dismissIfAtLimit: js.Any = js.native
    
    var getDismissHandler: js.Any = js.native
    
    var getPositionClasses: js.Any = js.native
    
    var handleClose: js.Any = js.native
    
    var isNewToastKey: js.Any = js.native
    
    var renderToast: js.Any = js.native
    
    var toastId: js.Any = js.native
  }
  /* static members */
  object Toaster {
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new `Toaster` instance that can be shared around your application.
      * The `Toaster` will be rendered into a new element appended to the given container.
      */
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.create")
    @js.native
    def create(): IToaster = js.native
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.create")
    @js.native
    def create(props: js.UndefOr[scala.Nothing], container: HTMLElement): IToaster = js.native
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.create")
    @js.native
    def create(props: IToasterProps): IToaster = js.native
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.create")
    @js.native
    def create(props: IToasterProps, container: HTMLElement): IToaster = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.defaultProps")
    @js.native
    def defaultProps: IToasterProps = js.native
    @scala.inline
    def defaultProps_=(x: IToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/components/toast/toast.IToastProps & {  key :string} */
  @js.native
  trait IToastOptions extends StObject {
    
    /**
      * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
      * user clicks the action button. Note that the `intent` prop is ignored (the action button
      * cannot have its own intent color that might conflict with the toast's intent). Omit this
      * prop to omit the action button.
      */
    var action: js.UndefOr[IActionProps with ILinkProps] = js.native
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.native
    
    /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /** Visual intent color to apply to element. */
    var intent: js.UndefOr[Intent] = js.native
    
    var key: String = js.native
    
    /** Message to display in the body of the toast. */
    var message: ReactNode = js.native
    
    /**
      * Callback invoked when the toast is dismissed, either by the user or by the timeout.
      * The value of the argument indicates whether the toast was closed because the timeout expired.
      */
    var onDismiss: js.UndefOr[js.Function1[/* didTimeoutExpire */ Boolean, Unit]] = js.native
    
    /**
      * Milliseconds to wait before automatically dismissing toast.
      * Providing a value less than or equal to 0 will disable the timeout (this is discouraged).
      * @default 5000
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object IToastOptions {
    
    @scala.inline
    def apply(key: String): IToastOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToastOptions]
    }
    
    @scala.inline
    implicit class IToastOptionsMutableBuilder[Self <: IToastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: IActionProps with ILinkProps): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* didTimeoutExpire */ Boolean => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait IToaster extends StObject {
    
    /** Dismiss all toasts instantly. */
    def clear(): Unit = js.native
    
    /** Dismiss the given toast instantly. */
    def dismiss(key: String): Unit = js.native
    
    /** Returns the props for all current toasts. */
    def getToasts(): js.Array[IToastOptions] = js.native
    
    /**
      * Shows a new toast to the user, or updates an existing toast corresponding to the provided key (optional).
      *
      * Returns the unique key of the toast.
      */
    def show(props: IToastProps): String = js.native
    def show(props: IToastProps, key: String): String = js.native
  }
  
  @js.native
  trait IToasterProps extends IProps {
    
    /**
      * Whether a toast should acquire application focus when it first opens.
      * This is disabled by default so that toasts do not interrupt the user's flow.
      * Note that `enforceFocus` is always disabled for `Toaster`s.
      * @default false
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether pressing the `esc` key should clear all active toasts.
      * @default true
      */
    var canEscapeKeyClear: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum number of active toasts that can be displayed at once.
      *
      * When the limit is about to be exceeded, the oldest active toast is removed.
      * @default undefined
      */
    var maxToasts: js.UndefOr[Double] = js.native
    
    /**
      * Position of `Toaster` within its container.
      * @default Position.TOP
      */
    var position: js.UndefOr[ToasterPosition] = js.native
    
    /**
      * Whether the toaster should be rendered into a new element attached to `document.body`.
      * If `false`, then positioning will be relative to the parent element.
      *
      * This prop is ignored by `Toaster.create()` as that method always appends a new element
      * to the container.
      * @default true
      */
    var usePortal: js.UndefOr[Boolean] = js.native
  }
  object IToasterProps {
    
    @scala.inline
    def apply(): IToasterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToasterProps]
    }
    
    @scala.inline
    implicit class IToasterPropsMutableBuilder[Self <: IToasterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCanEscapeKeyClear(value: Boolean): Self = StObject.set(x, "canEscapeKeyClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyClearUndefined: Self = StObject.set(x, "canEscapeKeyClear", js.undefined)
      
      @scala.inline
      def setMaxToasts(value: Double): Self = StObject.set(x, "maxToasts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxToastsUndefined: Self = StObject.set(x, "maxToasts", js.undefined)
      
      @scala.inline
      def setPosition(value: ToasterPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  @js.native
  trait IToasterState extends StObject {
    
    var toasts: js.Array[IToastOptions] = js.native
  }
  object IToasterState {
    
    @scala.inline
    def apply(toasts: js.Array[IToastOptions]): IToasterState = {
      val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToasterState]
    }
    
    @scala.inline
    implicit class IToasterStateMutableBuilder[Self <: IToasterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToasts(value: js.Array[IToastOptions]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastsVarargs(value: IToastOptions*): Self = StObject.set(x, "toasts", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.top
    - typings.blueprintjsCore.blueprintjsCoreStrings.`top-left`
    - typings.blueprintjsCore.blueprintjsCoreStrings.`top-right`
    - typings.blueprintjsCore.blueprintjsCoreStrings.bottom
    - typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
    - typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
  */
  trait ToasterPosition extends StObject
  object ToasterPosition {
    
    @scala.inline
    def bottom: typings.blueprintjsCore.blueprintjsCoreStrings.bottom = "bottom".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.bottom]
    
    @scala.inline
    def `bottom-left`: typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`]
    
    @scala.inline
    def top: typings.blueprintjsCore.blueprintjsCoreStrings.top = "top".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.top]
    
    @scala.inline
    def `top-left`: typings.blueprintjsCore.blueprintjsCoreStrings.`top-left` = "top-left".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.blueprintjsCore.blueprintjsCoreStrings.`top-right` = "top-right".asInstanceOf[typings.blueprintjsCore.blueprintjsCoreStrings.`top-right`]
  }
}
