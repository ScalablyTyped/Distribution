package typings.commandLineCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgv extends js.Object {
  var argv: js.Array[String]
  var command: String | Null
}

object AnonArgv {
  @scala.inline
  def apply(argv: js.Array[String], command: String = null): AnonArgv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgv]
  }
}

