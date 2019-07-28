package typings.cron

import typings.node.childUnderscoreProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: String
  var options: js.UndefOr[SpawnOptions] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(command: String, args: js.Array[String] = null, options: SpawnOptions = null): Anon_Args = {
    val __obj = js.Dynamic.literal(command = command)
    if (args != null) __obj.updateDynamic("args")(args)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Args]
  }
}

