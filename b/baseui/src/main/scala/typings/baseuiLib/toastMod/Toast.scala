package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "Toast")
@js.native
class Toast ()
  extends reactLib.reactMod.Component[ToastProps, ToastPrivateState, js.Any] {
  def animateIn(): scala.Unit = js.native
  def animateOut(): scala.Unit = js.native
  def clearTimeout(): scala.Unit = js.native
  def dismiss(): scala.Unit = js.native
  def getSharedProps(): stdLib.Readonly[SharedStylePropsArg] = js.native
  def onBlur(e: stdLib.Event): scala.Unit = js.native
  def onFocus(e: stdLib.Event): scala.Unit = js.native
  def onMouseEnter(e: stdLib.Event): scala.Unit = js.native
  def onMouseLeave(e: stdLib.Event): scala.Unit = js.native
  def startTimeout(): scala.Unit = js.native
}

