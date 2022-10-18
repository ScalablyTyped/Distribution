package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  BindParameters extends std.Array<any> ? better-sqlite3.better-sqlite3.BetterSqlite3.Statement<BindParameters> : better-sqlite3.better-sqlite3.BetterSqlite3.Statement<[BindParameters]>
  }}}
  */
@js.native
trait Statement[BindParameters /* <: js.Array[Any] | js.Object */] extends StObject
