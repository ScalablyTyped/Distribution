package typings.baseui

import typings.baseui.toastMod.ToastProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/notification", JSImport.Namespace)
@js.native
object notificationMod extends js.Object {
  @js.native
  class Notification ()
    extends Component[ToastProps, js.Object, js.Any]
  
  val KIND: typings.baseui.toastMod.KIND = js.native
}

