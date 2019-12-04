package typings.baseui.toastMod

import typings.react.reactMod.Component
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "Toast")
@js.native
class Toast ()
  extends Component[ToastProps, ToastPrivateState, js.Any] {
  def animateIn(): Unit = js.native
  def animateOut(): Unit = js.native
  def clearTimeout(): Unit = js.native
  def dismiss(): Unit = js.native
  def getSharedProps(): SharedStylePropsArg = js.native
  def onBlur(e: Event): Unit = js.native
  def onFocus(e: Event): Unit = js.native
  def onMouseEnter(e: Event): Unit = js.native
  def onMouseLeave(e: Event): Unit = js.native
  def startTimeout(): Unit = js.native
}

