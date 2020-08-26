package typings.axeCore.mod

import typings.axeCore.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxePlugin extends js.Object {
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, Unit]] = js.native
  var commands: js.Array[Callback] = js.native
  var id: String = js.native
  def run(args: js.Any*): js.Any = js.native
}

object AxePlugin {
  @scala.inline
  def apply(commands: js.Array[Callback], id: String, run: /* repeated */ js.Any => js.Any): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[AxePlugin]
  }
  @scala.inline
  implicit class AxePluginOps[Self <: AxePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandsVarargs(value: Callback*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[Callback]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: /* repeated */ js.Any => js.Any): Self = this.set("run", js.Any.fromFunction1(value))
    @scala.inline
    def setCleanup(value: /* callback */ js.Function => Unit): Self = this.set("cleanup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCleanup: Self = this.set("cleanup", js.undefined)
  }
  
}

