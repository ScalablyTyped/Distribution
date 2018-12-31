package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManager extends js.Object {
  var byName: js.Any
  var commands: js.Any
  var platform: java.lang.String
  def addCommand(command: EditorCommand): scala.Unit
  def addCommands(commands: js.Array[EditorCommand]): scala.Unit
  def exec(name: java.lang.String, editor: Editor, args: js.Any): scala.Unit
}

