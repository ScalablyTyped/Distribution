package typings.baseui

import typings.baseui.toastTypesMod.ToastProps
import typings.baseui.toastTypesMod.ToastPropsShape
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationNotificationMod {
  
  @JSImport("baseui/notification/notification", JSImport.Default)
  @js.native
  open class default () extends Notification
  /* static members */
  object default {
    
    @JSImport("baseui/notification/notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/notification/notification", "default.defaultProps")
    @js.native
    def defaultProps: ToastPropsShape = js.native
    inline def defaultProps_=(x: ToastPropsShape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Notification
    extends Component[ToastProps, js.Object, Any]
}
