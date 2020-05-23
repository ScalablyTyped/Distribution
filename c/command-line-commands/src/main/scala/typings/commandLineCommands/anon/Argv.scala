package typings.commandLineCommands.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argv extends js.Object {
  var argv: js.Array[String]
  var command: String | Null
}

object Argv {
  @scala.inline
  def apply(argv: js.Array[String], command: String = null): Argv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
}

