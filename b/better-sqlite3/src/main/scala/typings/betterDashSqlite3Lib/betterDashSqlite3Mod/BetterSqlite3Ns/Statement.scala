package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement[BindParameters /* <: js.Array[_] */] extends js.Object {
  var database: Database = js.native
  var reader: scala.Boolean = js.native
  var source: java.lang.String = js.native
  def all(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): js.Array[_] = js.native
  def bind(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): this.type = js.native
  def columns(): js.Array[ColumnDefinition] = js.native
  def expand(): this.type = js.native
  def expand(toggleState: scala.Boolean): this.type = js.native
  def get(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): js.Any = js.native
  def iterate(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): stdLib.IterableIterator[_] = js.native
  def pluck(): this.type = js.native
  def pluck(toggleState: scala.Boolean): this.type = js.native
  def raw(): this.type = js.native
  def raw(toggleState: scala.Boolean): this.type = js.native
  def run(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
  ): betterDashSqlite3Lib.betterDashSqlite3Mod.RunResult = js.native
  def safeIntegers(): this.type = js.native
  def safeIntegers(toggleState: scala.Boolean): this.type = js.native
}

