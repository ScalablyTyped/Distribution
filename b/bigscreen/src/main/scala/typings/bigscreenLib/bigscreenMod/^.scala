package typings
package bigscreenLib.bigscreenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bigscreen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val element: stdLib.Element = js.native
  val enabled: scala.Boolean = js.native
  def exit(): scala.Unit = js.native
  def onchange(element: stdLib.Element): scala.Unit = js.native
  def onenter(element: stdLib.Element): scala.Unit = js.native
  def onerror(element: stdLib.Element, reason: java.lang.String): scala.Unit = js.native
  def onexit(): scala.Unit = js.native
  def request(element: stdLib.Element): scala.Unit = js.native
  def request(element: stdLib.Element, onEnter: js.Function1[/* element */ stdLib.Element, scala.Unit]): scala.Unit = js.native
  def request(
    element: stdLib.Element,
    onEnter: js.Function1[/* element */ stdLib.Element, scala.Unit],
    onExit: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def request(
    element: stdLib.Element,
    onEnter: js.Function1[/* element */ stdLib.Element, scala.Unit],
    onExit: js.Function0[scala.Unit],
    onError: js.Function2[/* element */ stdLib.Element, /* reason */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def toggle(element: stdLib.Element): scala.Unit = js.native
  def toggle(element: stdLib.Element, onEnter: js.Function1[/* element */ stdLib.Element, scala.Unit]): scala.Unit = js.native
  def toggle(
    element: stdLib.Element,
    onEnter: js.Function1[/* element */ stdLib.Element, scala.Unit],
    onExit: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def toggle(
    element: stdLib.Element,
    onEnter: js.Function1[/* element */ stdLib.Element, scala.Unit],
    onExit: js.Function0[scala.Unit],
    onError: js.Function2[/* element */ stdLib.Element, /* reason */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def videoEnabled(video: stdLib.HTMLVideoElement): scala.Boolean = js.native
}

