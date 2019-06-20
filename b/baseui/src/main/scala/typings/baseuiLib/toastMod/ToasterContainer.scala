package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "ToasterContainer")
@js.native
class ToasterContainer ()
  extends reactLib.reactMod.Component[ToasterProps, ToasterContainerState, js.Any] {
  def clear(key: reactLib.reactMod.Key): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def dismiss(key: reactLib.reactMod.Key): scala.Unit = js.native
  def getOnCloseHandler(key: reactLib.reactMod.Key): js.Function0[_] = js.native
  def getOnCloseHandler(key: reactLib.reactMod.Key, onClose: js.Function0[_]): js.Function0[_] = js.native
  def getSharedProps(): baseuiLib.Anon_Bottom = js.native
  def getToastProps(props: ToastProps): ToastProps with baseuiLib.Anon_Key = js.native
  def internalOnClose(key: reactLib.reactMod.Key): scala.Unit = js.native
  def renderToast(toastProps: ToastProps with baseuiLib.Anon_Key): reactLib.reactMod.ReactNode = js.native
  def show(props: ToastProps): reactLib.reactMod.Key = js.native
  def update(key: reactLib.reactMod.Key, props: ToastProps): scala.Unit = js.native
}

