package typings.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaOptions extends js.Object {
  var simple: js.UndefOr[Boolean] = js.undefined
}

object PragmaOptions {
  @scala.inline
  def apply(simple: js.UndefOr[Boolean] = js.undefined): PragmaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PragmaOptions]
  }
}

