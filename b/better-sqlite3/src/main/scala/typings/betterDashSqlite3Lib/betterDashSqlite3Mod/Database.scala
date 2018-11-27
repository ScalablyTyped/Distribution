package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var inTransaction: scala.Boolean = js.native
  var memory: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var open: scala.Boolean = js.native
  var readonly: scala.Boolean = js.native
  def checkpoint(): this.type = js.native
  def checkpoint(databaseName: java.lang.String): this.type = js.native
  def close(): this.type = js.native
  def defaultSafeIntegers(): this.type = js.native
  def defaultSafeIntegers(toggleState: scala.Boolean): this.type = js.native
  def exec(source: java.lang.String): this.type = js.native
  def pragma(source: java.lang.String): js.Any = js.native
  def pragma(source: java.lang.String, simplify: scala.Boolean): js.Any = js.native
  def prepare(source: java.lang.String): Statement = js.native
  def register(cb: js.Function1[/* repeated */js.Any, _]): this.type = js.native
  def register(
    options: betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs.RegistrationOptions,
    cb: js.Function1[/* repeated */js.Any, _]
  ): this.type = js.native
  def transaction(sources: js.Array[java.lang.String]): Transaction = js.native
}

