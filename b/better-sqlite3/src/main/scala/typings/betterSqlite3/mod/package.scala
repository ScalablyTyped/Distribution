package typings.betterSqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentTypes[F /* <: typings.betterSqlite3.mod.VariableArgFunction */] = js.Any
  type ColumnDefinition = typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition
  type Database = typings.betterSqlite3.mod.BetterSqlite3.Database
  type Integer = (js.Function1[/* val */ typings.integer.mod.IntLike, typings.integer.mod.IntClass]) with typings.betterSqlite3.TypeofInteger
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError */ js.Object
  ]
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = typings.betterSqlite3.mod.BetterSqlite3.Statement[js.Array[BindParameters] | BindParameters]
  type Transaction = typings.betterSqlite3.mod.BetterSqlite3.Transaction[typings.betterSqlite3.mod.VariableArgFunction]
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
