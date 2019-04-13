package typings
package betterDashSqlite3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object betterDashSqlite3Mod {
  type ColumnDefinition = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.ColumnDefinition
  type Database = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Database
  type Integer = (js.Function1[/* val */ integerLib.integerMod.IntLike, integerLib.integerMod.IntClass]) with betterDashSqlite3Lib.Anon_DefaultVal
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError */ js.Object
  ]
  type Statement = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Statement
  type Transaction = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Transaction[betterDashSqlite3Lib.VariableArgFunction]
}
