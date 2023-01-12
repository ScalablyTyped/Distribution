package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.ActionProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmCommonPropsMod.LinkProps
import typings.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsToastToastMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
  @js.native
  open class Toast protected ()
    extends AbstractPureComponent2[ToastProps, js.Object, js.Object] {
    def this(props: ToastProps) = this()
    def this(props: ToastProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MToast(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MToast(prevProps: ToastProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToast(): Unit = js.native
    
    /* private */ var handleActionClick: Any = js.native
    
    /* private */ var handleCloseClick: Any = js.native
    
    /* private */ var maybeRenderActionButton: Any = js.native
    
    /* private */ var startTimeout: Any = js.native
    
    /* private */ var triggerDismiss: Any = js.native
  }
  /* static members */
  object Toast {
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast.defaultProps")
    @js.native
    def defaultProps: ToastProps = js.native
    inline def defaultProps_=(x: ToastProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type IToastProps = ToastProps
  
  trait ToastProps
    extends StObject
       with IProps
       with IIntentProps {
    
    /**
      * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
      * user clicks the action button. Note that the `intent` prop is ignored (the action button
      * cannot have its own intent color that might conflict with the toast's intent). Omit this
      * prop to omit the action button.
      */
    var action: js.UndefOr[ActionProps & LinkProps] = js.undefined
    
    /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
    var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /**
      * Whether to show the close button in the toast.
      *
      * @default true
      */
    var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
    
    /** Message to display in the body of the toast. */
    var message: ReactNode
    
    /**
      * Callback invoked when the toast is dismissed, either by the user or by the timeout.
      * The value of the argument indicates whether the toast was closed because the timeout expired.
      */
    var onDismiss: js.UndefOr[js.Function1[/* didTimeoutExpire */ Boolean, Unit]] = js.undefined
    
    /**
      * Milliseconds to wait before automatically dismissing toast.
      * Providing a value less than or equal to 0 will disable the timeout (this is discouraged).
      *
      * @default 5000
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ToastProps {
    
    inline def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ActionProps & LinkProps): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
      
      inline def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnDismiss(value: /* didTimeoutExpire */ Boolean => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
