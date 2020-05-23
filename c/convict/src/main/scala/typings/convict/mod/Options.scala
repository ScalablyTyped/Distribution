package typings.convict.mod

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
}

object Options {
  @scala.inline
  def apply(args: js.Array[String] = null, env: ProcessEnv = null): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

