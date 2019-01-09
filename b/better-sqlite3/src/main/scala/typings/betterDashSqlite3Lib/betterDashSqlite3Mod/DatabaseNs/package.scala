package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DatabaseNs {
  type ColumnDefinition = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.ColumnDefinition
  type Database = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Database
  type Integer = (js.Function1[
    /* val */ integerLib.integerMod.IntegerNs.IntLike, 
    integerLib.integerMod.IntegerNs.IntClass
  ]) with betterDashSqlite3Lib.Anon_DefaultVal
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    betterDashSqlite3Lib.betterDashSqlite3Mod.SqliteError
  ]
  type Statement = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Statement
  type Transaction = betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns.Transaction
}
