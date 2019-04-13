package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaOptions extends js.Object {
  var simple: js.UndefOr[scala.Boolean] = js.undefined
}

object PragmaOptions {
  @scala.inline
  def apply(simple: js.UndefOr[scala.Boolean] = js.undefined): PragmaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    __obj.asInstanceOf[PragmaOptions]
  }
}

