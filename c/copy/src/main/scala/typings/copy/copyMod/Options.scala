package typings.copy.copyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var srcBase: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, srcBase: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (srcBase != null) __obj.updateDynamic("srcBase")(srcBase)
    __obj.asInstanceOf[Options]
  }
}

