package typings.commandDashLineDashCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argv extends js.Object {
  var argv: js.Array[String]
  var command: String | Null
}

object Anon_Argv {
  @scala.inline
  def apply(argv: js.Array[String], command: String = null): Anon_Argv = {
    val __obj = js.Dynamic.literal(argv = argv)
    if (command != null) __obj.updateDynamic("command")(command)
    __obj.asInstanceOf[Anon_Argv]
  }
}

