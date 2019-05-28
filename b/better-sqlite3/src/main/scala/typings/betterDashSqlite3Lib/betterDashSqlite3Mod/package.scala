package typings
package betterDashSqlite3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object betterDashSqlite3Mod {
  type ArgumentTypes[F /* <: VariableArgFunction */] = js.Any
  type ColumnDefinition = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.ColumnDefinition
  type Database = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Database
  type Integer = (js.Function1[/* val */ integerLib.integerMod.IntLike, integerLib.integerMod.IntClass]) with betterDashSqlite3Lib.TypeofInteger
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError */ js.Object
  ]
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Statement[js.Array[BindParameters]] | betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Statement[BindParameters]
  type Transaction = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Transaction[VariableArgFunction]
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
