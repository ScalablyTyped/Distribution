package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var database: Database = js.native
  var source: java.lang.String = js.native
  def bind(params: js.Any*): this.type = js.native
  def run(params: js.Any*): RunResult = js.native
  def safeIntegers(): this.type = js.native
  def safeIntegers(toggleState: scala.Boolean): this.type = js.native
}

