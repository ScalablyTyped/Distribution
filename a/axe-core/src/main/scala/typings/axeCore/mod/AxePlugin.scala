package typings.axeCore.mod

import typings.axeCore.AnonArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxePlugin extends js.Object {
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, Unit]] = js.undefined
  var commands: js.Array[AnonArgs]
  var id: String
  def run(args: js.Any*): js.Any
}

object AxePlugin {
  @scala.inline
  def apply(
    commands: js.Array[AnonArgs],
    id: String,
    run: /* repeated */ js.Any => js.Any,
    cleanup: /* callback */ js.Function => Unit = null
  ): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    if (cleanup != null) __obj.updateDynamic("cleanup")(js.Any.fromFunction1(cleanup))
    __obj.asInstanceOf[AxePlugin]
  }
}

