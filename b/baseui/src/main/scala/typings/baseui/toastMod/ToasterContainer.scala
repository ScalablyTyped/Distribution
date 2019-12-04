package typings.baseui.toastMod

import typings.baseui.Anon_Bottom
import typings.baseui.Anon_Key
import typings.react.reactMod.Component
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
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
  def getSharedProps(): Anon_Bottom = js.native
  def getToastProps(props: ToastProps): ToastProps with Anon_Key = js.native
  def internalOnClose(key: Key): Unit = js.native
  def renderToast(toastProps: ToastProps with Anon_Key): ReactNode = js.native
  def show(props: ToastProps): Key = js.native
  def update(key: Key, props: ToastProps): Unit = js.native
}

