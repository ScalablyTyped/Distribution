package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns

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
  def aggregate(name: java.lang.String, options: betterDashSqlite3Lib.betterDashSqlite3Mod.AggregateOptions): this.type = js.native
  def backup(destinationFile: java.lang.String): js.Promise[betterDashSqlite3Lib.betterDashSqlite3Mod.BackupMetadata] = js.native
  def backup(
    destinationFile: java.lang.String,
    options: betterDashSqlite3Lib.betterDashSqlite3Mod.BackupOptions
  ): js.Promise[betterDashSqlite3Lib.betterDashSqlite3Mod.BackupMetadata] = js.native
  def checkpoint(): this.type = js.native
  def checkpoint(databaseName: java.lang.String): this.type = js.native
  def close(): this.type = js.native
  def defaultSafeIntegers(): this.type = js.native
  def defaultSafeIntegers(toggleState: scala.Boolean): this.type = js.native
  def exec(source: java.lang.String): this.type = js.native
  def function(name: java.lang.String, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def function(
    name: java.lang.String,
    options: betterDashSqlite3Lib.betterDashSqlite3Mod.RegistrationOptions,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): this.type = js.native
  def loadExtension(path: java.lang.String): this.type = js.native
  def pragma(source: java.lang.String): js.Any = js.native
  def pragma(source: java.lang.String, options: betterDashSqlite3Lib.betterDashSqlite3Mod.PragmaOptions): js.Any = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def prepare[BindParameters /* <: js.Array[_] | js.Object */](source: java.lang.String): Statement[js.Array[BindParameters] | BindParameters] = js.native
  def transaction[F /* <: betterDashSqlite3Lib.betterDashSqlite3Mod.VariableArgFunction */](fn: F): Transaction[F] = js.native
}

