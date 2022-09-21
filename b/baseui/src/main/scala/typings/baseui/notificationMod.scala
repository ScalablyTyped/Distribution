package typings.baseui

import typings.baseui.notificationNotificationMod.default
import typings.baseui.toastTypesMod.ToastPropsShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  /* Inlined std.Readonly<{ readonly info :'info',  readonly positive :'positive',  readonly warning :'warning',  readonly negative :'negative'}> */
  object KIND {
    
    @JSImport("baseui/notification", "KIND.info")
    @js.native
    val info: typings.baseui.baseuiStrings.info = js.native
    
    @JSImport("baseui/notification", "KIND.negative")
    @js.native
    val negative: typings.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/notification", "KIND.positive")
    @js.native
    val positive: typings.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/notification", "KIND.warning")
    @js.native
    val warning: typings.baseui.baseuiStrings.warning = js.native
  }
  
  @JSImport("baseui/notification", "Notification")
  @js.native
  open class Notification () extends default
  /* static members */
  object Notification {
    
    @JSImport("baseui/notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/notification", "Notification.defaultProps")
    @js.native
    def defaultProps: ToastPropsShape = js.native
    inline def defaultProps_=(x: ToastPropsShape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
