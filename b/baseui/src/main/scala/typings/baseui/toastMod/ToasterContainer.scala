package typings.baseui.toastMod

import typings.baseui.AnonBottom
import typings.baseui.AnonKey
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "ToasterContainer")
@js.native
class ToasterContainer ()
  extends Component[ToasterProps, ToasterContainerState, js.Any] {
  def clear(key: Key): Unit = js.native
  def clearAll(): Unit = js.native
  def dismiss(key: Key): Unit = js.native
  def getOnCloseHandler(key: Key): js.Function0[_] = js.native
  def getOnCloseHandler(key: Key, onClose: js.Function0[_]): js.Function0[_] = js.native
  def getSharedProps(): AnonBottom = js.native
  def getToastProps(props: ToastProps): ToastProps with AnonKey = js.native
  def internalOnClose(key: Key): Unit = js.native
  def renderToast(toastProps: ToastProps with AnonKey): ReactNode = js.native
  def show(props: ToastProps): Key = js.native
  def update(key: Key, props: ToastProps): Unit = js.native
}

