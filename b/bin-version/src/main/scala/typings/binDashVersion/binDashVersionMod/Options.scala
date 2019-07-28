package typings.binDashVersion.binDashVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The arguments to pass to `binary` so that it will print its version.
  		If not specified, predefined arguments will be used for known binaries, or `['--version']` and `['version']` arguments will be tried.
  		*/
  val args: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(args: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[Options]
  }
}

