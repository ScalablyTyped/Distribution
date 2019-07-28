package typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns

import typings.betterDashSqlite3.betterDashSqlite3Mod.ArgumentTypes
import typings.betterDashSqlite3.betterDashSqlite3Mod.VariableArgFunction
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction[F /* <: VariableArgFunction */] extends js.Object {
  def apply(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def default(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def deferred(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def exclusive(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def immediate(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
}

