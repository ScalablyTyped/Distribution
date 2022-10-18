package typings.baseui

import typings.baseui.anon.PartialToastProps
import typings.baseui.anon.PartialToasterProps
import typings.baseui.anon.Placement
import typings.baseui.anon.ToastPropskeyKey
import typings.baseui.anon.Toasts
import typings.baseui.toastTypesMod.ToastProps
import typings.baseui.toastTypesMod.ToastPropsShape
import typings.baseui.toastTypesMod.ToasterContainerState
import typings.baseui.toastTypesMod.ToasterProps
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastToasterMod {
  
  object default {
    
    @JSImport("baseui/toast/toaster", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    inline def clear(key: Key): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getRef(): js.UndefOr[ToasterContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[js.UndefOr[ToasterContainer]]
    
    inline def info(children: ReactNode): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def info(children: ReactNode, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def negative(children: ReactNode): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("negative")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def negative(children: ReactNode, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("negative")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def positive(children: ReactNode): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def positive(children: ReactNode, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("positive")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def show(children: ReactNode): js.UndefOr[Key | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Key | Null]]
    inline def show(children: ReactNode, props: ToastPropsShape): js.UndefOr[Key | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Key | Null]]
    
    inline def update(key: Key, props: PartialToastProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def warning(children: ReactNode): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def warning(children: ReactNode, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
  }
  
  @JSImport("baseui/toast/toaster", "ToasterContainer")
  @js.native
  open class ToasterContainer protected () extends Component[PartialToasterProps, ToasterContainerState, Any] {
    def this(props: ToasterProps) = this()
    
    def clear(): Unit = js.native
    def clear(key: Key): Unit = js.native
    
    def clearAll(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToasterContainer(): Unit = js.native
    
    def dismiss(key: Key): Unit = js.native
    
    def getOnCloseHandler(key: Key): js.Function0[Unit] = js.native
    def getOnCloseHandler(key: Key, onClose: js.Function0[Any]): js.Function0[Unit] = js.native
    
    def getSharedProps(): Placement = js.native
    
    def getToastProps(props: ToastProps): ToastPropskeyKey = js.native
    
    def internalOnClose(key: Key): Unit = js.native
    
    def renderToast(toastProps: ToastPropskeyKey): ReactNode = js.native
    
    def show(): Key = js.native
    def show(props: ToastProps): Key = js.native
    
    @JSName("state")
    var state_ToasterContainer: Toasts = js.native
    
    var toastId: Double = js.native
    
    def update(key: Key, props: ToastProps): Unit = js.native
  }
  /* static members */
  object ToasterContainer {
    
    @JSImport("baseui/toast/toaster", "ToasterContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/toast/toaster", "ToasterContainer.defaultProps")
    @js.native
    def defaultProps: ToasterProps = js.native
    inline def defaultProps_=(x: ToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
