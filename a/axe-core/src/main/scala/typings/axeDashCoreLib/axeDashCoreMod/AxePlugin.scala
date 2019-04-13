package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxePlugin extends js.Object {
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, scala.Unit]] = js.undefined
  var commands: js.Array[axeDashCoreLib.Anon_Args]
  var id: java.lang.String
  def run(args: js.Any*): js.Any
}

object AxePlugin {
  @scala.inline
  def apply(
    commands: js.Array[axeDashCoreLib.Anon_Args],
    id: java.lang.String,
    run: /* repeated */ js.Any => js.Any,
    cleanup: /* callback */ js.Function => scala.Unit = null
  ): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands, id = id, run = js.Any.fromFunction1(run))
    if (cleanup != null) __obj.updateDynamic("cleanup")(js.Any.fromFunction1(cleanup))
    __obj.asInstanceOf[AxePlugin]
  }
}

