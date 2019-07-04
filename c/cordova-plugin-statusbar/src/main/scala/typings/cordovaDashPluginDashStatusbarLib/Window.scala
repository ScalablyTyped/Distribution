package typings
package cordovaDashPluginDashStatusbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var StatusBar: cordovaDashPluginDashStatusbarLib.StatusBar = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(
    `type`: cordovaDashPluginDashStatusbarLib.cordovaDashPluginDashStatusbarLibStrings.statusTap,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(
    `type`: cordovaDashPluginDashStatusbarLib.cordovaDashPluginDashStatusbarLibStrings.statusTap,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

