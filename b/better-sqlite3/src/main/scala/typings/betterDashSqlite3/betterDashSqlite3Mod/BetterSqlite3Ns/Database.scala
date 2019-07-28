package typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns

import typings.betterDashSqlite3.betterDashSqlite3Mod.AggregateOptions
import typings.betterDashSqlite3.betterDashSqlite3Mod.BackupMetadata
import typings.betterDashSqlite3.betterDashSqlite3Mod.BackupOptions
import typings.betterDashSqlite3.betterDashSqlite3Mod.PragmaOptions
import typings.betterDashSqlite3.betterDashSqlite3Mod.RegistrationOptions
import typings.betterDashSqlite3.betterDashSqlite3Mod.VariableArgFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var inTransaction: Boolean = js.native
  var memory: Boolean = js.native
  var name: String = js.native
  var open: Boolean = js.native
  var readonly: Boolean = js.native
  def aggregate(name: String, options: AggregateOptions): this.type = js.native
  def backup(destinationFile: String): js.Promise[BackupMetadata] = js.native
  def backup(destinationFile: String, options: BackupOptions): js.Promise[BackupMetadata] = js.native
  def checkpoint(): this.type = js.native
  def checkpoint(databaseName: String): this.type = js.native
  def close(): this.type = js.native
  def defaultSafeIntegers(): this.type = js.native
  def defaultSafeIntegers(toggleState: Boolean): this.type = js.native
  def exec(source: String): this.type = js.native
  def function(name: String, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def function(name: String, options: RegistrationOptions, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def loadExtension(path: String): this.type = js.native
  def pragma(source: String): js.Any = js.native
  def pragma(source: String, options: PragmaOptions): js.Any = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def prepare[BindParameters /* <: js.Array[_] | js.Object */](source: String): typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns.Statement[js.Array[BindParameters] | BindParameters] = js.native
  def transaction[F /* <: VariableArgFunction */](fn: F): typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns.Transaction[F] = js.native
}

