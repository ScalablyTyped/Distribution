package typings.baseui

import typings.baseui.toastMod.ToastProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("baseui/notification", "KIND")
  @js.native
  val KIND: typings.baseui.toastMod.KIND = js.native
  
  @JSImport("baseui/notification", "Notification")
  @js.native
  class Notification protected ()
    extends Component[ToastProps, js.Object, js.Any] {
    def this(props: ToastProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToastProps, context: js.Any) = this()
  }
}
