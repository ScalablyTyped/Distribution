package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AggregateOptions extends RegistrationOptions {
  var inverse: js.UndefOr[js.Function2[/* total */ js.Any, /* dropped */ js.Any, _]] = js.undefined
  var result: js.UndefOr[js.Function1[/* total */ js.Any, _]] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
  def step(total: js.Any, next: js.Any): js.Any
}

