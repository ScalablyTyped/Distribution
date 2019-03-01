package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunResult extends js.Object {
  var changes: scala.Double
  var lastInsertRowid: integerLib.integerMod.IntegerNs.IntLike
}

object RunResult {
  @scala.inline
  def apply(changes: scala.Double, lastInsertRowid: integerLib.integerMod.IntegerNs.IntLike): RunResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("lastInsertRowid")(lastInsertRowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
}

