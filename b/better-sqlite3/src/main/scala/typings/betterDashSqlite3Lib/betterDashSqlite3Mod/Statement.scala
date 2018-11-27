package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  var database: Database = js.native
  var returnsData: scala.Boolean = js.native
  var source: java.lang.String = js.native
  def all(params: js.Any*): js.Array[_] = js.native
  def bind(params: js.Any*): this.type = js.native
  def each(cb: js.Function1[/* row */ js.Any, scala.Unit]): scala.Unit = js.native
  def each(params: js.Any*): scala.Unit = js.native
  def each(params: js.Any, cb: js.Function1[/* row */ js.Any, scala.Unit]): scala.Unit = js.native
  def get(params: js.Any*): js.Any = js.native
  def pluck(): this.type = js.native
  def pluck(toggleState: scala.Boolean): this.type = js.native
  def run(params: js.Any*): betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs.RunResult = js.native
  def safeIntegers(): this.type = js.native
  def safeIntegers(toggleState: scala.Boolean): this.type = js.native
}

