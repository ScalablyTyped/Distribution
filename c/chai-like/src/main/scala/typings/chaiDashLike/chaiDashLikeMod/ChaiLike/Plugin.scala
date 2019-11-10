package typings.chaiDashLike.chaiDashLikeMod.ChaiLike

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def assert(`object`: js.Any, expected: js.Any): Boolean
  def `match`(`object`: js.Any, expected: js.Any): Boolean
}

object Plugin {
  @scala.inline
  def apply(assert: (js.Any, js.Any) => Boolean, `match`: (js.Any, js.Any) => Boolean): Plugin = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Plugin]
  }
}

