package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.ILinkProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
  @js.native
  class Toast protected ()
    extends AbstractPureComponent2[IToastProps, js.Object, js.Object] {
    def this(props: IToastProps) = this()
    def this(props: IToastProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MToast(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MToast(prevProps: IToastProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToast(): Unit = js.native
    
    var handleActionClick: js.Any = js.native
    
    var handleCloseClick: js.Any = js.native
    
    var maybeRenderActionButton: js.Any = js.native
    
    var startTimeout: js.Any = js.native
    
    var triggerDismiss: js.Any = js.native
  }
  /* static members */
  object Toast {
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast.defaultProps")
    @js.native
    def defaultProps: IToastProps = js.native
    @scala.inline
    def defaultProps_=(x: IToastProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IToastProps
    extends IProps
       with IIntentProps {
    
    /**
      * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
      * user clicks the action button. Note that the `intent` prop is ignored (the action button
      * cannot have its own intent color that might conflict with the toast's intent). Omit this
      * prop to omit the action button.
      */
    var action: js.UndefOr[IActionProps with ILinkProps] = js.native
    
    /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
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
  object IToastProps {
    
    @scala.inline
    def apply(): IToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToastProps]
    }
    
    @scala.inline
    implicit class IToastPropsMutableBuilder[Self <: IToastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: IActionProps with ILinkProps): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
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
}
