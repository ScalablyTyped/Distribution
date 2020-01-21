package typings.betterSqlite3.mod.BetterSqlite3

import typings.betterSqlite3.mod.ArgumentTypes
import typings.betterSqlite3.mod.VariableArgFunction
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction[F /* <: VariableArgFunction */] extends js.Object {
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def deferred(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def exclusive(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  def immediate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
}

