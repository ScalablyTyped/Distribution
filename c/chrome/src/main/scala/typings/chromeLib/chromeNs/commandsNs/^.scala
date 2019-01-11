package typings
package chromeLib.chromeNs.commandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.commands")
@js.native
object ^ extends js.Object {
  var onCommand: chromeLib.chromeNs.commandsNs.CommandEvent = js.native
  def getAll(callback: js.Function1[/* commands */ js.Array[chromeLib.chromeNs.commandsNs.Command], scala.Unit]): scala.Unit = js.native
}

