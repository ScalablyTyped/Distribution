package typings.cron

import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: String
  var options: js.UndefOr[SpawnOptions] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply(command: String, args: js.Array[String] = null, options: SpawnOptions = null): AnonArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

