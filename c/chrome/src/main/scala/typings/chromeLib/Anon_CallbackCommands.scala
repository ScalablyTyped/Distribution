package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCommands extends js.Object {
  var onCommand: chromeLib.chromeNs.commandsNs.CommandEvent
  def getAll(callback: js.Function1[/* commands */ js.Array[chromeLib.chromeNs.commandsNs.Command], scala.Unit]): scala.Unit
}

