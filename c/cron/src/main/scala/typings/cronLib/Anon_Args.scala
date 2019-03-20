package typings
package cronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var command: java.lang.String
  var options: js.UndefOr[nodeLib.childUnderscoreProcessMod.SpawnOptions] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String] = null,
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(command = command)
    if (args != null) __obj.updateDynamic("args")(args)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Args]
  }
}

