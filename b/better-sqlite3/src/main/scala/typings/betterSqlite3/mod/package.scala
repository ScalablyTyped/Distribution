package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ColumnDefinition = typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition

type Database = typings.betterSqlite3.mod.BetterSqlite3.Database

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  BindParameters extends std.Array<any> ? better-sqlite3.better-sqlite3.BetterSqlite3.Statement<BindParameters> : better-sqlite3.better-sqlite3.BetterSqlite3.Statement<[BindParameters]>
  }}}
  */
type Statement[BindParameters /* <: js.Array[Any] | js.Object */] = typings.betterSqlite3.mod.BetterSqlite3.Statement[BindParameters]

type Transaction[T /* <: VariableArgFunction */] = typings.betterSqlite3.mod.BetterSqlite3.Transaction[T]
