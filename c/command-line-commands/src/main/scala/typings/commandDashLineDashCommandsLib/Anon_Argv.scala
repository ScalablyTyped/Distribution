package typings
package commandDashLineDashCommandsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argv extends js.Object {
  var argv: js.Array[java.lang.String]
  var command: java.lang.String | scala.Null
}

object Anon_Argv {
  @scala.inline
  def apply(argv: js.Array[java.lang.String], command: java.lang.String = null): Anon_Argv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argv")(argv)
    if (command != null) __obj.updateDynamic("command")(command)
    __obj.asInstanceOf[Anon_Argv]
  }
}

